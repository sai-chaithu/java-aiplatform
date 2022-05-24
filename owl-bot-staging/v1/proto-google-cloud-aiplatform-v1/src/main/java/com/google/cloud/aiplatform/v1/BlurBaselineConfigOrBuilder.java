// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/explanation.proto

package com.google.cloud.aiplatform.v1;

public interface BlurBaselineConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.BlurBaselineConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The standard deviation of the blur kernel for the blurred baseline. The
   * same blurring parameter is used for both the height and the width
   * dimension. If not set, the method defaults to the zero (i.e. black for
   * images) baseline.
   * </pre>
   *
   * <code>float max_blur_sigma = 1;</code>
   * @return The maxBlurSigma.
   */
  float getMaxBlurSigma();
}