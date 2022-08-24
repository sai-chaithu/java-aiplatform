/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/index_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for [IndexService.UpsertDatapoints][google.cloud.aiplatform.v1beta1.IndexService.UpsertDatapoints]
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest}
 */
public final class UpsertDatapointsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest)
    UpsertDatapointsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpsertDatapointsRequest.newBuilder() to construct.
  private UpsertDatapointsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpsertDatapointsRequest() {
    index_ = "";
    datapoints_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpsertDatapointsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpsertDatapointsRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              index_ = s;
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                datapoints_ =
                    new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.IndexDatapoint>();
                mutable_bitField0_ |= 0x00000001;
              }
              datapoints_.add(
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.IndexDatapoint.parser(),
                      extensionRegistry));
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        datapoints_ = java.util.Collections.unmodifiableList(datapoints_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.IndexServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_UpsertDatapointsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.IndexServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_UpsertDatapointsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest.class,
            com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest.Builder.class);
  }

  public static final int INDEX_FIELD_NUMBER = 1;
  private volatile java.lang.Object index_;
  /**
   *
   *
   * <pre>
   * Required. The name of the Index resource to be updated.
   * Format:
   * `projects/{project}/locations/{location}/indexes/{index}`
   * </pre>
   *
   * <code>
   * string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The index.
   */
  @java.lang.Override
  public java.lang.String getIndex() {
    java.lang.Object ref = index_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      index_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the Index resource to be updated.
   * Format:
   * `projects/{project}/locations/{location}/indexes/{index}`
   * </pre>
   *
   * <code>
   * string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for index.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIndexBytes() {
    java.lang.Object ref = index_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      index_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATAPOINTS_FIELD_NUMBER = 2;
  private java.util.List<com.google.cloud.aiplatform.v1beta1.IndexDatapoint> datapoints_;
  /**
   *
   *
   * <pre>
   * A list of datapoints to be created/updated.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.IndexDatapoint> getDatapointsList() {
    return datapoints_;
  }
  /**
   *
   *
   * <pre>
   * A list of datapoints to be created/updated.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.IndexDatapointOrBuilder>
      getDatapointsOrBuilderList() {
    return datapoints_;
  }
  /**
   *
   *
   * <pre>
   * A list of datapoints to be created/updated.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
   */
  @java.lang.Override
  public int getDatapointsCount() {
    return datapoints_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of datapoints to be created/updated.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.IndexDatapoint getDatapoints(int index) {
    return datapoints_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of datapoints to be created/updated.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.IndexDatapointOrBuilder getDatapointsOrBuilder(
      int index) {
    return datapoints_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(index_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, index_);
    }
    for (int i = 0; i < datapoints_.size(); i++) {
      output.writeMessage(2, datapoints_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(index_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, index_);
    }
    for (int i = 0; i < datapoints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, datapoints_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest other =
        (com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest) obj;

    if (!getIndex().equals(other.getIndex())) return false;
    if (!getDatapointsList().equals(other.getDatapointsList())) return false;
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
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getIndex().hashCode();
    if (getDatapointsCount() > 0) {
      hash = (37 * hash) + DATAPOINTS_FIELD_NUMBER;
      hash = (53 * hash) + getDatapointsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for [IndexService.UpsertDatapoints][google.cloud.aiplatform.v1beta1.IndexService.UpsertDatapoints]
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest)
      com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.IndexServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UpsertDatapointsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.IndexServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UpsertDatapointsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest.class,
              com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDatapointsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      index_ = "";

      if (datapointsBuilder_ == null) {
        datapoints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        datapointsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.IndexServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UpsertDatapointsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest build() {
      com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest result =
          new com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest(this);
      int from_bitField0_ = bitField0_;
      result.index_ = index_;
      if (datapointsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          datapoints_ = java.util.Collections.unmodifiableList(datapoints_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.datapoints_ = datapoints_;
      } else {
        result.datapoints_ = datapointsBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest.getDefaultInstance())
        return this;
      if (!other.getIndex().isEmpty()) {
        index_ = other.index_;
        onChanged();
      }
      if (datapointsBuilder_ == null) {
        if (!other.datapoints_.isEmpty()) {
          if (datapoints_.isEmpty()) {
            datapoints_ = other.datapoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDatapointsIsMutable();
            datapoints_.addAll(other.datapoints_);
          }
          onChanged();
        }
      } else {
        if (!other.datapoints_.isEmpty()) {
          if (datapointsBuilder_.isEmpty()) {
            datapointsBuilder_.dispose();
            datapointsBuilder_ = null;
            datapoints_ = other.datapoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
            datapointsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDatapointsFieldBuilder()
                    : null;
          } else {
            datapointsBuilder_.addAllMessages(other.datapoints_);
          }
        }
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
      com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object index_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the Index resource to be updated.
     * Format:
     * `projects/{project}/locations/{location}/indexes/{index}`
     * </pre>
     *
     * <code>
     * string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The index.
     */
    public java.lang.String getIndex() {
      java.lang.Object ref = index_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        index_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Index resource to be updated.
     * Format:
     * `projects/{project}/locations/{location}/indexes/{index}`
     * </pre>
     *
     * <code>
     * string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for index.
     */
    public com.google.protobuf.ByteString getIndexBytes() {
      java.lang.Object ref = index_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        index_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Index resource to be updated.
     * Format:
     * `projects/{project}/locations/{location}/indexes/{index}`
     * </pre>
     *
     * <code>
     * string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The index to set.
     * @return This builder for chaining.
     */
    public Builder setIndex(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      index_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Index resource to be updated.
     * Format:
     * `projects/{project}/locations/{location}/indexes/{index}`
     * </pre>
     *
     * <code>
     * string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIndex() {

      index_ = getDefaultInstance().getIndex();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Index resource to be updated.
     * Format:
     * `projects/{project}/locations/{location}/indexes/{index}`
     * </pre>
     *
     * <code>
     * string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for index to set.
     * @return This builder for chaining.
     */
    public Builder setIndexBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      index_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.aiplatform.v1beta1.IndexDatapoint> datapoints_ =
        java.util.Collections.emptyList();

    private void ensureDatapointsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        datapoints_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.IndexDatapoint>(
                datapoints_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.IndexDatapoint,
            com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder,
            com.google.cloud.aiplatform.v1beta1.IndexDatapointOrBuilder>
        datapointsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.IndexDatapoint> getDatapointsList() {
      if (datapointsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(datapoints_);
      } else {
        return datapointsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public int getDatapointsCount() {
      if (datapointsBuilder_ == null) {
        return datapoints_.size();
      } else {
        return datapointsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.IndexDatapoint getDatapoints(int index) {
      if (datapointsBuilder_ == null) {
        return datapoints_.get(index);
      } else {
        return datapointsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public Builder setDatapoints(
        int index, com.google.cloud.aiplatform.v1beta1.IndexDatapoint value) {
      if (datapointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatapointsIsMutable();
        datapoints_.set(index, value);
        onChanged();
      } else {
        datapointsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public Builder setDatapoints(
        int index, com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder builderForValue) {
      if (datapointsBuilder_ == null) {
        ensureDatapointsIsMutable();
        datapoints_.set(index, builderForValue.build());
        onChanged();
      } else {
        datapointsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public Builder addDatapoints(com.google.cloud.aiplatform.v1beta1.IndexDatapoint value) {
      if (datapointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatapointsIsMutable();
        datapoints_.add(value);
        onChanged();
      } else {
        datapointsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public Builder addDatapoints(
        int index, com.google.cloud.aiplatform.v1beta1.IndexDatapoint value) {
      if (datapointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatapointsIsMutable();
        datapoints_.add(index, value);
        onChanged();
      } else {
        datapointsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public Builder addDatapoints(
        com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder builderForValue) {
      if (datapointsBuilder_ == null) {
        ensureDatapointsIsMutable();
        datapoints_.add(builderForValue.build());
        onChanged();
      } else {
        datapointsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public Builder addDatapoints(
        int index, com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder builderForValue) {
      if (datapointsBuilder_ == null) {
        ensureDatapointsIsMutable();
        datapoints_.add(index, builderForValue.build());
        onChanged();
      } else {
        datapointsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public Builder addAllDatapoints(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.IndexDatapoint> values) {
      if (datapointsBuilder_ == null) {
        ensureDatapointsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, datapoints_);
        onChanged();
      } else {
        datapointsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public Builder clearDatapoints() {
      if (datapointsBuilder_ == null) {
        datapoints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        datapointsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public Builder removeDatapoints(int index) {
      if (datapointsBuilder_ == null) {
        ensureDatapointsIsMutable();
        datapoints_.remove(index);
        onChanged();
      } else {
        datapointsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder getDatapointsBuilder(
        int index) {
      return getDatapointsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.IndexDatapointOrBuilder getDatapointsOrBuilder(
        int index) {
      if (datapointsBuilder_ == null) {
        return datapoints_.get(index);
      } else {
        return datapointsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.IndexDatapointOrBuilder>
        getDatapointsOrBuilderList() {
      if (datapointsBuilder_ != null) {
        return datapointsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(datapoints_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder addDatapointsBuilder() {
      return getDatapointsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.IndexDatapoint.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder addDatapointsBuilder(
        int index) {
      return getDatapointsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.aiplatform.v1beta1.IndexDatapoint.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of datapoints to be created/updated.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 2;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder>
        getDatapointsBuilderList() {
      return getDatapointsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.IndexDatapoint,
            com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder,
            com.google.cloud.aiplatform.v1beta1.IndexDatapointOrBuilder>
        getDatapointsFieldBuilder() {
      if (datapointsBuilder_ == null) {
        datapointsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.IndexDatapoint,
                com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder,
                com.google.cloud.aiplatform.v1beta1.IndexDatapointOrBuilder>(
                datapoints_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        datapoints_ = null;
      }
      return datapointsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest)
  private static final com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpsertDatapointsRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpsertDatapointsRequest>() {
        @java.lang.Override
        public UpsertDatapointsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpsertDatapointsRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpsertDatapointsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpsertDatapointsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.UpsertDatapointsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
