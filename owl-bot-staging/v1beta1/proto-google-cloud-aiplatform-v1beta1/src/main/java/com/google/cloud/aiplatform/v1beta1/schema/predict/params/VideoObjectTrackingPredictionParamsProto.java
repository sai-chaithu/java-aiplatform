// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/params/video_object_tracking.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.params;

public final class VideoObjectTrackingPredictionParamsProto {
  private VideoObjectTrackingPredictionParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_VideoObjectTrackingPredictionParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_VideoObjectTrackingPredictionParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nQgoogle/cloud/aiplatform/v1beta1/schema" +
      "/predict/params/video_object_tracking.pr" +
      "oto\0225google.cloud.aiplatform.v1beta1.sch" +
      "ema.predict.params\032\034google/api/annotatio" +
      "ns.proto\"{\n#VideoObjectTrackingPredictio" +
      "nParams\022\034\n\024confidence_threshold\030\001 \001(\002\022\027\n" +
      "\017max_predictions\030\002 \001(\005\022\035\n\025min_bounding_b" +
      "ox_size\030\003 \001(\002B\362\002\n9com.google.cloud.aipla" +
      "tform.v1beta1.schema.predict.paramsB(Vid" +
      "eoObjectTrackingPredictionParamsProtoP\001Z" +
      "[google.golang.org/genproto/googleapis/c" +
      "loud/aiplatform/v1beta1/schema/predict/p" +
      "arams;params\252\0025Google.Cloud.AIPlatform.V" +
      "1Beta1.Schema.Predict.Params\312\0025Google\\Cl" +
      "oud\\AIPlatform\\V1beta1\\Schema\\Predict\\Pa" +
      "rams\352\002;Google::Cloud::AIPlatform::V1beta" +
      "1::Schema::Predict::Paramsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_VideoObjectTrackingPredictionParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_VideoObjectTrackingPredictionParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_VideoObjectTrackingPredictionParams_descriptor,
        new java.lang.String[] { "ConfidenceThreshold", "MaxPredictions", "MinBoundingBoxSize", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
