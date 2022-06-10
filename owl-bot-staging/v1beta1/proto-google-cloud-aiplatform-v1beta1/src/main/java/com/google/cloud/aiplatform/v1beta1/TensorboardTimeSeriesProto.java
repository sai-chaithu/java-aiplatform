// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/tensorboard_time_series.proto

package com.google.cloud.aiplatform.v1beta1;

public final class TensorboardTimeSeriesProto {
  private TensorboardTimeSeriesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_TensorboardTimeSeries_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TensorboardTimeSeries_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_TensorboardTimeSeries_Metadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TensorboardTimeSeries_Metadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/cloud/aiplatform/v1beta1/tensor" +
      "board_time_series.proto\022\037google.cloud.ai" +
      "platform.v1beta1\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/resource.proto\032\037go" +
      "ogle/protobuf/timestamp.proto\"\311\006\n\025Tensor" +
      "boardTimeSeries\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014di" +
      "splay_name\030\002 \001(\tB\003\340A\002\022\023\n\013description\030\003 \001" +
      "(\t\022\\\n\nvalue_type\030\004 \001(\0162@.google.cloud.ai" +
      "platform.v1beta1.TensorboardTimeSeries.V" +
      "alueTypeB\006\340A\002\340A\005\0224\n\013create_time\030\005 \001(\0132\032." +
      "google.protobuf.TimestampB\003\340A\003\0224\n\013update" +
      "_time\030\006 \001(\0132\032.google.protobuf.TimestampB" +
      "\003\340A\003\022\014\n\004etag\030\007 \001(\t\022\030\n\013plugin_name\030\010 \001(\tB" +
      "\003\340A\005\022\023\n\013plugin_data\030\t \001(\014\022V\n\010metadata\030\n " +
      "\001(\0132?.google.cloud.aiplatform.v1beta1.Te" +
      "nsorboardTimeSeries.MetadataB\003\340A\003\032\200\001\n\010Me" +
      "tadata\022\025\n\010max_step\030\001 \001(\003B\003\340A\003\0226\n\rmax_wal" +
      "l_time\030\002 \001(\0132\032.google.protobuf.Timestamp" +
      "B\003\340A\003\022%\n\030max_blob_sequence_length\030\003 \001(\003B" +
      "\003\340A\003\"R\n\tValueType\022\032\n\026VALUE_TYPE_UNSPECIF" +
      "IED\020\000\022\n\n\006SCALAR\020\001\022\n\n\006TENSOR\020\002\022\021\n\rBLOB_SE" +
      "QUENCE\020\003:\266\001\352A\262\001\n/aiplatform.googleapis.c" +
      "om/TensorboardTimeSeries\022\177projects/{proj" +
      "ect}/locations/{location}/tensorboards/{" +
      "tensorboard}/experiments/{experiment}/ru" +
      "ns/{run}/timeSeries/{time_series}B\367\001\n#co" +
      "m.google.cloud.aiplatform.v1beta1B\032Tenso" +
      "rboardTimeSeriesProtoP\001ZIgoogle.golang.o" +
      "rg/genproto/googleapis/cloud/aiplatform/" +
      "v1beta1;aiplatform\252\002\037Google.Cloud.AIPlat" +
      "form.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V" +
      "1beta1\352\002\"Google::Cloud::AIPlatform::V1be" +
      "ta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_TensorboardTimeSeries_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_TensorboardTimeSeries_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_TensorboardTimeSeries_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "ValueType", "CreateTime", "UpdateTime", "Etag", "PluginName", "PluginData", "Metadata", });
    internal_static_google_cloud_aiplatform_v1beta1_TensorboardTimeSeries_Metadata_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_TensorboardTimeSeries_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_TensorboardTimeSeries_Metadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_TensorboardTimeSeries_Metadata_descriptor,
        new java.lang.String[] { "MaxStep", "MaxWallTime", "MaxBlobSequenceLength", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
