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
// source: google/cloud/aiplatform/v1/schema/predict/instance/text_classification.proto

package com.google.cloud.aiplatform.v1.schema.predict.instance;

public final class TextClassificationPredictionInstanceProto {
  private TextClassificationPredictionInstanceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_predict_instance_TextClassificationPredictionInstance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_instance_TextClassificationPredictionInstance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nLgoogle/cloud/aiplatform/v1/schema/pred"
          + "ict/instance/text_classification.proto\0222"
          + "google.cloud.aiplatform.v1.schema.predic"
          + "t.instance\032\034google/api/annotations.proto"
          + "\"J\n$TextClassificationPredictionInstance"
          + "\022\017\n\007content\030\001 \001(\t\022\021\n\tmime_type\030\002 \001(\tB\346\002\n"
          + "6com.google.cloud.aiplatform.v1.schema.p"
          + "redict.instanceB)TextClassificationPredi"
          + "ctionInstanceProtoP\001ZZgoogle.golang.org/"
          + "genproto/googleapis/cloud/aiplatform/v1/"
          + "schema/predict/instance;instance\252\0022Googl"
          + "e.Cloud.AIPlatform.V1.Schema.Predict.Ins"
          + "tance\312\0022Google\\Cloud\\AIPlatform\\V1\\Schem"
          + "a\\Predict\\Instance\352\0028Google::Cloud::AIPl"
          + "atform::V1::Schema::Predict::Instanceb\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_TextClassificationPredictionInstance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_TextClassificationPredictionInstance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_predict_instance_TextClassificationPredictionInstance_descriptor,
            new java.lang.String[] {
              "Content", "MimeType",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
