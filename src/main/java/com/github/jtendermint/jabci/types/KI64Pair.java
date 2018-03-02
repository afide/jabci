// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

/**
 * <pre>
 * Define these here for compatibility but use tmlibs/common.KI64Pair.
 * </pre>
 *
 * Protobuf type {@code com.github.jtendermint.jabci.types.KI64Pair}
 */
public  final class KI64Pair extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.jtendermint.jabci.types.KI64Pair)
    KI64PairOrBuilder {
  // Use KI64Pair.newBuilder() to construct.
  private KI64Pair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KI64Pair() {
    key_ = com.google.protobuf.ByteString.EMPTY;
    value_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private KI64Pair(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {

            key_ = input.readBytes();
            break;
          }
          case 16: {

            value_ = input.readInt64();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_KI64Pair_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_KI64Pair_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.jtendermint.jabci.types.KI64Pair.class, com.github.jtendermint.jabci.types.KI64Pair.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString key_;
  /**
   * <code>optional bytes key = 1;</code>
   */
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private long value_;
  /**
   * <code>optional int64 value = 2;</code>
   */
  public long getValue() {
    return value_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!key_.isEmpty()) {
      output.writeBytes(1, key_);
    }
    if (value_ != 0L) {
      output.writeInt64(2, value_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, key_);
    }
    if (value_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, value_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.jtendermint.jabci.types.KI64Pair)) {
      return super.equals(obj);
    }
    com.github.jtendermint.jabci.types.KI64Pair other = (com.github.jtendermint.jabci.types.KI64Pair) obj;

    boolean result = true;
    result = result && getKey()
        .equals(other.getKey());
    result = result && (getValue()
        == other.getValue());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.jtendermint.jabci.types.KI64Pair parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.KI64Pair parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.KI64Pair parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.KI64Pair parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.KI64Pair parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.KI64Pair parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.KI64Pair parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.KI64Pair parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.KI64Pair parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.KI64Pair parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.jtendermint.jabci.types.KI64Pair prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * Define these here for compatibility but use tmlibs/common.KI64Pair.
   * </pre>
   *
   * Protobuf type {@code com.github.jtendermint.jabci.types.KI64Pair}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.jtendermint.jabci.types.KI64Pair)
      com.github.jtendermint.jabci.types.KI64PairOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_KI64Pair_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_KI64Pair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.jtendermint.jabci.types.KI64Pair.class, com.github.jtendermint.jabci.types.KI64Pair.Builder.class);
    }

    // Construct using com.github.jtendermint.jabci.types.KI64Pair.newBuilder()
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
    public Builder clear() {
      super.clear();
      key_ = com.google.protobuf.ByteString.EMPTY;

      value_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_KI64Pair_descriptor;
    }

    public com.github.jtendermint.jabci.types.KI64Pair getDefaultInstanceForType() {
      return com.github.jtendermint.jabci.types.KI64Pair.getDefaultInstance();
    }

    public com.github.jtendermint.jabci.types.KI64Pair build() {
      com.github.jtendermint.jabci.types.KI64Pair result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.jtendermint.jabci.types.KI64Pair buildPartial() {
      com.github.jtendermint.jabci.types.KI64Pair result = new com.github.jtendermint.jabci.types.KI64Pair(this);
      result.key_ = key_;
      result.value_ = value_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.jtendermint.jabci.types.KI64Pair) {
        return mergeFrom((com.github.jtendermint.jabci.types.KI64Pair)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.jtendermint.jabci.types.KI64Pair other) {
      if (other == com.github.jtendermint.jabci.types.KI64Pair.getDefaultInstance()) return this;
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.getValue() != 0L) {
        setValue(other.getValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.jtendermint.jabci.types.KI64Pair parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.jtendermint.jabci.types.KI64Pair) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes key = 1;</code>
     */
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <code>optional bytes key = 1;</code>
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes key = 1;</code>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private long value_ ;
    /**
     * <code>optional int64 value = 2;</code>
     */
    public long getValue() {
      return value_;
    }
    /**
     * <code>optional int64 value = 2;</code>
     */
    public Builder setValue(long value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 value = 2;</code>
     */
    public Builder clearValue() {
      
      value_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.github.jtendermint.jabci.types.KI64Pair)
  }

  // @@protoc_insertion_point(class_scope:com.github.jtendermint.jabci.types.KI64Pair)
  private static final com.github.jtendermint.jabci.types.KI64Pair DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.jtendermint.jabci.types.KI64Pair();
  }

  public static com.github.jtendermint.jabci.types.KI64Pair getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KI64Pair>
      PARSER = new com.google.protobuf.AbstractParser<KI64Pair>() {
    public KI64Pair parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new KI64Pair(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KI64Pair> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KI64Pair> getParserForType() {
    return PARSER;
  }

  public com.github.jtendermint.jabci.types.KI64Pair getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

