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
// source: google/cloud/aiplatform/v1beta1/completion_stats.proto

package com.google.cloud.aiplatform.v1beta1;

public final class CompletionStatsProto {
  private CompletionStatsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CompletionStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CompletionStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1beta1/comple"
          + "tion_stats.proto\022\037google.cloud.aiplatfor"
          + "m.v1beta1\032\037google/api/field_behavior.pro"
          + "to\032\027google/rpc/status.proto\032\034google/api/"
          + "annotations.proto\"j\n\017CompletionStats\022\035\n\020"
          + "successful_count\030\001 \001(\003B\003\340A\003\022\031\n\014failed_co"
          + "unt\030\002 \001(\003B\003\340A\003\022\035\n\020incomplete_count\030\003 \001(\003"
          + "B\003\340A\003B\361\001\n#com.google.cloud.aiplatform.v1"
          + "beta1B\024CompletionStatsProtoP\001ZIgoogle.go"
          + "lang.org/genproto/googleapis/cloud/aipla"
          + "tform/v1beta1;aiplatform\252\002\037Google.Cloud."
          + "AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AIPlat"
          + "form\\V1beta1\352\002\"Google::Cloud::AIPlatform"
          + "::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_CompletionStats_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CompletionStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CompletionStats_descriptor,
            new java.lang.String[] {
              "SuccessfulCount", "FailedCount", "IncompleteCount",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
