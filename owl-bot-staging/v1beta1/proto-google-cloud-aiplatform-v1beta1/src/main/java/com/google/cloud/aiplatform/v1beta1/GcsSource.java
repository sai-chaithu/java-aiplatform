// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/io.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * The Google Cloud Storage location for the input content.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.GcsSource}
 */
public final class GcsSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.GcsSource)
    GcsSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GcsSource.newBuilder() to construct.
  private GcsSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GcsSource() {
    uris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GcsSource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GcsSource(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              uris_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            uris_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        uris_ = uris_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.IoProto.internal_static_google_cloud_aiplatform_v1beta1_GcsSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.IoProto.internal_static_google_cloud_aiplatform_v1beta1_GcsSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.GcsSource.class, com.google.cloud.aiplatform.v1beta1.GcsSource.Builder.class);
  }

  public static final int URIS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList uris_;
  /**
   * <pre>
   * Required. Google Cloud Storage URI(-s) to the input file(s). May contain
   * wildcards. For more information on wildcards, see
   * https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames.
   * </pre>
   *
   * <code>repeated string uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the uris.
   */
  public com.google.protobuf.ProtocolStringList
      getUrisList() {
    return uris_;
  }
  /**
   * <pre>
   * Required. Google Cloud Storage URI(-s) to the input file(s). May contain
   * wildcards. For more information on wildcards, see
   * https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames.
   * </pre>
   *
   * <code>repeated string uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of uris.
   */
  public int getUrisCount() {
    return uris_.size();
  }
  /**
   * <pre>
   * Required. Google Cloud Storage URI(-s) to the input file(s). May contain
   * wildcards. For more information on wildcards, see
   * https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames.
   * </pre>
   *
   * <code>repeated string uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The uris at the given index.
   */
  public java.lang.String getUris(int index) {
    return uris_.get(index);
  }
  /**
   * <pre>
   * Required. Google Cloud Storage URI(-s) to the input file(s). May contain
   * wildcards. For more information on wildcards, see
   * https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames.
   * </pre>
   *
   * <code>repeated string uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the uris at the given index.
   */
  public com.google.protobuf.ByteString
      getUrisBytes(int index) {
    return uris_.getByteString(index);
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
    for (int i = 0; i < uris_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uris_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < uris_.size(); i++) {
        dataSize += computeStringSizeNoTag(uris_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUrisList().size();
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.GcsSource)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.GcsSource other = (com.google.cloud.aiplatform.v1beta1.GcsSource) obj;

    if (!getUrisList()
        .equals(other.getUrisList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getUrisCount() > 0) {
      hash = (37 * hash) + URIS_FIELD_NUMBER;
      hash = (53 * hash) + getUrisList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.GcsSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.GcsSource parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.GcsSource prototype) {
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
   * <pre>
   * The Google Cloud Storage location for the input content.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.GcsSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.GcsSource)
      com.google.cloud.aiplatform.v1beta1.GcsSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.IoProto.internal_static_google_cloud_aiplatform_v1beta1_GcsSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.IoProto.internal_static_google_cloud_aiplatform_v1beta1_GcsSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.GcsSource.class, com.google.cloud.aiplatform.v1beta1.GcsSource.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.GcsSource.newBuilder()
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
      uris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.IoProto.internal_static_google_cloud_aiplatform_v1beta1_GcsSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.GcsSource getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.GcsSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.GcsSource build() {
      com.google.cloud.aiplatform.v1beta1.GcsSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.GcsSource buildPartial() {
      com.google.cloud.aiplatform.v1beta1.GcsSource result = new com.google.cloud.aiplatform.v1beta1.GcsSource(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        uris_ = uris_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.uris_ = uris_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1beta1.GcsSource) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.GcsSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.GcsSource other) {
      if (other == com.google.cloud.aiplatform.v1beta1.GcsSource.getDefaultInstance()) return this;
      if (!other.uris_.isEmpty()) {
        if (uris_.isEmpty()) {
          uris_ = other.uris_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureUrisIsMutable();
          uris_.addAll(other.uris_);
        }
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
      com.google.cloud.aiplatform.v1beta1.GcsSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1beta1.GcsSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList uris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureUrisIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        uris_ = new com.google.protobuf.LazyStringArrayList(uris_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URI(-s) to the input file(s). May contain
     * wildcards. For more information on wildcards, see
     * https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return A list containing the uris.
     */
    public com.google.protobuf.ProtocolStringList
        getUrisList() {
      return uris_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URI(-s) to the input file(s). May contain
     * wildcards. For more information on wildcards, see
     * https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The count of uris.
     */
    public int getUrisCount() {
      return uris_.size();
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URI(-s) to the input file(s). May contain
     * wildcards. For more information on wildcards, see
     * https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the element to return.
     * @return The uris at the given index.
     */
    public java.lang.String getUris(int index) {
      return uris_.get(index);
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URI(-s) to the input file(s). May contain
     * wildcards. For more information on wildcards, see
     * https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the value to return.
     * @return The bytes of the uris at the given index.
     */
    public com.google.protobuf.ByteString
        getUrisBytes(int index) {
      return uris_.getByteString(index);
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URI(-s) to the input file(s). May contain
     * wildcards. For more information on wildcards, see
     * https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index to set the value at.
     * @param value The uris to set.
     * @return This builder for chaining.
     */
    public Builder setUris(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureUrisIsMutable();
      uris_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URI(-s) to the input file(s). May contain
     * wildcards. For more information on wildcards, see
     * https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The uris to add.
     * @return This builder for chaining.
     */
    public Builder addUris(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureUrisIsMutable();
      uris_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URI(-s) to the input file(s). May contain
     * wildcards. For more information on wildcards, see
     * https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param values The uris to add.
     * @return This builder for chaining.
     */
    public Builder addAllUris(
        java.lang.Iterable<java.lang.String> values) {
      ensureUrisIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, uris_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URI(-s) to the input file(s). May contain
     * wildcards. For more information on wildcards, see
     * https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearUris() {
      uris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URI(-s) to the input file(s). May contain
     * wildcards. For more information on wildcards, see
     * https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames.
     * </pre>
     *
     * <code>repeated string uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes of the uris to add.
     * @return This builder for chaining.
     */
    public Builder addUrisBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureUrisIsMutable();
      uris_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.GcsSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.GcsSource)
  private static final com.google.cloud.aiplatform.v1beta1.GcsSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.GcsSource();
  }

  public static com.google.cloud.aiplatform.v1beta1.GcsSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcsSource>
      PARSER = new com.google.protobuf.AbstractParser<GcsSource>() {
    @java.lang.Override
    public GcsSource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GcsSource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GcsSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcsSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.GcsSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

