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
// source: google/cloud/aiplatform/v1beta1/metadata_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ListArtifactsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListArtifactsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The MetadataStore whose Artifacts should be listed.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The MetadataStore whose Artifacts should be listed.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of Artifacts to return. The service may return fewer.
   * Must be in range 1-1000, inclusive. Defaults to 100.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A page token, received from a previous [MetadataService.ListArtifacts][google.cloud.aiplatform.v1beta1.MetadataService.ListArtifacts]
   * call. Provide this to retrieve the subsequent page.
   * When paginating, all other provided parameters must match the call that
   * provided the page token. (Otherwise the request will fail with
   * INVALID_ARGUMENT error.)
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A page token, received from a previous [MetadataService.ListArtifacts][google.cloud.aiplatform.v1beta1.MetadataService.ListArtifacts]
   * call. Provide this to retrieve the subsequent page.
   * When paginating, all other provided parameters must match the call that
   * provided the page token. (Otherwise the request will fail with
   * INVALID_ARGUMENT error.)
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Filter specifying the boolean condition for the Artifacts to satisfy in
   * order to be part of the result set.
   * The syntax to define filter query is based on https://google.aip.dev/160.
   * The supported set of filters include the following:
   * *   **Attribute filtering**:
   *     For example: `display_name = "test"`.
   *     Supported fields include: `name`, `display_name`, `uri`, `state`,
   *     `schema_title`, `create_time`, and `update_time`.
   *     Time fields, such as `create_time` and `update_time`, require values
   *     specified in RFC-3339 format.
   *     For example: `create_time = "2020-11-19T11:30:00-04:00"`
   * *   **Metadata field**:
   *     To filter on metadata fields use traversal operation as follows:
   *     `metadata.&lt;field_name&gt;.&lt;type_value&gt;`.
   *     For example: `metadata.field_1.number_value = 10.0`
   * *   **Context based filtering**:
   *     To filter Artifacts based on the contexts to which they belong, use the
   *     function operator with the full resource name
   *     `in_context(&lt;context-name&gt;)`.
   *     For example:
   *     `in_context("projects/&lt;project_number&gt;/locations/&lt;location&gt;/metadataStores/&lt;metadatastore_name&gt;/contexts/&lt;context-id&gt;")`
   * Each of the above supported filter types can be combined together using
   * logical operators (`AND` &amp; `OR`).
   * For example: `display_name = "test" AND metadata.field1.bool_value = true`.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Filter specifying the boolean condition for the Artifacts to satisfy in
   * order to be part of the result set.
   * The syntax to define filter query is based on https://google.aip.dev/160.
   * The supported set of filters include the following:
   * *   **Attribute filtering**:
   *     For example: `display_name = "test"`.
   *     Supported fields include: `name`, `display_name`, `uri`, `state`,
   *     `schema_title`, `create_time`, and `update_time`.
   *     Time fields, such as `create_time` and `update_time`, require values
   *     specified in RFC-3339 format.
   *     For example: `create_time = "2020-11-19T11:30:00-04:00"`
   * *   **Metadata field**:
   *     To filter on metadata fields use traversal operation as follows:
   *     `metadata.&lt;field_name&gt;.&lt;type_value&gt;`.
   *     For example: `metadata.field_1.number_value = 10.0`
   * *   **Context based filtering**:
   *     To filter Artifacts based on the contexts to which they belong, use the
   *     function operator with the full resource name
   *     `in_context(&lt;context-name&gt;)`.
   *     For example:
   *     `in_context("projects/&lt;project_number&gt;/locations/&lt;location&gt;/metadataStores/&lt;metadatastore_name&gt;/contexts/&lt;context-id&gt;")`
   * Each of the above supported filter types can be combined together using
   * logical operators (`AND` &amp; `OR`).
   * For example: `display_name = "test" AND metadata.field1.bool_value = true`.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
