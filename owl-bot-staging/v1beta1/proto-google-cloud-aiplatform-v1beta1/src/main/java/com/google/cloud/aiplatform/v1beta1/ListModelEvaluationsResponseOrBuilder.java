// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ListModelEvaluationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListModelEvaluationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelEvaluation model_evaluations = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.ModelEvaluation> 
      getModelEvaluationsList();
  /**
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelEvaluation model_evaluations = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelEvaluation getModelEvaluations(int index);
  /**
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelEvaluation model_evaluations = 1;</code>
   */
  int getModelEvaluationsCount();
  /**
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelEvaluation model_evaluations = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ModelEvaluationOrBuilder> 
      getModelEvaluationsOrBuilderList();
  /**
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelEvaluation model_evaluations = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelEvaluationOrBuilder getModelEvaluationsOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListModelEvaluationsRequest.page_token][google.cloud.aiplatform.v1beta1.ListModelEvaluationsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListModelEvaluationsRequest.page_token][google.cloud.aiplatform.v1beta1.ListModelEvaluationsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}