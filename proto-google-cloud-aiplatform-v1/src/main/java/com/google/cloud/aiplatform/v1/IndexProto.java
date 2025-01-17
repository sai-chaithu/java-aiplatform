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
// source: google/cloud/aiplatform/v1/index.proto

package com.google.cloud.aiplatform.v1;

public final class IndexProto {
  private IndexProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Index_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Index_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/aiplatform/v1/index.proto"
          + "\022\032google.cloud.aiplatform.v1\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\0323google/cloud/aiplatform/v1/dep"
          + "loyed_index_ref.proto\032\034google/protobuf/s"
          + "truct.proto\032\037google/protobuf/timestamp.p"
          + "roto\"\252\004\n\005Index\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014dis"
          + "play_name\030\002 \001(\tB\003\340A\002\022\023\n\013description\030\003 \001("
          + "\t\022 \n\023metadata_schema_uri\030\004 \001(\tB\003\340A\005\022(\n\010m"
          + "etadata\030\006 \001(\0132\026.google.protobuf.Value\022K\n"
          + "\020deployed_indexes\030\007 \003(\0132,.google.cloud.a"
          + "iplatform.v1.DeployedIndexRefB\003\340A\003\022\014\n\004et"
          + "ag\030\010 \001(\t\022=\n\006labels\030\t \003(\0132-.google.cloud."
          + "aiplatform.v1.Index.LabelsEntry\0224\n\013creat"
          + "e_time\030\n \001(\0132\032.google.protobuf.Timestamp"
          + "B\003\340A\003\0224\n\013update_time\030\013 \001(\0132\032.google.prot"
          + "obuf.TimestampB\003\340A\003\032-\n\013LabelsEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:]\352AZ\n\037aiplatf"
          + "orm.googleapis.com/Index\0227projects/{proj"
          + "ect}/locations/{location}/indexes/{index"
          + "}B\316\001\n\036com.google.cloud.aiplatform.v1B\nIn"
          + "dexProtoP\001ZDgoogle.golang.org/genproto/g"
          + "oogleapis/cloud/aiplatform/v1;aiplatform"
          + "\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\C"
          + "loud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPl"
          + "atform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.DeployedIndexRefProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Index_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Index_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Index_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "MetadataSchemaUri",
              "Metadata",
              "DeployedIndexes",
              "Etag",
              "Labels",
              "CreateTime",
              "UpdateTime",
            });
    internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Index_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Index_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.DeployedIndexRefProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
