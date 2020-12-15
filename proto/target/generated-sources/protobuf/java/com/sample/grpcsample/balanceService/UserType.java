// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: balance-service.proto

package com.sample.grpcsample.balanceService;

/**
 * Protobuf enum {@code UserType}
 */
public enum UserType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FULLKYC = 0;</code>
   */
  FULLKYC(0),
  /**
   * <code>MINKYC = 1;</code>
   */
  MINKYC(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FULLKYC = 0;</code>
   */
  public static final int FULLKYC_VALUE = 0;
  /**
   * <code>MINKYC = 1;</code>
   */
  public static final int MINKYC_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static UserType valueOf(int value) {
    return forNumber(value);
  }

  public static UserType forNumber(int value) {
    switch (value) {
      case 0: return FULLKYC;
      case 1: return MINKYC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UserType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      UserType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<UserType>() {
          public UserType findValueByNumber(int number) {
            return UserType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.sample.grpcsample.balanceService.BalanceServiceOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final UserType[] VALUES = values();

  public static UserType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private UserType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:UserType)
}

