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
// source: google/cloud/aiplatform/v1beta1/types.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * A list of double values.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.DoubleArray}
 */
public final class DoubleArray extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.DoubleArray)
    DoubleArrayOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DoubleArray.newBuilder() to construct.
  private DoubleArray(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DoubleArray() {
    values_ = emptyDoubleList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DoubleArray();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DoubleArray(
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
          case 9:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                values_ = newDoubleList();
                mutable_bitField0_ |= 0x00000001;
              }
              values_.addDouble(input.readDouble());
              break;
            }
          case 10:
            {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                values_ = newDoubleList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                values_.addDouble(input.readDouble());
              }
              input.popLimit(limit);
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
        values_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.TypesProto
        .internal_static_google_cloud_aiplatform_v1beta1_DoubleArray_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.TypesProto
        .internal_static_google_cloud_aiplatform_v1beta1_DoubleArray_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.DoubleArray.class,
            com.google.cloud.aiplatform.v1beta1.DoubleArray.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.DoubleList values_;
  /**
   *
   *
   * <pre>
   * A list of double values.
   * </pre>
   *
   * <code>repeated double values = 1;</code>
   *
   * @return A list containing the values.
   */
  @java.lang.Override
  public java.util.List<java.lang.Double> getValuesList() {
    return values_;
  }
  /**
   *
   *
   * <pre>
   * A list of double values.
   * </pre>
   *
   * <code>repeated double values = 1;</code>
   *
   * @return The count of values.
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of double values.
   * </pre>
   *
   * <code>repeated double values = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  public double getValues(int index) {
    return values_.getDouble(index);
  }

  private int valuesMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getValuesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(valuesMemoizedSerializedSize);
    }
    for (int i = 0; i < values_.size(); i++) {
      output.writeDoubleNoTag(values_.getDouble(i));
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
      dataSize = 8 * getValuesList().size();
      size += dataSize;
      if (!getValuesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
      }
      valuesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.DoubleArray)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.DoubleArray other =
        (com.google.cloud.aiplatform.v1beta1.DoubleArray) obj;

    if (!getValuesList().equals(other.getValuesList())) return false;
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
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.DoubleArray parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.DoubleArray parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.DoubleArray parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.DoubleArray parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.DoubleArray parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.DoubleArray parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.DoubleArray parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.DoubleArray parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.DoubleArray parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.DoubleArray parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.DoubleArray parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.DoubleArray parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.DoubleArray prototype) {
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
   * A list of double values.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.DoubleArray}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.DoubleArray)
      com.google.cloud.aiplatform.v1beta1.DoubleArrayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.TypesProto
          .internal_static_google_cloud_aiplatform_v1beta1_DoubleArray_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.TypesProto
          .internal_static_google_cloud_aiplatform_v1beta1_DoubleArray_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.DoubleArray.class,
              com.google.cloud.aiplatform.v1beta1.DoubleArray.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.DoubleArray.newBuilder()
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
      values_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.TypesProto
          .internal_static_google_cloud_aiplatform_v1beta1_DoubleArray_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.DoubleArray getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.DoubleArray.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.DoubleArray build() {
      com.google.cloud.aiplatform.v1beta1.DoubleArray result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.DoubleArray buildPartial() {
      com.google.cloud.aiplatform.v1beta1.DoubleArray result =
          new com.google.cloud.aiplatform.v1beta1.DoubleArray(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        values_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.values_ = values_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.DoubleArray) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.DoubleArray) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.DoubleArray other) {
      if (other == com.google.cloud.aiplatform.v1beta1.DoubleArray.getDefaultInstance())
        return this;
      if (!other.values_.isEmpty()) {
        if (values_.isEmpty()) {
          values_ = other.values_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureValuesIsMutable();
          values_.addAll(other.values_);
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
      com.google.cloud.aiplatform.v1beta1.DoubleArray parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1beta1.DoubleArray) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.Internal.DoubleList values_ = emptyDoubleList();

    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        values_ = mutableCopy(values_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * A list of double values.
     * </pre>
     *
     * <code>repeated double values = 1;</code>
     *
     * @return A list containing the values.
     */
    public java.util.List<java.lang.Double> getValuesList() {
      return ((bitField0_ & 0x00000001) != 0)
          ? java.util.Collections.unmodifiableList(values_)
          : values_;
    }
    /**
     *
     *
     * <pre>
     * A list of double values.
     * </pre>
     *
     * <code>repeated double values = 1;</code>
     *
     * @return The count of values.
     */
    public int getValuesCount() {
      return values_.size();
    }
    /**
     *
     *
     * <pre>
     * A list of double values.
     * </pre>
     *
     * <code>repeated double values = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    public double getValues(int index) {
      return values_.getDouble(index);
    }
    /**
     *
     *
     * <pre>
     * A list of double values.
     * </pre>
     *
     * <code>repeated double values = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The values to set.
     * @return This builder for chaining.
     */
    public Builder setValues(int index, double value) {
      ensureValuesIsMutable();
      values_.setDouble(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of double values.
     * </pre>
     *
     * <code>repeated double values = 1;</code>
     *
     * @param value The values to add.
     * @return This builder for chaining.
     */
    public Builder addValues(double value) {
      ensureValuesIsMutable();
      values_.addDouble(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of double values.
     * </pre>
     *
     * <code>repeated double values = 1;</code>
     *
     * @param values The values to add.
     * @return This builder for chaining.
     */
    public Builder addAllValues(java.lang.Iterable<? extends java.lang.Double> values) {
      ensureValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, values_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of double values.
     * </pre>
     *
     * <code>repeated double values = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValues() {
      values_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000001);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.DoubleArray)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.DoubleArray)
  private static final com.google.cloud.aiplatform.v1beta1.DoubleArray DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.DoubleArray();
  }

  public static com.google.cloud.aiplatform.v1beta1.DoubleArray getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DoubleArray> PARSER =
      new com.google.protobuf.AbstractParser<DoubleArray>() {
        @java.lang.Override
        public DoubleArray parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DoubleArray(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DoubleArray> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DoubleArray> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.DoubleArray getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
