// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/trainingjob/definition/export_evaluated_data_items_config.proto

package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

/**
 * <pre>
 * Configuration for exporting test set predictions to a BigQuery table.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig}
 */
public final class ExportEvaluatedDataItemsConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig)
    ExportEvaluatedDataItemsConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExportEvaluatedDataItemsConfig.newBuilder() to construct.
  private ExportEvaluatedDataItemsConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExportEvaluatedDataItemsConfig() {
    destinationBigqueryUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExportEvaluatedDataItemsConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExportEvaluatedDataItemsConfig(
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

            destinationBigqueryUri_ = s;
            break;
          }
          case 16: {

            overrideExistingTable_ = input.readBool();
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
    return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfigProto.internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_ExportEvaluatedDataItemsConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfigProto.internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_ExportEvaluatedDataItemsConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig.class, com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig.Builder.class);
  }

  public static final int DESTINATION_BIGQUERY_URI_FIELD_NUMBER = 1;
  private volatile java.lang.Object destinationBigqueryUri_;
  /**
   * <pre>
   * URI of desired destination BigQuery table. Expected format:
   * bq://&lt;project_id&gt;:&lt;dataset_id&gt;:&lt;table&gt;
   * If not specified, then results are exported to the following auto-created
   * BigQuery table:
   * &lt;project_id&gt;:export_evaluated_examples_&lt;model_name&gt;_&lt;yyyy_MM_dd'T'HH_mm_ss_SSS'Z'&gt;.evaluated_examples
   * </pre>
   *
   * <code>string destination_bigquery_uri = 1;</code>
   * @return The destinationBigqueryUri.
   */
  @java.lang.Override
  public java.lang.String getDestinationBigqueryUri() {
    java.lang.Object ref = destinationBigqueryUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destinationBigqueryUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * URI of desired destination BigQuery table. Expected format:
   * bq://&lt;project_id&gt;:&lt;dataset_id&gt;:&lt;table&gt;
   * If not specified, then results are exported to the following auto-created
   * BigQuery table:
   * &lt;project_id&gt;:export_evaluated_examples_&lt;model_name&gt;_&lt;yyyy_MM_dd'T'HH_mm_ss_SSS'Z'&gt;.evaluated_examples
   * </pre>
   *
   * <code>string destination_bigquery_uri = 1;</code>
   * @return The bytes for destinationBigqueryUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDestinationBigqueryUriBytes() {
    java.lang.Object ref = destinationBigqueryUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      destinationBigqueryUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OVERRIDE_EXISTING_TABLE_FIELD_NUMBER = 2;
  private boolean overrideExistingTable_;
  /**
   * <pre>
   * If true and an export destination is specified, then the contents of the
   * destination are overwritten. Otherwise, if the export destination already
   * exists, then the export operation fails.
   * </pre>
   *
   * <code>bool override_existing_table = 2;</code>
   * @return The overrideExistingTable.
   */
  @java.lang.Override
  public boolean getOverrideExistingTable() {
    return overrideExistingTable_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationBigqueryUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, destinationBigqueryUri_);
    }
    if (overrideExistingTable_ != false) {
      output.writeBool(2, overrideExistingTable_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationBigqueryUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, destinationBigqueryUri_);
    }
    if (overrideExistingTable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, overrideExistingTable_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig other = (com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig) obj;

    if (!getDestinationBigqueryUri()
        .equals(other.getDestinationBigqueryUri())) return false;
    if (getOverrideExistingTable()
        != other.getOverrideExistingTable()) return false;
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
    hash = (37 * hash) + DESTINATION_BIGQUERY_URI_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationBigqueryUri().hashCode();
    hash = (37 * hash) + OVERRIDE_EXISTING_TABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOverrideExistingTable());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig prototype) {
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
   * Configuration for exporting test set predictions to a BigQuery table.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig)
      com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfigProto.internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_ExportEvaluatedDataItemsConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfigProto.internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_ExportEvaluatedDataItemsConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig.class, com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig.newBuilder()
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
      destinationBigqueryUri_ = "";

      overrideExistingTable_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfigProto.internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_ExportEvaluatedDataItemsConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig build() {
      com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig buildPartial() {
      com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig result = new com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig(this);
      result.destinationBigqueryUri_ = destinationBigqueryUri_;
      result.overrideExistingTable_ = overrideExistingTable_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig) {
        return mergeFrom((com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig other) {
      if (other == com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig.getDefaultInstance()) return this;
      if (!other.getDestinationBigqueryUri().isEmpty()) {
        destinationBigqueryUri_ = other.destinationBigqueryUri_;
        onChanged();
      }
      if (other.getOverrideExistingTable() != false) {
        setOverrideExistingTable(other.getOverrideExistingTable());
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
      com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object destinationBigqueryUri_ = "";
    /**
     * <pre>
     * URI of desired destination BigQuery table. Expected format:
     * bq://&lt;project_id&gt;:&lt;dataset_id&gt;:&lt;table&gt;
     * If not specified, then results are exported to the following auto-created
     * BigQuery table:
     * &lt;project_id&gt;:export_evaluated_examples_&lt;model_name&gt;_&lt;yyyy_MM_dd'T'HH_mm_ss_SSS'Z'&gt;.evaluated_examples
     * </pre>
     *
     * <code>string destination_bigquery_uri = 1;</code>
     * @return The destinationBigqueryUri.
     */
    public java.lang.String getDestinationBigqueryUri() {
      java.lang.Object ref = destinationBigqueryUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destinationBigqueryUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * URI of desired destination BigQuery table. Expected format:
     * bq://&lt;project_id&gt;:&lt;dataset_id&gt;:&lt;table&gt;
     * If not specified, then results are exported to the following auto-created
     * BigQuery table:
     * &lt;project_id&gt;:export_evaluated_examples_&lt;model_name&gt;_&lt;yyyy_MM_dd'T'HH_mm_ss_SSS'Z'&gt;.evaluated_examples
     * </pre>
     *
     * <code>string destination_bigquery_uri = 1;</code>
     * @return The bytes for destinationBigqueryUri.
     */
    public com.google.protobuf.ByteString
        getDestinationBigqueryUriBytes() {
      java.lang.Object ref = destinationBigqueryUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        destinationBigqueryUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * URI of desired destination BigQuery table. Expected format:
     * bq://&lt;project_id&gt;:&lt;dataset_id&gt;:&lt;table&gt;
     * If not specified, then results are exported to the following auto-created
     * BigQuery table:
     * &lt;project_id&gt;:export_evaluated_examples_&lt;model_name&gt;_&lt;yyyy_MM_dd'T'HH_mm_ss_SSS'Z'&gt;.evaluated_examples
     * </pre>
     *
     * <code>string destination_bigquery_uri = 1;</code>
     * @param value The destinationBigqueryUri to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationBigqueryUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      destinationBigqueryUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URI of desired destination BigQuery table. Expected format:
     * bq://&lt;project_id&gt;:&lt;dataset_id&gt;:&lt;table&gt;
     * If not specified, then results are exported to the following auto-created
     * BigQuery table:
     * &lt;project_id&gt;:export_evaluated_examples_&lt;model_name&gt;_&lt;yyyy_MM_dd'T'HH_mm_ss_SSS'Z'&gt;.evaluated_examples
     * </pre>
     *
     * <code>string destination_bigquery_uri = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDestinationBigqueryUri() {
      
      destinationBigqueryUri_ = getDefaultInstance().getDestinationBigqueryUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URI of desired destination BigQuery table. Expected format:
     * bq://&lt;project_id&gt;:&lt;dataset_id&gt;:&lt;table&gt;
     * If not specified, then results are exported to the following auto-created
     * BigQuery table:
     * &lt;project_id&gt;:export_evaluated_examples_&lt;model_name&gt;_&lt;yyyy_MM_dd'T'HH_mm_ss_SSS'Z'&gt;.evaluated_examples
     * </pre>
     *
     * <code>string destination_bigquery_uri = 1;</code>
     * @param value The bytes for destinationBigqueryUri to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationBigqueryUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      destinationBigqueryUri_ = value;
      onChanged();
      return this;
    }

    private boolean overrideExistingTable_ ;
    /**
     * <pre>
     * If true and an export destination is specified, then the contents of the
     * destination are overwritten. Otherwise, if the export destination already
     * exists, then the export operation fails.
     * </pre>
     *
     * <code>bool override_existing_table = 2;</code>
     * @return The overrideExistingTable.
     */
    @java.lang.Override
    public boolean getOverrideExistingTable() {
      return overrideExistingTable_;
    }
    /**
     * <pre>
     * If true and an export destination is specified, then the contents of the
     * destination are overwritten. Otherwise, if the export destination already
     * exists, then the export operation fails.
     * </pre>
     *
     * <code>bool override_existing_table = 2;</code>
     * @param value The overrideExistingTable to set.
     * @return This builder for chaining.
     */
    public Builder setOverrideExistingTable(boolean value) {
      
      overrideExistingTable_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true and an export destination is specified, then the contents of the
     * destination are overwritten. Otherwise, if the export destination already
     * exists, then the export operation fails.
     * </pre>
     *
     * <code>bool override_existing_table = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOverrideExistingTable() {
      
      overrideExistingTable_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig)
  private static final com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig();
  }

  public static com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportEvaluatedDataItemsConfig>
      PARSER = new com.google.protobuf.AbstractParser<ExportEvaluatedDataItemsConfig>() {
    @java.lang.Override
    public ExportEvaluatedDataItemsConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExportEvaluatedDataItemsConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExportEvaluatedDataItemsConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportEvaluatedDataItemsConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

