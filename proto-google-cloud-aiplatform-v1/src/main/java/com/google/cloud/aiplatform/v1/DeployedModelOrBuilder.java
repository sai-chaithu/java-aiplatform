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
// source: google/cloud/aiplatform/v1/endpoint.proto

package com.google.cloud.aiplatform.v1;

public interface DeployedModelOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.DeployedModel)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A description of resources that are dedicated to the DeployedModel, and
   * that need a higher degree of manual configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DedicatedResources dedicated_resources = 7;</code>
   *
   * @return Whether the dedicatedResources field is set.
   */
  boolean hasDedicatedResources();
  /**
   *
   *
   * <pre>
   * A description of resources that are dedicated to the DeployedModel, and
   * that need a higher degree of manual configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DedicatedResources dedicated_resources = 7;</code>
   *
   * @return The dedicatedResources.
   */
  com.google.cloud.aiplatform.v1.DedicatedResources getDedicatedResources();
  /**
   *
   *
   * <pre>
   * A description of resources that are dedicated to the DeployedModel, and
   * that need a higher degree of manual configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DedicatedResources dedicated_resources = 7;</code>
   */
  com.google.cloud.aiplatform.v1.DedicatedResourcesOrBuilder getDedicatedResourcesOrBuilder();

  /**
   *
   *
   * <pre>
   * A description of resources that to large degree are decided by Vertex
   * AI, and require only a modest additional configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.AutomaticResources automatic_resources = 8;</code>
   *
   * @return Whether the automaticResources field is set.
   */
  boolean hasAutomaticResources();
  /**
   *
   *
   * <pre>
   * A description of resources that to large degree are decided by Vertex
   * AI, and require only a modest additional configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.AutomaticResources automatic_resources = 8;</code>
   *
   * @return The automaticResources.
   */
  com.google.cloud.aiplatform.v1.AutomaticResources getAutomaticResources();
  /**
   *
   *
   * <pre>
   * A description of resources that to large degree are decided by Vertex
   * AI, and require only a modest additional configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.AutomaticResources automatic_resources = 8;</code>
   */
  com.google.cloud.aiplatform.v1.AutomaticResourcesOrBuilder getAutomaticResourcesOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The ID of the DeployedModel.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Output only. The ID of the DeployedModel.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the Model that this is the deployment of. Note that the Model
   * may be in a different location than the DeployedModel's Endpoint.
   * </pre>
   *
   * <code>
   * string model = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The model.
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Required. The name of the Model that this is the deployment of. Note that the Model
   * may be in a different location than the DeployedModel's Endpoint.
   * </pre>
   *
   * <code>
   * string model = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();

  /**
   *
   *
   * <pre>
   * The display name of the DeployedModel. If not provided upon creation,
   * the Model's display_name is used.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the DeployedModel. If not provided upon creation,
   * the Model's display_name is used.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the DeployedModel was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the DeployedModel was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when the DeployedModel was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Explanation configuration for this DeployedModel.
   * When deploying a Model using [EndpointService.DeployModel][google.cloud.aiplatform.v1.EndpointService.DeployModel], this value
   * overrides the value of [Model.explanation_spec][google.cloud.aiplatform.v1.Model.explanation_spec]. All fields of
   * [explanation_spec][google.cloud.aiplatform.v1.DeployedModel.explanation_spec] are optional in the request. If a field of
   * [explanation_spec][google.cloud.aiplatform.v1.DeployedModel.explanation_spec] is not populated, the value of the same field of
   * [Model.explanation_spec][google.cloud.aiplatform.v1.Model.explanation_spec] is inherited. If the corresponding
   * [Model.explanation_spec][google.cloud.aiplatform.v1.Model.explanation_spec] is not populated, all fields of the
   * [explanation_spec][google.cloud.aiplatform.v1.DeployedModel.explanation_spec] will be used for the explanation configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExplanationSpec explanation_spec = 9;</code>
   *
   * @return Whether the explanationSpec field is set.
   */
  boolean hasExplanationSpec();
  /**
   *
   *
   * <pre>
   * Explanation configuration for this DeployedModel.
   * When deploying a Model using [EndpointService.DeployModel][google.cloud.aiplatform.v1.EndpointService.DeployModel], this value
   * overrides the value of [Model.explanation_spec][google.cloud.aiplatform.v1.Model.explanation_spec]. All fields of
   * [explanation_spec][google.cloud.aiplatform.v1.DeployedModel.explanation_spec] are optional in the request. If a field of
   * [explanation_spec][google.cloud.aiplatform.v1.DeployedModel.explanation_spec] is not populated, the value of the same field of
   * [Model.explanation_spec][google.cloud.aiplatform.v1.Model.explanation_spec] is inherited. If the corresponding
   * [Model.explanation_spec][google.cloud.aiplatform.v1.Model.explanation_spec] is not populated, all fields of the
   * [explanation_spec][google.cloud.aiplatform.v1.DeployedModel.explanation_spec] will be used for the explanation configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExplanationSpec explanation_spec = 9;</code>
   *
   * @return The explanationSpec.
   */
  com.google.cloud.aiplatform.v1.ExplanationSpec getExplanationSpec();
  /**
   *
   *
   * <pre>
   * Explanation configuration for this DeployedModel.
   * When deploying a Model using [EndpointService.DeployModel][google.cloud.aiplatform.v1.EndpointService.DeployModel], this value
   * overrides the value of [Model.explanation_spec][google.cloud.aiplatform.v1.Model.explanation_spec]. All fields of
   * [explanation_spec][google.cloud.aiplatform.v1.DeployedModel.explanation_spec] are optional in the request. If a field of
   * [explanation_spec][google.cloud.aiplatform.v1.DeployedModel.explanation_spec] is not populated, the value of the same field of
   * [Model.explanation_spec][google.cloud.aiplatform.v1.Model.explanation_spec] is inherited. If the corresponding
   * [Model.explanation_spec][google.cloud.aiplatform.v1.Model.explanation_spec] is not populated, all fields of the
   * [explanation_spec][google.cloud.aiplatform.v1.DeployedModel.explanation_spec] will be used for the explanation configuration.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExplanationSpec explanation_spec = 9;</code>
   */
  com.google.cloud.aiplatform.v1.ExplanationSpecOrBuilder getExplanationSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * The service account that the DeployedModel's container runs as. Specify the
   * email address of the service account. If this service account is not
   * specified, the container runs as a service account that doesn't have access
   * to the resource project.
   * Users deploying the Model must have the `iam.serviceAccounts.actAs`
   * permission on this service account.
   * </pre>
   *
   * <code>string service_account = 11;</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * The service account that the DeployedModel's container runs as. Specify the
   * email address of the service account. If this service account is not
   * specified, the container runs as a service account that doesn't have access
   * to the resource project.
   * Users deploying the Model must have the `iam.serviceAccounts.actAs`
   * permission on this service account.
   * </pre>
   *
   * <code>string service_account = 11;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * For custom-trained Models and AutoML Tabular Models, the container of the
   * DeployedModel instances will send `stderr` and `stdout` streams to
   * Stackdriver Logging by default. Please note that the logs incur cost,
   * which are subject to [Cloud Logging
   * pricing](https://cloud.google.com/stackdriver/pricing).
   * User can disable container logging by setting this flag to true.
   * </pre>
   *
   * <code>bool disable_container_logging = 15;</code>
   *
   * @return The disableContainerLogging.
   */
  boolean getDisableContainerLogging();

  /**
   *
   *
   * <pre>
   * These logs are like standard server access logs, containing
   * information like timestamp and latency for each prediction request.
   * Note that Stackdriver logs may incur a cost, especially if your project
   * receives prediction requests at a high queries per second rate (QPS).
   * Estimate your costs before enabling this option.
   * </pre>
   *
   * <code>bool enable_access_logging = 13;</code>
   *
   * @return The enableAccessLogging.
   */
  boolean getEnableAccessLogging();

  /**
   *
   *
   * <pre>
   * Output only. Provide paths for users to send predict/explain/health requests directly to
   * the deployed model services running on Cloud via private services access.
   * This field is populated if [network][google.cloud.aiplatform.v1.Endpoint.network] is configured.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PrivateEndpoints private_endpoints = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the privateEndpoints field is set.
   */
  boolean hasPrivateEndpoints();
  /**
   *
   *
   * <pre>
   * Output only. Provide paths for users to send predict/explain/health requests directly to
   * the deployed model services running on Cloud via private services access.
   * This field is populated if [network][google.cloud.aiplatform.v1.Endpoint.network] is configured.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PrivateEndpoints private_endpoints = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The privateEndpoints.
   */
  com.google.cloud.aiplatform.v1.PrivateEndpoints getPrivateEndpoints();
  /**
   *
   *
   * <pre>
   * Output only. Provide paths for users to send predict/explain/health requests directly to
   * the deployed model services running on Cloud via private services access.
   * This field is populated if [network][google.cloud.aiplatform.v1.Endpoint.network] is configured.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PrivateEndpoints private_endpoints = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1.PrivateEndpointsOrBuilder getPrivateEndpointsOrBuilder();

  public com.google.cloud.aiplatform.v1.DeployedModel.PredictionResourcesCase
      getPredictionResourcesCase();
}
