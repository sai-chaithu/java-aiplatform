// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/explanation.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ExplanationSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ExplanationSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Parameters that configure explaining of the Model's predictions.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   * <pre>
   * Required. Parameters that configure explaining of the Model's predictions.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The parameters.
   */
  com.google.cloud.aiplatform.v1beta1.ExplanationParameters getParameters();
  /**
   * <pre>
   * Required. Parameters that configure explaining of the Model's predictions.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationParameters parameters = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.ExplanationParametersOrBuilder getParametersOrBuilder();

  /**
   * <pre>
   * Required. Metadata describing the Model's input and output for explanation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Required. Metadata describing the Model's input and output for explanation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The metadata.
   */
  com.google.cloud.aiplatform.v1beta1.ExplanationMetadata getMetadata();
  /**
   * <pre>
   * Required. Metadata describing the Model's input and output for explanation.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExplanationMetadata metadata = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.ExplanationMetadataOrBuilder getMetadataOrBuilder();
}
