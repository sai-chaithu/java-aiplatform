// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/params/video_action_recognition.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.params;

public interface VideoActionRecognitionPredictionParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.schema.predict.params.VideoActionRecognitionPredictionParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Model only returns predictions with at least this confidence score.
   * Default value is 0.0
   * </pre>
   *
   * <code>float confidence_threshold = 1;</code>
   * @return The confidenceThreshold.
   */
  float getConfidenceThreshold();

  /**
   * <pre>
   * The model only returns up to that many top, by confidence score,
   * predictions per frame of the video. If this number is very high, the
   * Model may return fewer predictions per frame. Default value is 50.
   * </pre>
   *
   * <code>int32 max_predictions = 2;</code>
   * @return The maxPredictions.
   */
  int getMaxPredictions();
}
