// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: passbook-service.proto

package com.sample.grpcsample.passbookService;

/**
 * Protobuf type {@code PassBookDTO}
 */
public  final class PassBookDTO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PassBookDTO)
    PassBookDTOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PassBookDTO.newBuilder() to construct.
  private PassBookDTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PassBookDTO() {
    txnAmount_ = "";
    userId_ = "";
    closingBalance_ = 0;
    merchantName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PassBookDTO(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            txnAmount_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            userId_ = s;
            break;
          }
          case 24: {

            closingBalance_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            merchantName_ = s;
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
    return com.sample.grpcsample.passbookService.PassbookServiceOuterClass.internal_static_PassBookDTO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sample.grpcsample.passbookService.PassbookServiceOuterClass.internal_static_PassBookDTO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sample.grpcsample.passbookService.PassBookDTO.class, com.sample.grpcsample.passbookService.PassBookDTO.Builder.class);
  }

  public static final int TXNAMOUNT_FIELD_NUMBER = 1;
  private volatile java.lang.Object txnAmount_;
  /**
   * <code>string txnAmount = 1;</code>
   */
  public java.lang.String getTxnAmount() {
    java.lang.Object ref = txnAmount_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      txnAmount_ = s;
      return s;
    }
  }
  /**
   * <code>string txnAmount = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTxnAmountBytes() {
    java.lang.Object ref = txnAmount_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      txnAmount_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERID_FIELD_NUMBER = 2;
  private volatile java.lang.Object userId_;
  /**
   * <code>string userId = 2;</code>
   */
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string userId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLOSINGBALANCE_FIELD_NUMBER = 3;
  private int closingBalance_;
  /**
   * <code>int32 closingBalance = 3;</code>
   */
  public int getClosingBalance() {
    return closingBalance_;
  }

  public static final int MERCHANTNAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object merchantName_;
  /**
   * <code>string merchantName = 4;</code>
   */
  public java.lang.String getMerchantName() {
    java.lang.Object ref = merchantName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      merchantName_ = s;
      return s;
    }
  }
  /**
   * <code>string merchantName = 4;</code>
   */
  public com.google.protobuf.ByteString
      getMerchantNameBytes() {
    java.lang.Object ref = merchantName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      merchantName_ = b;
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
    if (!getTxnAmountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, txnAmount_);
    }
    if (!getUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userId_);
    }
    if (closingBalance_ != 0) {
      output.writeInt32(3, closingBalance_);
    }
    if (!getMerchantNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, merchantName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTxnAmountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, txnAmount_);
    }
    if (!getUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userId_);
    }
    if (closingBalance_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, closingBalance_);
    }
    if (!getMerchantNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, merchantName_);
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
    if (!(obj instanceof com.sample.grpcsample.passbookService.PassBookDTO)) {
      return super.equals(obj);
    }
    com.sample.grpcsample.passbookService.PassBookDTO other = (com.sample.grpcsample.passbookService.PassBookDTO) obj;

    boolean result = true;
    result = result && getTxnAmount()
        .equals(other.getTxnAmount());
    result = result && getUserId()
        .equals(other.getUserId());
    result = result && (getClosingBalance()
        == other.getClosingBalance());
    result = result && getMerchantName()
        .equals(other.getMerchantName());
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
    hash = (37 * hash) + TXNAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getTxnAmount().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + CLOSINGBALANCE_FIELD_NUMBER;
    hash = (53 * hash) + getClosingBalance();
    hash = (37 * hash) + MERCHANTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getMerchantName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sample.grpcsample.passbookService.PassBookDTO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sample.grpcsample.passbookService.PassBookDTO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sample.grpcsample.passbookService.PassBookDTO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sample.grpcsample.passbookService.PassBookDTO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sample.grpcsample.passbookService.PassBookDTO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sample.grpcsample.passbookService.PassBookDTO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sample.grpcsample.passbookService.PassBookDTO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sample.grpcsample.passbookService.PassBookDTO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sample.grpcsample.passbookService.PassBookDTO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sample.grpcsample.passbookService.PassBookDTO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sample.grpcsample.passbookService.PassBookDTO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sample.grpcsample.passbookService.PassBookDTO parseFrom(
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
  public static Builder newBuilder(com.sample.grpcsample.passbookService.PassBookDTO prototype) {
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
   * Protobuf type {@code PassBookDTO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PassBookDTO)
      com.sample.grpcsample.passbookService.PassBookDTOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sample.grpcsample.passbookService.PassbookServiceOuterClass.internal_static_PassBookDTO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sample.grpcsample.passbookService.PassbookServiceOuterClass.internal_static_PassBookDTO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sample.grpcsample.passbookService.PassBookDTO.class, com.sample.grpcsample.passbookService.PassBookDTO.Builder.class);
    }

    // Construct using com.sample.grpcsample.passbookService.PassBookDTO.newBuilder()
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
      txnAmount_ = "";

      userId_ = "";

      closingBalance_ = 0;

      merchantName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sample.grpcsample.passbookService.PassbookServiceOuterClass.internal_static_PassBookDTO_descriptor;
    }

    @java.lang.Override
    public com.sample.grpcsample.passbookService.PassBookDTO getDefaultInstanceForType() {
      return com.sample.grpcsample.passbookService.PassBookDTO.getDefaultInstance();
    }

    @java.lang.Override
    public com.sample.grpcsample.passbookService.PassBookDTO build() {
      com.sample.grpcsample.passbookService.PassBookDTO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sample.grpcsample.passbookService.PassBookDTO buildPartial() {
      com.sample.grpcsample.passbookService.PassBookDTO result = new com.sample.grpcsample.passbookService.PassBookDTO(this);
      result.txnAmount_ = txnAmount_;
      result.userId_ = userId_;
      result.closingBalance_ = closingBalance_;
      result.merchantName_ = merchantName_;
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
      if (other instanceof com.sample.grpcsample.passbookService.PassBookDTO) {
        return mergeFrom((com.sample.grpcsample.passbookService.PassBookDTO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sample.grpcsample.passbookService.PassBookDTO other) {
      if (other == com.sample.grpcsample.passbookService.PassBookDTO.getDefaultInstance()) return this;
      if (!other.getTxnAmount().isEmpty()) {
        txnAmount_ = other.txnAmount_;
        onChanged();
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (other.getClosingBalance() != 0) {
        setClosingBalance(other.getClosingBalance());
      }
      if (!other.getMerchantName().isEmpty()) {
        merchantName_ = other.merchantName_;
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
      com.sample.grpcsample.passbookService.PassBookDTO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sample.grpcsample.passbookService.PassBookDTO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object txnAmount_ = "";
    /**
     * <code>string txnAmount = 1;</code>
     */
    public java.lang.String getTxnAmount() {
      java.lang.Object ref = txnAmount_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        txnAmount_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string txnAmount = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTxnAmountBytes() {
      java.lang.Object ref = txnAmount_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        txnAmount_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string txnAmount = 1;</code>
     */
    public Builder setTxnAmount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      txnAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string txnAmount = 1;</code>
     */
    public Builder clearTxnAmount() {
      
      txnAmount_ = getDefaultInstance().getTxnAmount();
      onChanged();
      return this;
    }
    /**
     * <code>string txnAmount = 1;</code>
     */
    public Builder setTxnAmountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      txnAmount_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>string userId = 2;</code>
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userId = 2;</code>
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userId = 2;</code>
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string userId = 2;</code>
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private int closingBalance_ ;
    /**
     * <code>int32 closingBalance = 3;</code>
     */
    public int getClosingBalance() {
      return closingBalance_;
    }
    /**
     * <code>int32 closingBalance = 3;</code>
     */
    public Builder setClosingBalance(int value) {
      
      closingBalance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 closingBalance = 3;</code>
     */
    public Builder clearClosingBalance() {
      
      closingBalance_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object merchantName_ = "";
    /**
     * <code>string merchantName = 4;</code>
     */
    public java.lang.String getMerchantName() {
      java.lang.Object ref = merchantName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        merchantName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string merchantName = 4;</code>
     */
    public com.google.protobuf.ByteString
        getMerchantNameBytes() {
      java.lang.Object ref = merchantName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        merchantName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string merchantName = 4;</code>
     */
    public Builder setMerchantName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      merchantName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string merchantName = 4;</code>
     */
    public Builder clearMerchantName() {
      
      merchantName_ = getDefaultInstance().getMerchantName();
      onChanged();
      return this;
    }
    /**
     * <code>string merchantName = 4;</code>
     */
    public Builder setMerchantNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      merchantName_ = value;
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


    // @@protoc_insertion_point(builder_scope:PassBookDTO)
  }

  // @@protoc_insertion_point(class_scope:PassBookDTO)
  private static final com.sample.grpcsample.passbookService.PassBookDTO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sample.grpcsample.passbookService.PassBookDTO();
  }

  public static com.sample.grpcsample.passbookService.PassBookDTO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PassBookDTO>
      PARSER = new com.google.protobuf.AbstractParser<PassBookDTO>() {
    @java.lang.Override
    public PassBookDTO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PassBookDTO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PassBookDTO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PassBookDTO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sample.grpcsample.passbookService.PassBookDTO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

