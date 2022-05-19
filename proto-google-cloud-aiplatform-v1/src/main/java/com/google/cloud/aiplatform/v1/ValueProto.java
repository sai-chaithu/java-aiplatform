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
// source: google/cloud/aiplatform/v1/value.proto

package com.google.cloud.aiplatform.v1;

public final class ValueProto {
  private ValueProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Value_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Value_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/aiplatform/v1/value.proto"
          + "\022\032google.cloud.aiplatform.v1\"U\n\005Value\022\023\n"
          + "\tint_value\030\001 \001(\003H\000\022\026\n\014double_value\030\002 \001(\001"
          + "H\000\022\026\n\014string_value\030\003 \001(\tH\000B\007\n\005valueB\316\001\n\036"
          + "com.google.cloud.aiplatform.v1B\nValuePro"
          + "toP\001ZDgoogle.golang.org/genproto/googlea"
          + "pis/cloud/aiplatform/v1;aiplatform\252\002\032Goo"
          + "gle.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\A"
          + "IPlatform\\V1\352\002\035Google::Cloud::AIPlatform"
          + "::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1_Value_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Value_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Value_descriptor,
            new java.lang.String[] {
              "IntValue", "DoubleValue", "StringValue", "Value",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
