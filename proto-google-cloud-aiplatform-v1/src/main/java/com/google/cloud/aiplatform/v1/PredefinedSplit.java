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
// source: google/cloud/aiplatform/v1/training_pipeline.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Assigns input data to training, validation, and test sets based on the
 * value of a provided key.
 * Supported only for tabular Datasets.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.PredefinedSplit}
 */
public final class PredefinedSplit extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.PredefinedSplit)
    PredefinedSplitOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PredefinedSplit.newBuilder() to construct.
  private PredefinedSplit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PredefinedSplit() {
    key_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PredefinedSplit();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PredefinedSplit(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              key_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.TrainingPipelineProto
        .internal_static_google_cloud_aiplatform_v1_PredefinedSplit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.TrainingPipelineProto
        .internal_static_google_cloud_aiplatform_v1_PredefinedSplit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.PredefinedSplit.class,
            com.google.cloud.aiplatform.v1.PredefinedSplit.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object key_;
  /**
   *
   *
   * <pre>
   * Required. The key is a name of one of the Dataset's data columns.
   * The value of the key (either the label's value or value in the column)
   * must be one of {`training`, `validation`, `test`}, and it defines to which
   * set the given piece of data is assigned. If for a piece of data the key
   * is not present or has an invalid value, that piece is ignored by the
   * pipeline.
   * </pre>
   *
   * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The key is a name of one of the Dataset's data columns.
   * The value of the key (either the label's value or value in the column)
   * must be one of {`training`, `validation`, `test`}, and it defines to which
   * set the given piece of data is assigned. If for a piece of data the key
   * is not present or has an invalid value, that piece is ignored by the
   * pipeline.
   * </pre>
   *
   * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      key_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.PredefinedSplit)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.PredefinedSplit other =
        (com.google.cloud.aiplatform.v1.PredefinedSplit) obj;

    if (!getKey().equals(other.getKey())) return false;
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.PredefinedSplit parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.PredefinedSplit parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.PredefinedSplit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.PredefinedSplit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.PredefinedSplit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.PredefinedSplit parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.PredefinedSplit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.PredefinedSplit parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.PredefinedSplit parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.PredefinedSplit parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.PredefinedSplit parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.PredefinedSplit parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.PredefinedSplit prototype) {
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
   * Assigns input data to training, validation, and test sets based on the
   * value of a provided key.
   * Supported only for tabular Datasets.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.PredefinedSplit}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.PredefinedSplit)
      com.google.cloud.aiplatform.v1.PredefinedSplitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.TrainingPipelineProto
          .internal_static_google_cloud_aiplatform_v1_PredefinedSplit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.TrainingPipelineProto
          .internal_static_google_cloud_aiplatform_v1_PredefinedSplit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.PredefinedSplit.class,
              com.google.cloud.aiplatform.v1.PredefinedSplit.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.PredefinedSplit.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      key_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.TrainingPipelineProto
          .internal_static_google_cloud_aiplatform_v1_PredefinedSplit_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.PredefinedSplit getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.PredefinedSplit.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.PredefinedSplit build() {
      com.google.cloud.aiplatform.v1.PredefinedSplit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.PredefinedSplit buildPartial() {
      com.google.cloud.aiplatform.v1.PredefinedSplit result =
          new com.google.cloud.aiplatform.v1.PredefinedSplit(this);
      result.key_ = key_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.PredefinedSplit) {
        return mergeFrom((com.google.cloud.aiplatform.v1.PredefinedSplit) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.PredefinedSplit other) {
      if (other == com.google.cloud.aiplatform.v1.PredefinedSplit.getDefaultInstance()) return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
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
      com.google.cloud.aiplatform.v1.PredefinedSplit parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1.PredefinedSplit) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object key_ = "";
    /**
     *
     *
     * <pre>
     * Required. The key is a name of one of the Dataset's data columns.
     * The value of the key (either the label's value or value in the column)
     * must be one of {`training`, `validation`, `test`}, and it defines to which
     * set the given piece of data is assigned. If for a piece of data the key
     * is not present or has an invalid value, that piece is ignored by the
     * pipeline.
     * </pre>
     *
     * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The key is a name of one of the Dataset's data columns.
     * The value of the key (either the label's value or value in the column)
     * must be one of {`training`, `validation`, `test`}, and it defines to which
     * set the given piece of data is assigned. If for a piece of data the key
     * is not present or has an invalid value, that piece is ignored by the
     * pipeline.
     * </pre>
     *
     * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The key is a name of one of the Dataset's data columns.
     * The value of the key (either the label's value or value in the column)
     * must be one of {`training`, `validation`, `test`}, and it defines to which
     * set the given piece of data is assigned. If for a piece of data the key
     * is not present or has an invalid value, that piece is ignored by the
     * pipeline.
     * </pre>
     *
     * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      key_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The key is a name of one of the Dataset's data columns.
     * The value of the key (either the label's value or value in the column)
     * must be one of {`training`, `validation`, `test`}, and it defines to which
     * set the given piece of data is assigned. If for a piece of data the key
     * is not present or has an invalid value, that piece is ignored by the
     * pipeline.
     * </pre>
     *
     * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKey() {

      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The key is a name of one of the Dataset's data columns.
     * The value of the key (either the label's value or value in the column)
     * must be one of {`training`, `validation`, `test`}, and it defines to which
     * set the given piece of data is assigned. If for a piece of data the key
     * is not present or has an invalid value, that piece is ignored by the
     * pipeline.
     * </pre>
     *
     * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      key_ = value;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.PredefinedSplit)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.PredefinedSplit)
  private static final com.google.cloud.aiplatform.v1.PredefinedSplit DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.PredefinedSplit();
  }

  public static com.google.cloud.aiplatform.v1.PredefinedSplit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PredefinedSplit> PARSER =
      new com.google.protobuf.AbstractParser<PredefinedSplit>() {
        @java.lang.Override
        public PredefinedSplit parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PredefinedSplit(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PredefinedSplit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PredefinedSplit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.PredefinedSplit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
