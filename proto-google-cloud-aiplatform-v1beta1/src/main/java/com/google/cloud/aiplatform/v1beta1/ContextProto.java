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
// source: google/cloud/aiplatform/v1beta1/context.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ContextProto {
  private ContextProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Context_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Context_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Context_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Context_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/aiplatform/v1beta1/contex"
          + "t.proto\022\037google.cloud.aiplatform.v1beta1"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\032\034google/protobuf/st"
          + "ruct.proto\032\037google/protobuf/timestamp.pr"
          + "oto\"\330\004\n\007Context\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\024\n\014di"
          + "splay_name\030\002 \001(\t\022\014\n\004etag\030\010 \001(\t\022D\n\006labels"
          + "\030\t \003(\01324.google.cloud.aiplatform.v1beta1"
          + ".Context.LabelsEntry\0224\n\013create_time\030\n \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013up"
          + "date_time\030\013 \001(\0132\032.google.protobuf.Timest"
          + "ampB\003\340A\003\022B\n\017parent_contexts\030\014 \003(\tB)\340A\003\372A"
          + "#\n!aiplatform.googleapis.com/Context\022\024\n\014"
          + "schema_title\030\r \001(\t\022\026\n\016schema_version\030\016 \001"
          + "(\t\022)\n\010metadata\030\017 \001(\0132\027.google.protobuf.S"
          + "truct\022\023\n\013description\030\020 \001(\t\032-\n\013LabelsEntr"
          + "y\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\202\001\352A\177\n"
          + "!aiplatform.googleapis.com/Context\022Zproj"
          + "ects/{project}/locations/{location}/meta"
          + "dataStores/{metadata_store}/contexts/{co"
          + "ntext}B\351\001\n#com.google.cloud.aiplatform.v"
          + "1beta1B\014ContextProtoP\001ZIgoogle.golang.or"
          + "g/genproto/googleapis/cloud/aiplatform/v"
          + "1beta1;aiplatform\252\002\037Google.Cloud.AIPlatf"
          + "orm.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1"
          + "beta1\352\002\"Google::Cloud::AIPlatform::V1bet"
          + "a1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Context_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Context_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Context_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Etag",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "ParentContexts",
              "SchemaTitle",
              "SchemaVersion",
              "Metadata",
              "Description",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Context_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Context_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Context_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Context_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
