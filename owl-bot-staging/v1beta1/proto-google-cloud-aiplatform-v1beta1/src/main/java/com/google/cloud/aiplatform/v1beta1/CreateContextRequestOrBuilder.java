// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/metadata_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface CreateContextRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.CreateContextRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the MetadataStore where the Context should be
   * created.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the MetadataStore where the Context should be
   * created.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The Context to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Context context = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   * <pre>
   * Required. The Context to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Context context = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The context.
   */
  com.google.cloud.aiplatform.v1beta1.Context getContext();
  /**
   * <pre>
   * Required. The Context to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Context context = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.ContextOrBuilder getContextOrBuilder();

  /**
   * <pre>
   * The {context} portion of the resource name with the format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`.
   * If not provided, the Context's ID will be a UUID generated by the service.
   * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
   * Must be unique across all Contexts in the parent MetadataStore. (Otherwise
   * the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED if the
   * caller can't view the preexisting Context.)
   * </pre>
   *
   * <code>string context_id = 3;</code>
   * @return The contextId.
   */
  java.lang.String getContextId();
  /**
   * <pre>
   * The {context} portion of the resource name with the format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`.
   * If not provided, the Context's ID will be a UUID generated by the service.
   * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
   * Must be unique across all Contexts in the parent MetadataStore. (Otherwise
   * the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED if the
   * caller can't view the preexisting Context.)
   * </pre>
   *
   * <code>string context_id = 3;</code>
   * @return The bytes for contextId.
   */
  com.google.protobuf.ByteString
      getContextIdBytes();
}
