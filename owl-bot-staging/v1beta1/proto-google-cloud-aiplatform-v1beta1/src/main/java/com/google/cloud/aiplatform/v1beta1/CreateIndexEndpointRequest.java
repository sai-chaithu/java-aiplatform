// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/index_endpoint_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Request message for [IndexEndpointService.CreateIndexEndpoint][google.cloud.aiplatform.v1beta1.IndexEndpointService.CreateIndexEndpoint].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest}
 */
public final class CreateIndexEndpointRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest)
    CreateIndexEndpointRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateIndexEndpointRequest.newBuilder() to construct.
  private CreateIndexEndpointRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateIndexEndpointRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateIndexEndpointRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateIndexEndpointRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            parent_ = s;
            break;
          }
          case 18: {
            com.google.cloud.aiplatform.v1beta1.IndexEndpoint.Builder subBuilder = null;
            if (indexEndpoint_ != null) {
              subBuilder = indexEndpoint_.toBuilder();
            }
            indexEndpoint_ = input.readMessage(com.google.cloud.aiplatform.v1beta1.IndexEndpoint.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(indexEndpoint_);
              indexEndpoint_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateIndexEndpointRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateIndexEndpointRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest.class, com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The resource name of the Location to create the IndexEndpoint in.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the Location to create the IndexEndpoint in.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INDEX_ENDPOINT_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.IndexEndpoint indexEndpoint_;
  /**
   * <pre>
   * Required. The IndexEndpoint to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the indexEndpoint field is set.
   */
  @java.lang.Override
  public boolean hasIndexEndpoint() {
    return indexEndpoint_ != null;
  }
  /**
   * <pre>
   * Required. The IndexEndpoint to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The indexEndpoint.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.IndexEndpoint getIndexEndpoint() {
    return indexEndpoint_ == null ? com.google.cloud.aiplatform.v1beta1.IndexEndpoint.getDefaultInstance() : indexEndpoint_;
  }
  /**
   * <pre>
   * Required. The IndexEndpoint to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.IndexEndpointOrBuilder getIndexEndpointOrBuilder() {
    return getIndexEndpoint();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (indexEndpoint_ != null) {
      output.writeMessage(2, getIndexEndpoint());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (indexEndpoint_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getIndexEndpoint());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest other = (com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasIndexEndpoint() != other.hasIndexEndpoint()) return false;
    if (hasIndexEndpoint()) {
      if (!getIndexEndpoint()
          .equals(other.getIndexEndpoint())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasIndexEndpoint()) {
      hash = (37 * hash) + INDEX_ENDPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getIndexEndpoint().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest prototype) {
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
   * Request message for [IndexEndpointService.CreateIndexEndpoint][google.cloud.aiplatform.v1beta1.IndexEndpointService.CreateIndexEndpoint].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest)
      com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateIndexEndpointRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateIndexEndpointRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest.class, com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest.newBuilder()
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
      parent_ = "";

      if (indexEndpointBuilder_ == null) {
        indexEndpoint_ = null;
      } else {
        indexEndpoint_ = null;
        indexEndpointBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceProto.internal_static_google_cloud_aiplatform_v1beta1_CreateIndexEndpointRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest build() {
      com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest result = new com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest(this);
      result.parent_ = parent_;
      if (indexEndpointBuilder_ == null) {
        result.indexEndpoint_ = indexEndpoint_;
      } else {
        result.indexEndpoint_ = indexEndpointBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasIndexEndpoint()) {
        mergeIndexEndpoint(other.getIndexEndpoint());
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
      com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The resource name of the Location to create the IndexEndpoint in.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the Location to create the IndexEndpoint in.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the Location to create the IndexEndpoint in.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the Location to create the IndexEndpoint in.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the Location to create the IndexEndpoint in.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.IndexEndpoint indexEndpoint_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.IndexEndpoint, com.google.cloud.aiplatform.v1beta1.IndexEndpoint.Builder, com.google.cloud.aiplatform.v1beta1.IndexEndpointOrBuilder> indexEndpointBuilder_;
    /**
     * <pre>
     * Required. The IndexEndpoint to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the indexEndpoint field is set.
     */
    public boolean hasIndexEndpoint() {
      return indexEndpointBuilder_ != null || indexEndpoint_ != null;
    }
    /**
     * <pre>
     * Required. The IndexEndpoint to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The indexEndpoint.
     */
    public com.google.cloud.aiplatform.v1beta1.IndexEndpoint getIndexEndpoint() {
      if (indexEndpointBuilder_ == null) {
        return indexEndpoint_ == null ? com.google.cloud.aiplatform.v1beta1.IndexEndpoint.getDefaultInstance() : indexEndpoint_;
      } else {
        return indexEndpointBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The IndexEndpoint to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setIndexEndpoint(com.google.cloud.aiplatform.v1beta1.IndexEndpoint value) {
      if (indexEndpointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        indexEndpoint_ = value;
        onChanged();
      } else {
        indexEndpointBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The IndexEndpoint to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setIndexEndpoint(
        com.google.cloud.aiplatform.v1beta1.IndexEndpoint.Builder builderForValue) {
      if (indexEndpointBuilder_ == null) {
        indexEndpoint_ = builderForValue.build();
        onChanged();
      } else {
        indexEndpointBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The IndexEndpoint to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeIndexEndpoint(com.google.cloud.aiplatform.v1beta1.IndexEndpoint value) {
      if (indexEndpointBuilder_ == null) {
        if (indexEndpoint_ != null) {
          indexEndpoint_ =
            com.google.cloud.aiplatform.v1beta1.IndexEndpoint.newBuilder(indexEndpoint_).mergeFrom(value).buildPartial();
        } else {
          indexEndpoint_ = value;
        }
        onChanged();
      } else {
        indexEndpointBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The IndexEndpoint to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearIndexEndpoint() {
      if (indexEndpointBuilder_ == null) {
        indexEndpoint_ = null;
        onChanged();
      } else {
        indexEndpoint_ = null;
        indexEndpointBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The IndexEndpoint to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.IndexEndpoint.Builder getIndexEndpointBuilder() {
      
      onChanged();
      return getIndexEndpointFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The IndexEndpoint to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.IndexEndpointOrBuilder getIndexEndpointOrBuilder() {
      if (indexEndpointBuilder_ != null) {
        return indexEndpointBuilder_.getMessageOrBuilder();
      } else {
        return indexEndpoint_ == null ?
            com.google.cloud.aiplatform.v1beta1.IndexEndpoint.getDefaultInstance() : indexEndpoint_;
      }
    }
    /**
     * <pre>
     * Required. The IndexEndpoint to create.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.IndexEndpoint index_endpoint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.IndexEndpoint, com.google.cloud.aiplatform.v1beta1.IndexEndpoint.Builder, com.google.cloud.aiplatform.v1beta1.IndexEndpointOrBuilder> 
        getIndexEndpointFieldBuilder() {
      if (indexEndpointBuilder_ == null) {
        indexEndpointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.IndexEndpoint, com.google.cloud.aiplatform.v1beta1.IndexEndpoint.Builder, com.google.cloud.aiplatform.v1beta1.IndexEndpointOrBuilder>(
                getIndexEndpoint(),
                getParentForChildren(),
                isClean());
        indexEndpoint_ = null;
      }
      return indexEndpointBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest)
  private static final com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateIndexEndpointRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateIndexEndpointRequest>() {
    @java.lang.Override
    public CreateIndexEndpointRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateIndexEndpointRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateIndexEndpointRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateIndexEndpointRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.CreateIndexEndpointRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

