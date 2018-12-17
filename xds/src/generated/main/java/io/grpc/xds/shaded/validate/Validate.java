// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: validate/validate.proto

package io.grpc.xds.shaded.validate;

public final class Validate {
  private Validate() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(io.grpc.xds.shaded.validate.Validate.disabled);
    registry.add(io.grpc.xds.shaded.validate.Validate.required);
    registry.add(io.grpc.xds.shaded.validate.Validate.rules);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int DISABLED_FIELD_NUMBER = 919191;
  /**
   * <pre>
   * Disabled nullifies any validation rules for this message, including any
   * message fields associated with it that do support validation.
   * </pre>
   *
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      java.lang.Boolean> disabled = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int REQUIRED_FIELD_NUMBER = 919191;
  /**
   * <pre>
   * Required ensures that exactly one the field options in a oneof is set;
   * validation fails if no fields in the oneof are set.
   * </pre>
   *
   * <code>extend .google.protobuf.OneofOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.OneofOptions,
      java.lang.Boolean> required = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int RULES_FIELD_NUMBER = 919191;
  /**
   * <pre>
   * Rules specify the validations to be performed on this field. By default,
   * no validation is performed against a field.
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      io.grpc.xds.shaded.validate.FieldRules> rules = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        io.grpc.xds.shaded.validate.FieldRules.class,
        io.grpc.xds.shaded.validate.FieldRules.getDefaultInstance());
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_FieldRules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_FieldRules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_FloatRules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_FloatRules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_DoubleRules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_DoubleRules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_Int32Rules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_Int32Rules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_Int64Rules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_Int64Rules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_UInt32Rules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_UInt32Rules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_UInt64Rules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_UInt64Rules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_SInt32Rules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_SInt32Rules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_SInt64Rules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_SInt64Rules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_Fixed32Rules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_Fixed32Rules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_Fixed64Rules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_Fixed64Rules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_SFixed32Rules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_SFixed32Rules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_SFixed64Rules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_SFixed64Rules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_BoolRules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_BoolRules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_StringRules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_StringRules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_BytesRules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_BytesRules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_EnumRules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_EnumRules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_MessageRules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_MessageRules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_RepeatedRules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_RepeatedRules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_MapRules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_MapRules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_AnyRules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_AnyRules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_DurationRules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_DurationRules_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_validate_TimestampRules_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_validate_TimestampRules_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027validate/validate.proto\022\010validate\032 goo" +
      "gle/protobuf/descriptor.proto\032\036google/pr" +
      "otobuf/duration.proto\032\037google/protobuf/t" +
      "imestamp.proto\"\232\007\n\nFieldRules\022%\n\005float\030\001" +
      " \001(\0132\024.validate.FloatRulesH\000\022\'\n\006double\030\002" +
      " \001(\0132\025.validate.DoubleRulesH\000\022%\n\005int32\030\003" +
      " \001(\0132\024.validate.Int32RulesH\000\022%\n\005int64\030\004 " +
      "\001(\0132\024.validate.Int64RulesH\000\022\'\n\006uint32\030\005 " +
      "\001(\0132\025.validate.UInt32RulesH\000\022\'\n\006uint64\030\006" +
      " \001(\0132\025.validate.UInt64RulesH\000\022\'\n\006sint32\030" +
      "\007 \001(\0132\025.validate.SInt32RulesH\000\022\'\n\006sint64" +
      "\030\010 \001(\0132\025.validate.SInt64RulesH\000\022)\n\007fixed" +
      "32\030\t \001(\0132\026.validate.Fixed32RulesH\000\022)\n\007fi" +
      "xed64\030\n \001(\0132\026.validate.Fixed64RulesH\000\022+\n" +
      "\010sfixed32\030\013 \001(\0132\027.validate.SFixed32Rules" +
      "H\000\022+\n\010sfixed64\030\014 \001(\0132\027.validate.SFixed64" +
      "RulesH\000\022#\n\004bool\030\r \001(\0132\023.validate.BoolRul" +
      "esH\000\022\'\n\006string\030\016 \001(\0132\025.validate.StringRu" +
      "lesH\000\022%\n\005bytes\030\017 \001(\0132\024.validate.BytesRul" +
      "esH\000\022#\n\004enum\030\020 \001(\0132\023.validate.EnumRulesH" +
      "\000\022)\n\007message\030\021 \001(\0132\026.validate.MessageRul" +
      "esH\000\022+\n\010repeated\030\022 \001(\0132\027.validate.Repeat" +
      "edRulesH\000\022!\n\003map\030\023 \001(\0132\022.validate.MapRul" +
      "esH\000\022!\n\003any\030\024 \001(\0132\022.validate.AnyRulesH\000\022" +
      "+\n\010duration\030\025 \001(\0132\027.validate.DurationRul" +
      "esH\000\022-\n\ttimestamp\030\026 \001(\0132\030.validate.Times" +
      "tampRulesH\000B\006\n\004type\"i\n\nFloatRules\022\r\n\005con" +
      "st\030\001 \001(\002\022\n\n\002lt\030\002 \001(\002\022\013\n\003lte\030\003 \001(\002\022\n\n\002gt\030" +
      "\004 \001(\002\022\013\n\003gte\030\005 \001(\002\022\n\n\002in\030\006 \003(\002\022\016\n\006not_in" +
      "\030\007 \003(\002\"j\n\013DoubleRules\022\r\n\005const\030\001 \001(\001\022\n\n\002" +
      "lt\030\002 \001(\001\022\013\n\003lte\030\003 \001(\001\022\n\n\002gt\030\004 \001(\001\022\013\n\003gte" +
      "\030\005 \001(\001\022\n\n\002in\030\006 \003(\001\022\016\n\006not_in\030\007 \003(\001\"i\n\nIn" +
      "t32Rules\022\r\n\005const\030\001 \001(\005\022\n\n\002lt\030\002 \001(\005\022\013\n\003l" +
      "te\030\003 \001(\005\022\n\n\002gt\030\004 \001(\005\022\013\n\003gte\030\005 \001(\005\022\n\n\002in\030" +
      "\006 \003(\005\022\016\n\006not_in\030\007 \003(\005\"i\n\nInt64Rules\022\r\n\005c" +
      "onst\030\001 \001(\003\022\n\n\002lt\030\002 \001(\003\022\013\n\003lte\030\003 \001(\003\022\n\n\002g" +
      "t\030\004 \001(\003\022\013\n\003gte\030\005 \001(\003\022\n\n\002in\030\006 \003(\003\022\016\n\006not_" +
      "in\030\007 \003(\003\"j\n\013UInt32Rules\022\r\n\005const\030\001 \001(\r\022\n" +
      "\n\002lt\030\002 \001(\r\022\013\n\003lte\030\003 \001(\r\022\n\n\002gt\030\004 \001(\r\022\013\n\003g" +
      "te\030\005 \001(\r\022\n\n\002in\030\006 \003(\r\022\016\n\006not_in\030\007 \003(\r\"j\n\013" +
      "UInt64Rules\022\r\n\005const\030\001 \001(\004\022\n\n\002lt\030\002 \001(\004\022\013" +
      "\n\003lte\030\003 \001(\004\022\n\n\002gt\030\004 \001(\004\022\013\n\003gte\030\005 \001(\004\022\n\n\002" +
      "in\030\006 \003(\004\022\016\n\006not_in\030\007 \003(\004\"j\n\013SInt32Rules\022" +
      "\r\n\005const\030\001 \001(\021\022\n\n\002lt\030\002 \001(\021\022\013\n\003lte\030\003 \001(\021\022" +
      "\n\n\002gt\030\004 \001(\021\022\013\n\003gte\030\005 \001(\021\022\n\n\002in\030\006 \003(\021\022\016\n\006" +
      "not_in\030\007 \003(\021\"j\n\013SInt64Rules\022\r\n\005const\030\001 \001" +
      "(\022\022\n\n\002lt\030\002 \001(\022\022\013\n\003lte\030\003 \001(\022\022\n\n\002gt\030\004 \001(\022\022" +
      "\013\n\003gte\030\005 \001(\022\022\n\n\002in\030\006 \003(\022\022\016\n\006not_in\030\007 \003(\022" +
      "\"k\n\014Fixed32Rules\022\r\n\005const\030\001 \001(\007\022\n\n\002lt\030\002 " +
      "\001(\007\022\013\n\003lte\030\003 \001(\007\022\n\n\002gt\030\004 \001(\007\022\013\n\003gte\030\005 \001(" +
      "\007\022\n\n\002in\030\006 \003(\007\022\016\n\006not_in\030\007 \003(\007\"k\n\014Fixed64" +
      "Rules\022\r\n\005const\030\001 \001(\006\022\n\n\002lt\030\002 \001(\006\022\013\n\003lte\030" +
      "\003 \001(\006\022\n\n\002gt\030\004 \001(\006\022\013\n\003gte\030\005 \001(\006\022\n\n\002in\030\006 \003" +
      "(\006\022\016\n\006not_in\030\007 \003(\006\"l\n\rSFixed32Rules\022\r\n\005c" +
      "onst\030\001 \001(\017\022\n\n\002lt\030\002 \001(\017\022\013\n\003lte\030\003 \001(\017\022\n\n\002g" +
      "t\030\004 \001(\017\022\013\n\003gte\030\005 \001(\017\022\n\n\002in\030\006 \003(\017\022\016\n\006not_" +
      "in\030\007 \003(\017\"l\n\rSFixed64Rules\022\r\n\005const\030\001 \001(\020" +
      "\022\n\n\002lt\030\002 \001(\020\022\013\n\003lte\030\003 \001(\020\022\n\n\002gt\030\004 \001(\020\022\013\n" +
      "\003gte\030\005 \001(\020\022\n\n\002in\030\006 \003(\020\022\016\n\006not_in\030\007 \003(\020\"\032" +
      "\n\tBoolRules\022\r\n\005const\030\001 \001(\010\"\306\002\n\013StringRul" +
      "es\022\r\n\005const\030\001 \001(\t\022\017\n\007min_len\030\002 \001(\004\022\017\n\007ma" +
      "x_len\030\003 \001(\004\022\021\n\tmin_bytes\030\004 \001(\004\022\021\n\tmax_by" +
      "tes\030\005 \001(\004\022\017\n\007pattern\030\006 \001(\t\022\016\n\006prefix\030\007 \001" +
      "(\t\022\016\n\006suffix\030\010 \001(\t\022\020\n\010contains\030\t \001(\t\022\n\n\002" +
      "in\030\n \003(\t\022\016\n\006not_in\030\013 \003(\t\022\017\n\005email\030\014 \001(\010H" +
      "\000\022\022\n\010hostname\030\r \001(\010H\000\022\014\n\002ip\030\016 \001(\010H\000\022\016\n\004i" +
      "pv4\030\017 \001(\010H\000\022\016\n\004ipv6\030\020 \001(\010H\000\022\r\n\003uri\030\021 \001(\010" +
      "H\000\022\021\n\007uri_ref\030\022 \001(\010H\000B\014\n\nwell_known\"\330\001\n\n" +
      "BytesRules\022\r\n\005const\030\001 \001(\014\022\017\n\007min_len\030\002 \001" +
      "(\004\022\017\n\007max_len\030\003 \001(\004\022\017\n\007pattern\030\004 \001(\t\022\016\n\006" +
      "prefix\030\005 \001(\014\022\016\n\006suffix\030\006 \001(\014\022\020\n\010contains" +
      "\030\007 \001(\014\022\n\n\002in\030\010 \003(\014\022\016\n\006not_in\030\t \003(\014\022\014\n\002ip" +
      "\030\n \001(\010H\000\022\016\n\004ipv4\030\013 \001(\010H\000\022\016\n\004ipv6\030\014 \001(\010H\000" +
      "B\014\n\nwell_known\"L\n\tEnumRules\022\r\n\005const\030\001 \001" +
      "(\005\022\024\n\014defined_only\030\002 \001(\010\022\n\n\002in\030\003 \003(\005\022\016\n\006" +
      "not_in\030\004 \003(\005\".\n\014MessageRules\022\014\n\004skip\030\001 \001" +
      "(\010\022\020\n\010required\030\002 \001(\010\"j\n\rRepeatedRules\022\021\n" +
      "\tmin_items\030\001 \001(\004\022\021\n\tmax_items\030\002 \001(\004\022\016\n\006u" +
      "nique\030\003 \001(\010\022#\n\005items\030\004 \001(\0132\024.validate.Fi" +
      "eldRules\"\215\001\n\010MapRules\022\021\n\tmin_pairs\030\001 \001(\004" +
      "\022\021\n\tmax_pairs\030\002 \001(\004\022\021\n\tno_sparse\030\003 \001(\010\022\"" +
      "\n\004keys\030\004 \001(\0132\024.validate.FieldRules\022$\n\006va" +
      "lues\030\005 \001(\0132\024.validate.FieldRules\"8\n\010AnyR" +
      "ules\022\020\n\010required\030\001 \001(\010\022\n\n\002in\030\002 \003(\t\022\016\n\006no" +
      "t_in\030\003 \003(\t\"\273\002\n\rDurationRules\022\020\n\010required" +
      "\030\001 \001(\010\022(\n\005const\030\002 \001(\0132\031.google.protobuf." +
      "Duration\022%\n\002lt\030\003 \001(\0132\031.google.protobuf.D" +
      "uration\022&\n\003lte\030\004 \001(\0132\031.google.protobuf.D" +
      "uration\022%\n\002gt\030\005 \001(\0132\031.google.protobuf.Du" +
      "ration\022&\n\003gte\030\006 \001(\0132\031.google.protobuf.Du" +
      "ration\022%\n\002in\030\007 \003(\0132\031.google.protobuf.Dur" +
      "ation\022)\n\006not_in\030\010 \003(\0132\031.google.protobuf." +
      "Duration\"\272\002\n\016TimestampRules\022\020\n\010required\030" +
      "\001 \001(\010\022)\n\005const\030\002 \001(\0132\032.google.protobuf.T" +
      "imestamp\022&\n\002lt\030\003 \001(\0132\032.google.protobuf.T" +
      "imestamp\022\'\n\003lte\030\004 \001(\0132\032.google.protobuf." +
      "Timestamp\022&\n\002gt\030\005 \001(\0132\032.google.protobuf." +
      "Timestamp\022\'\n\003gte\030\006 \001(\0132\032.google.protobuf" +
      ".Timestamp\022\016\n\006lt_now\030\007 \001(\010\022\016\n\006gt_now\030\010 \001" +
      "(\010\022)\n\006within\030\t \001(\0132\031.google.protobuf.Dur" +
      "ation:3\n\010disabled\022\037.google.protobuf.Mess" +
      "ageOptions\030\227\2158 \001(\010:1\n\010required\022\035.google." +
      "protobuf.OneofOptions\030\227\2158 \001(\010:D\n\005rules\022\035" +
      ".google.protobuf.FieldOptions\030\227\2158 \001(\0132\024." +
      "validate.FieldRulesBM\n\033io.grpc.xds.shade" +
      "d.validateP\001Z,github.com/lyft/protoc-gen" +
      "-validate/validate"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_validate_FieldRules_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_validate_FieldRules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_FieldRules_descriptor,
        new java.lang.String[] { "Float", "Double", "Int32", "Int64", "Uint32", "Uint64", "Sint32", "Sint64", "Fixed32", "Fixed64", "Sfixed32", "Sfixed64", "Bool", "String", "Bytes", "Enum", "Message", "Repeated", "Map", "Any", "Duration", "Timestamp", "Type", });
    internal_static_validate_FloatRules_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_validate_FloatRules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_FloatRules_descriptor,
        new java.lang.String[] { "Const", "Lt", "Lte", "Gt", "Gte", "In", "NotIn", });
    internal_static_validate_DoubleRules_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_validate_DoubleRules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_DoubleRules_descriptor,
        new java.lang.String[] { "Const", "Lt", "Lte", "Gt", "Gte", "In", "NotIn", });
    internal_static_validate_Int32Rules_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_validate_Int32Rules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_Int32Rules_descriptor,
        new java.lang.String[] { "Const", "Lt", "Lte", "Gt", "Gte", "In", "NotIn", });
    internal_static_validate_Int64Rules_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_validate_Int64Rules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_Int64Rules_descriptor,
        new java.lang.String[] { "Const", "Lt", "Lte", "Gt", "Gte", "In", "NotIn", });
    internal_static_validate_UInt32Rules_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_validate_UInt32Rules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_UInt32Rules_descriptor,
        new java.lang.String[] { "Const", "Lt", "Lte", "Gt", "Gte", "In", "NotIn", });
    internal_static_validate_UInt64Rules_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_validate_UInt64Rules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_UInt64Rules_descriptor,
        new java.lang.String[] { "Const", "Lt", "Lte", "Gt", "Gte", "In", "NotIn", });
    internal_static_validate_SInt32Rules_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_validate_SInt32Rules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_SInt32Rules_descriptor,
        new java.lang.String[] { "Const", "Lt", "Lte", "Gt", "Gte", "In", "NotIn", });
    internal_static_validate_SInt64Rules_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_validate_SInt64Rules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_SInt64Rules_descriptor,
        new java.lang.String[] { "Const", "Lt", "Lte", "Gt", "Gte", "In", "NotIn", });
    internal_static_validate_Fixed32Rules_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_validate_Fixed32Rules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_Fixed32Rules_descriptor,
        new java.lang.String[] { "Const", "Lt", "Lte", "Gt", "Gte", "In", "NotIn", });
    internal_static_validate_Fixed64Rules_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_validate_Fixed64Rules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_Fixed64Rules_descriptor,
        new java.lang.String[] { "Const", "Lt", "Lte", "Gt", "Gte", "In", "NotIn", });
    internal_static_validate_SFixed32Rules_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_validate_SFixed32Rules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_SFixed32Rules_descriptor,
        new java.lang.String[] { "Const", "Lt", "Lte", "Gt", "Gte", "In", "NotIn", });
    internal_static_validate_SFixed64Rules_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_validate_SFixed64Rules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_SFixed64Rules_descriptor,
        new java.lang.String[] { "Const", "Lt", "Lte", "Gt", "Gte", "In", "NotIn", });
    internal_static_validate_BoolRules_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_validate_BoolRules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_BoolRules_descriptor,
        new java.lang.String[] { "Const", });
    internal_static_validate_StringRules_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_validate_StringRules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_StringRules_descriptor,
        new java.lang.String[] { "Const", "MinLen", "MaxLen", "MinBytes", "MaxBytes", "Pattern", "Prefix", "Suffix", "Contains", "In", "NotIn", "Email", "Hostname", "Ip", "Ipv4", "Ipv6", "Uri", "UriRef", "WellKnown", });
    internal_static_validate_BytesRules_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_validate_BytesRules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_BytesRules_descriptor,
        new java.lang.String[] { "Const", "MinLen", "MaxLen", "Pattern", "Prefix", "Suffix", "Contains", "In", "NotIn", "Ip", "Ipv4", "Ipv6", "WellKnown", });
    internal_static_validate_EnumRules_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_validate_EnumRules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_EnumRules_descriptor,
        new java.lang.String[] { "Const", "DefinedOnly", "In", "NotIn", });
    internal_static_validate_MessageRules_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_validate_MessageRules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_MessageRules_descriptor,
        new java.lang.String[] { "Skip", "Required", });
    internal_static_validate_RepeatedRules_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_validate_RepeatedRules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_RepeatedRules_descriptor,
        new java.lang.String[] { "MinItems", "MaxItems", "Unique", "Items", });
    internal_static_validate_MapRules_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_validate_MapRules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_MapRules_descriptor,
        new java.lang.String[] { "MinPairs", "MaxPairs", "NoSparse", "Keys", "Values", });
    internal_static_validate_AnyRules_descriptor =
      getDescriptor().getMessageTypes().get(20);
    internal_static_validate_AnyRules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_AnyRules_descriptor,
        new java.lang.String[] { "Required", "In", "NotIn", });
    internal_static_validate_DurationRules_descriptor =
      getDescriptor().getMessageTypes().get(21);
    internal_static_validate_DurationRules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_DurationRules_descriptor,
        new java.lang.String[] { "Required", "Const", "Lt", "Lte", "Gt", "Gte", "In", "NotIn", });
    internal_static_validate_TimestampRules_descriptor =
      getDescriptor().getMessageTypes().get(22);
    internal_static_validate_TimestampRules_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_validate_TimestampRules_descriptor,
        new java.lang.String[] { "Required", "Const", "Lt", "Lte", "Gt", "Gte", "LtNow", "GtNow", "Within", });
    disabled.internalInit(descriptor.getExtensions().get(0));
    required.internalInit(descriptor.getExtensions().get(1));
    rules.internalInit(descriptor.getExtensions().get(2));
    com.google.protobuf.DescriptorProtos.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
