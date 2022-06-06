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
// source: google/cloud/aiplatform/v1beta1/explanation.proto

package com.google.cloud.aiplatform.v1beta1;

public interface XraiAttributionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.XraiAttribution)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The number of steps for approximating the path integral.
   * A good value to start is 50 and gradually increase until the
   * sum to diff property is met within the desired error range.
   * Valid range of its value is [1, 100], inclusively.
   * </pre>
   *
   * <code>int32 step_count = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The stepCount.
   */
  int getStepCount();

  /**
   *
   *
   * <pre>
   * Config for SmoothGrad approximation of gradients.
   * When enabled, the gradients are approximated by averaging the gradients
   * from noisy samples in the vicinity of the inputs. Adding
   * noise can help improve the computed gradients. Refer to this paper for more
   * details: https://arxiv.org/pdf/1706.03825.pdf
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SmoothGradConfig smooth_grad_config = 2;</code>
   *
   * @return Whether the smoothGradConfig field is set.
   */
  boolean hasSmoothGradConfig();
  /**
   *
   *
   * <pre>
   * Config for SmoothGrad approximation of gradients.
   * When enabled, the gradients are approximated by averaging the gradients
   * from noisy samples in the vicinity of the inputs. Adding
   * noise can help improve the computed gradients. Refer to this paper for more
   * details: https://arxiv.org/pdf/1706.03825.pdf
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SmoothGradConfig smooth_grad_config = 2;</code>
   *
   * @return The smoothGradConfig.
   */
  com.google.cloud.aiplatform.v1beta1.SmoothGradConfig getSmoothGradConfig();
  /**
   *
   *
   * <pre>
   * Config for SmoothGrad approximation of gradients.
   * When enabled, the gradients are approximated by averaging the gradients
   * from noisy samples in the vicinity of the inputs. Adding
   * noise can help improve the computed gradients. Refer to this paper for more
   * details: https://arxiv.org/pdf/1706.03825.pdf
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SmoothGradConfig smooth_grad_config = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.SmoothGradConfigOrBuilder getSmoothGradConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for XRAI with blur baseline.
   * When enabled, a linear path from the maximally blurred image to the input
   * image is created. Using a blurred baseline instead of zero (black image) is
   * motivated by the BlurIG approach explained here:
   * https://arxiv.org/abs/2004.03383
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.BlurBaselineConfig blur_baseline_config = 3;</code>
   *
   * @return Whether the blurBaselineConfig field is set.
   */
  boolean hasBlurBaselineConfig();
  /**
   *
   *
   * <pre>
   * Config for XRAI with blur baseline.
   * When enabled, a linear path from the maximally blurred image to the input
   * image is created. Using a blurred baseline instead of zero (black image) is
   * motivated by the BlurIG approach explained here:
   * https://arxiv.org/abs/2004.03383
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.BlurBaselineConfig blur_baseline_config = 3;</code>
   *
   * @return The blurBaselineConfig.
   */
  com.google.cloud.aiplatform.v1beta1.BlurBaselineConfig getBlurBaselineConfig();
  /**
   *
   *
   * <pre>
   * Config for XRAI with blur baseline.
   * When enabled, a linear path from the maximally blurred image to the input
   * image is created. Using a blurred baseline instead of zero (black image) is
   * motivated by the BlurIG approach explained here:
   * https://arxiv.org/abs/2004.03383
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.BlurBaselineConfig blur_baseline_config = 3;</code>
   */
  com.google.cloud.aiplatform.v1beta1.BlurBaselineConfigOrBuilder getBlurBaselineConfigOrBuilder();
}
