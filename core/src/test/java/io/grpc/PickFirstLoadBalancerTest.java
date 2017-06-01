/*
 * Copyright 2016, gRPC Authors All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.grpc;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import com.google.common.collect.Lists;
import io.grpc.LoadBalancer.Helper;
import io.grpc.LoadBalancer.PickResult;
import io.grpc.LoadBalancer.PickSubchannelArgs;
import io.grpc.LoadBalancer.Subchannel;
import io.grpc.PickFirstBalancerFactory.PickFirstBalancer;
import io.grpc.PickFirstBalancerFactory.Picker;
import java.net.SocketAddress;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


/** Unit test for {@link PickFirstBalancerFactory}. */
@RunWith(JUnit4.class)
public class PickFirstLoadBalancerTest {
  private PickFirstBalancer loadBalancer;
  private List<EquivalentAddressGroup> servers = Lists.newArrayList();
  private List<SocketAddress> socketAddresses = Lists.newArrayList();

  private static final Attributes.Key<String> FOO = Attributes.Key.of("foo");
  private Attributes affinity = Attributes.newBuilder().set(FOO, "bar").build();

  @Captor
  private ArgumentCaptor<EquivalentAddressGroup> eagCaptor;
  @Captor
  private ArgumentCaptor<Picker> pickerCaptor;
  @Captor
  private ArgumentCaptor<Attributes> attrsCaptor;
  @Mock
  private Helper mockHelper;
  @Mock
  private Subchannel mockSubchannel;
  @Mock // This LoadBalancer doesn't use any of the arg fields, as verified in tearDown().
  private PickSubchannelArgs mockArgs;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    for (int i = 0; i < 3; i++) {
      SocketAddress addr = new FakeSocketAddress("server" + i);
      servers.add(new EquivalentAddressGroup(addr));
      socketAddresses.add(addr);
    }

    when(mockSubchannel.getAddresses()).thenThrow(new UnsupportedOperationException());
    when(mockHelper.createSubchannel(any(EquivalentAddressGroup.class), any(Attributes.class)))
        .thenReturn(mockSubchannel);

    loadBalancer = (PickFirstBalancer) PickFirstBalancerFactory.getInstance().newLoadBalancer(
        mockHelper);
  }

  @After
  public void tearDown() throws Exception {
    verifyNoMoreInteractions(mockArgs);
  }

  @Test
  public void pickAfterResolved() throws Exception {
    loadBalancer.handleResolvedAddressGroups(servers, affinity);

    verify(mockHelper).createSubchannel(eagCaptor.capture(), attrsCaptor.capture());
    verify(mockHelper).updatePicker(pickerCaptor.capture());

    assertEquals(new EquivalentAddressGroup(socketAddresses), eagCaptor.getValue());
    assertEquals(pickerCaptor.getValue().pickSubchannel(mockArgs),
        pickerCaptor.getValue().pickSubchannel(mockArgs));

    verifyNoMoreInteractions(mockHelper);
  }

  @Test
  public void pickAfterResolvedAndUnchanged() throws Exception {
    loadBalancer.handleResolvedAddressGroups(servers, affinity);
    loadBalancer.handleResolvedAddressGroups(servers, affinity);

    verify(mockHelper).createSubchannel(any(EquivalentAddressGroup.class),
        any(Attributes.class));
    verify(mockHelper).updatePicker(isA(Picker.class));
    // Updating the subchannel addresses is unnecessary, but doesn't hurt anything
    verify(mockHelper).updateSubchannelAddresses(
        eq(mockSubchannel), any(EquivalentAddressGroup.class));

    verifyNoMoreInteractions(mockHelper);
  }

  @Test
  public void pickAfterResolvedAndChanged() throws Exception {
    SocketAddress socketAddr = new FakeSocketAddress("newserver");
    List<SocketAddress> newSocketAddresses = Lists.newArrayList(socketAddr);
    List<EquivalentAddressGroup> newServers =
        Lists.newArrayList(new EquivalentAddressGroup(socketAddr));

    InOrder inOrder = inOrder(mockHelper);

    loadBalancer.handleResolvedAddressGroups(servers, affinity);
    inOrder.verify(mockHelper).createSubchannel(eagCaptor.capture(), any(Attributes.class));
    inOrder.verify(mockHelper).updatePicker(pickerCaptor.capture());
    assertEquals(socketAddresses, eagCaptor.getValue().getAddresses());
    assertEquals(mockSubchannel, pickerCaptor.getValue().pickSubchannel(mockArgs).getSubchannel());

    loadBalancer.handleResolvedAddressGroups(newServers, affinity);
    inOrder.verify(mockHelper).updateSubchannelAddresses(eq(mockSubchannel), eagCaptor.capture());
    assertEquals(newSocketAddresses, eagCaptor.getValue().getAddresses());

    verify(mockSubchannel, never()).shutdown();

    verifyNoMoreInteractions(mockHelper);
  }

  @Test
  public void stateChangeBeforeResolution() throws Exception {
    loadBalancer.handleSubchannelState(mockSubchannel,
        ConnectivityStateInfo.forNonError(ConnectivityState.READY));

    verifyNoMoreInteractions(mockHelper);
  }

  @Test
  public void pickAfterStateChangeAfterResolution() throws Exception {
    loadBalancer.handleResolvedAddressGroups(servers, affinity);
    verify(mockHelper).updatePicker(pickerCaptor.capture());
    Subchannel subchannel = pickerCaptor.getValue().pickSubchannel(mockArgs).getSubchannel();
    reset(mockHelper);

    InOrder inOrder = inOrder(mockHelper);

    Status error = Status.UNAVAILABLE.withDescription("boom!");
    loadBalancer.handleSubchannelState(subchannel,
        ConnectivityStateInfo.forTransientFailure(error));
    inOrder.verify(mockHelper).updatePicker(pickerCaptor.capture());
    assertEquals(error, pickerCaptor.getValue().pickSubchannel(mockArgs).getStatus());

    loadBalancer.handleSubchannelState(subchannel,
        ConnectivityStateInfo.forNonError(ConnectivityState.IDLE));
    inOrder.verify(mockHelper).updatePicker(pickerCaptor.capture());
    assertEquals(Status.OK, pickerCaptor.getValue().pickSubchannel(mockArgs).getStatus());

    loadBalancer.handleSubchannelState(subchannel,
        ConnectivityStateInfo.forNonError(ConnectivityState.READY));
    inOrder.verify(mockHelper).updatePicker(pickerCaptor.capture());
    assertEquals(subchannel,
        pickerCaptor.getValue().pickSubchannel(mockArgs).getSubchannel());

    verifyNoMoreInteractions(mockHelper);
  }

  @Test
  public void nameResolutionError() throws Exception {
    Status error = Status.NOT_FOUND.withDescription("nameResolutionError");
    loadBalancer.handleNameResolutionError(error);
    verify(mockHelper).updatePicker(pickerCaptor.capture());
    PickResult pickResult = pickerCaptor.getValue().pickSubchannel(mockArgs);
    assertEquals(null, pickResult.getSubchannel());
    assertEquals(error, pickResult.getStatus());
    verifyNoMoreInteractions(mockHelper);
  }

  @Test
  public void nameResolutionSuccessAfterError() throws Exception {
    InOrder inOrder = inOrder(mockHelper);

    loadBalancer.handleNameResolutionError(Status.NOT_FOUND.withDescription("nameResolutionError"));
    inOrder.verify(mockHelper).updatePicker(any(Picker.class));

    loadBalancer.handleResolvedAddressGroups(servers, affinity);
    inOrder.verify(mockHelper).createSubchannel(eq(new EquivalentAddressGroup(socketAddresses)),
        eq(Attributes.EMPTY));
    inOrder.verify(mockHelper).updatePicker(pickerCaptor.capture());

    assertEquals(mockSubchannel, pickerCaptor.getValue().pickSubchannel(mockArgs)
        .getSubchannel());

    assertEquals(pickerCaptor.getValue().pickSubchannel(mockArgs),
        pickerCaptor.getValue().pickSubchannel(mockArgs));

    verifyNoMoreInteractions(mockHelper);
  }

  @Test
  public void nameResolutionErrorWithStateChanges() throws Exception {
    InOrder inOrder = inOrder(mockHelper);

    loadBalancer.handleSubchannelState(mockSubchannel,
        ConnectivityStateInfo.forTransientFailure(Status.UNAVAILABLE));
    Status error = Status.NOT_FOUND.withDescription("nameResolutionError");
    loadBalancer.handleNameResolutionError(error);
    inOrder.verify(mockHelper).updatePicker(pickerCaptor.capture());

    PickResult pickResult = pickerCaptor.getValue().pickSubchannel(mockArgs);
    assertEquals(null, pickResult.getSubchannel());
    assertEquals(error, pickResult.getStatus());

    loadBalancer.handleSubchannelState(mockSubchannel,
        ConnectivityStateInfo.forNonError(ConnectivityState.READY));
    Status error2 = Status.NOT_FOUND.withDescription("nameResolutionError2");
    loadBalancer.handleNameResolutionError(error2);
    inOrder.verify(mockHelper).updatePicker(pickerCaptor.capture());

    pickResult = pickerCaptor.getValue().pickSubchannel(mockArgs);
    assertEquals(null, pickResult.getSubchannel());
    assertEquals(error2, pickResult.getStatus());

    verifyNoMoreInteractions(mockHelper);
  }

  private static class FakeSocketAddress extends SocketAddress {
    final String name;

    FakeSocketAddress(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return "FakeSocketAddress-" + name;
    }
  }
}
