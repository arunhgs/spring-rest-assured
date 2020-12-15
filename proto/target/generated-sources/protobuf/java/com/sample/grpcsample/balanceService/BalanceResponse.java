// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: balance-service.proto

package com.sample.grpcsample.balanceService;

/**
 * Protobuf type {@code BalanceResponse}
 */
public  final class BalanceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BalanceResponse)
    BalanceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BalanceResponse.newBuilder() to construct.
  private BalanceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BalanceResponse() {
    availableBalance_ = 0;
    usedBalance_ = 0;
    accountId_ = 0;
    userName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BalanceResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            availableBalance_ = input.readInt32();
            break;
          }
          case 16: {

            usedBalance_ = input.readInt32();
            break;
          }
          case 24: {

            accountId_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            userName_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sample.grpcsample.balanceService.BalanceServiceOuterClass.internal_static_BalanceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sample.grpcsample.balanceService.BalanceServiceOuterClass.internal_static_BalanceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sample.grpcsample.balanceService.BalanceResponse.class, com.sample.grpcsample.balanceService.BalanceResponse.Builder.class);
  }

  public static final int AVAILABLE_BALANCE_FIELD_NUMBER = 1;
  private int availableBalance_;
  /**
   * <code>int32 available_balance = 1;</code>
   */
  public int getAvailableBalance() {
    return availableBalance_;
  }

  public static final int USED_BALANCE_FIELD_NUMBER = 2;
  private int usedBalance_;
  /**
   * <code>int32 used_balance = 2;</code>
   */
  public int getUsedBalance() {
    return usedBalance_;
  }

  public static final int ACCOUNT_ID_FIELD_NUMBER = 3;
  private int accountId_;
  /**
   * <code>int32 account_id = 3;</code>
   */
  public int getAccountId() {
    return accountId_;
  }

  public static final int USER_NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object userName_;
  /**
   * <code>string user_name = 4;</code>
   */
  public java.lang.String getUserName() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userName_ = s;
      return s;
    }
  }
  /**
   * <code>string user_name = 4;</code>
   */
  public com.google.protobuf.ByteString
      getUserNameBytes() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (availableBalance_ != 0) {
      output.writeInt32(1, availableBalance_);
    }
    if (usedBalance_ != 0) {
      output.writeInt32(2, usedBalance_);
    }
    if (accountId_ != 0) {
      output.writeInt32(3, accountId_);
    }
    if (!getUserNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, userName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (availableBalance_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, availableBalance_);
    }
    if (usedBalance_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, usedBalance_);
    }
    if (accountId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, accountId_);
    }
    if (!getUserNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, userName_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.sample.grpcsample.balanceService.BalanceResponse)) {
      return super.equals(obj);
    }
    com.sample.grpcsample.balanceService.BalanceResponse other = (com.sample.grpcsample.balanceService.BalanceResponse) obj;

    boolean result = true;
    result = result && (getAvailableBalance()
        == other.getAvailableBalance());
    result = result && (getUsedBalance()
        == other.getUsedBalance());
    result = result && (getAccountId()
        == other.getAccountId());
    result = result && getUserName()
        .equals(other.getUserName());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AVAILABLE_BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + getAvailableBalance();
    hash = (37 * hash) + USED_BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + getUsedBalance();
    hash = (37 * hash) + ACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAccountId();
    hash = (37 * hash) + USER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getUserName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sample.grpcsample.balanceService.BalanceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sample.grpcsample.balanceService.BalanceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sample.grpcsample.balanceService.BalanceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sample.grpcsample.balanceService.BalanceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sample.grpcsample.balanceService.BalanceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sample.grpcsample.balanceService.BalanceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sample.grpcsample.balanceService.BalanceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sample.grpcsample.balanceService.BalanceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sample.grpcsample.balanceService.BalanceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sample.grpcsample.balanceService.BalanceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sample.grpcsample.balanceService.BalanceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sample.grpcsample.balanceService.BalanceResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.sample.grpcsample.balanceService.BalanceResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code BalanceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BalanceResponse)
      com.sample.grpcsample.balanceService.BalanceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sample.grpcsample.balanceService.BalanceServiceOuterClass.internal_static_BalanceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sample.grpcsample.balanceService.BalanceServiceOuterClass.internal_static_BalanceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sample.grpcsample.balanceService.BalanceResponse.class, com.sample.grpcsample.balanceService.BalanceResponse.Builder.class);
    }

    // Construct using com.sample.grpcsample.balanceService.BalanceResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      availableBalance_ = 0;

      usedBalance_ = 0;

      accountId_ = 0;

      userName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sample.grpcsample.balanceService.BalanceServiceOuterClass.internal_static_BalanceResponse_descriptor;
    }

    @java.lang.Override
    public com.sample.grpcsample.balanceService.BalanceResponse getDefaultInstanceForType() {
      return com.sample.grpcsample.balanceService.BalanceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.sample.grpcsample.balanceService.BalanceResponse build() {
      com.sample.grpcsample.balanceService.BalanceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sample.grpcsample.balanceService.BalanceResponse buildPartial() {
      com.sample.grpcsample.balanceService.BalanceResponse result = new com.sample.grpcsample.balanceService.BalanceResponse(this);
      result.availableBalance_ = availableBalance_;
      result.usedBalance_ = usedBalance_;
      result.accountId_ = accountId_;
      result.userName_ = userName_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.sample.grpcsample.balanceService.BalanceResponse) {
        return mergeFrom((com.sample.grpcsample.balanceService.BalanceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sample.grpcsample.balanceService.BalanceResponse other) {
      if (other == com.sample.grpcsample.balanceService.BalanceResponse.getDefaultInstance()) return this;
      if (other.getAvailableBalance() != 0) {
        setAvailableBalance(other.getAvailableBalance());
      }
      if (other.getUsedBalance() != 0) {
        setUsedBalance(other.getUsedBalance());
      }
      if (other.getAccountId() != 0) {
        setAccountId(other.getAccountId());
      }
      if (!other.getUserName().isEmpty()) {
        userName_ = other.userName_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.sample.grpcsample.balanceService.BalanceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sample.grpcsample.balanceService.BalanceResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int availableBalance_ ;
    /**
     * <code>int32 available_balance = 1;</code>
     */
    public int getAvailableBalance() {
      return availableBalance_;
    }
    /**
     * <code>int32 available_balance = 1;</code>
     */
    public Builder setAvailableBalance(int value) {
      
      availableBalance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 available_balance = 1;</code>
     */
    public Builder clearAvailableBalance() {
      
      availableBalance_ = 0;
      onChanged();
      return this;
    }

    private int usedBalance_ ;
    /**
     * <code>int32 used_balance = 2;</code>
     */
    public int getUsedBalance() {
      return usedBalance_;
    }
    /**
     * <code>int32 used_balance = 2;</code>
     */
    public Builder setUsedBalance(int value) {
      
      usedBalance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 used_balance = 2;</code>
     */
    public Builder clearUsedBalance() {
      
      usedBalance_ = 0;
      onChanged();
      return this;
    }

    private int accountId_ ;
    /**
     * <code>int32 account_id = 3;</code>
     */
    public int getAccountId() {
      return accountId_;
    }
    /**
     * <code>int32 account_id = 3;</code>
     */
    public Builder setAccountId(int value) {
      
      accountId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 account_id = 3;</code>
     */
    public Builder clearAccountId() {
      
      accountId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object userName_ = "";
    /**
     * <code>string user_name = 4;</code>
     */
    public java.lang.String getUserName() {
      java.lang.Object ref = userName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_name = 4;</code>
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      java.lang.Object ref = userName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_name = 4;</code>
     */
    public Builder setUserName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user_name = 4;</code>
     */
    public Builder clearUserName() {
      
      userName_ = getDefaultInstance().getUserName();
      onChanged();
      return this;
    }
    /**
     * <code>string user_name = 4;</code>
     */
    public Builder setUserNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userName_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:BalanceResponse)
  }

  // @@protoc_insertion_point(class_scope:BalanceResponse)
  private static final com.sample.grpcsample.balanceService.BalanceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sample.grpcsample.balanceService.BalanceResponse();
  }

  public static com.sample.grpcsample.balanceService.BalanceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BalanceResponse>
      PARSER = new com.google.protobuf.AbstractParser<BalanceResponse>() {
    @java.lang.Override
    public BalanceResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BalanceResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BalanceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BalanceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sample.grpcsample.balanceService.BalanceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
