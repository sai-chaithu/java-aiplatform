// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/params/video_classification.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.params;

public final class VideoClassificationPredictionParamsProto {
  private VideoClassificationPredictionParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_VideoClassificationPredictionParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_VideoClassificationPredictionParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nPgoogle/cloud/aiplatform/v1beta1/schema" +
      "/predict/params/video_classification.pro" +
      "to\0225google.cloud.aiplatform.v1beta1.sche" +
      "ma.predict.params\032\034google/api/annotation" +
      "s.proto\"\302\001\n#VideoClassificationPredictio" +
      "nParams\022\034\n\024confidence_threshold\030\001 \001(\002\022\027\n" +
      "\017max_predictions\030\002 \001(\005\022\036\n\026segment_classi" +
      "fication\030\003 \001(\010\022\033\n\023shot_classification\030\004 " +
      "\001(\010\022\'\n\037one_sec_interval_classification\030\005" +
      " \001(\010B\362\002\n9com.google.cloud.aiplatform.v1b" +
      "eta1.schema.predict.paramsB(VideoClassif" +
      "icationPredictionParamsProtoP\001Z[google.g" +
      "olang.org/genproto/googleapis/cloud/aipl" +
      "atform/v1beta1/schema/predict/params;par" +
      "ams\252\0025Google.Cloud.AIPlatform.V1Beta1.Sc" +
      "hema.Predict.Params\312\0025Google\\Cloud\\AIPla" +
      "tform\\V1beta1\\Schema\\Predict\\Params\352\002;Go" +
      "ogle::Cloud::AIPlatform::V1beta1::Schema" +
      "::Predict::Paramsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_VideoClassificationPredictionParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_VideoClassificationPredictionParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_VideoClassificationPredictionParams_descriptor,
        new java.lang.String[] { "ConfidenceThreshold", "MaxPredictions", "SegmentClassification", "ShotClassification", "OneSecIntervalClassification", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
