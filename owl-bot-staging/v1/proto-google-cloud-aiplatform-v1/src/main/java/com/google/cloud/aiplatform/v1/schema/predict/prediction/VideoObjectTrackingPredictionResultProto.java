// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/predict/prediction/video_object_tracking.proto

package com.google.cloud.aiplatform.v1.schema.predict.prediction;

public final class VideoObjectTrackingPredictionResultProto {
  private VideoObjectTrackingPredictionResultProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_VideoObjectTrackingPredictionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_VideoObjectTrackingPredictionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_VideoObjectTrackingPredictionResult_Frame_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_VideoObjectTrackingPredictionResult_Frame_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nPgoogle/cloud/aiplatform/v1/schema/pred" +
      "ict/prediction/video_object_tracking.pro" +
      "to\0224google.cloud.aiplatform.v1.schema.pr" +
      "edict.prediction\032\036google/protobuf/durati" +
      "on.proto\032\036google/protobuf/wrappers.proto" +
      "\032\034google/api/annotations.proto\"\277\004\n#Video" +
      "ObjectTrackingPredictionResult\022\n\n\002id\030\001 \001" +
      "(\t\022\024\n\014display_name\030\002 \001(\t\0225\n\022time_segment" +
      "_start\030\003 \001(\0132\031.google.protobuf.Duration\022" +
      "3\n\020time_segment_end\030\004 \001(\0132\031.google.proto" +
      "buf.Duration\022/\n\nconfidence\030\005 \001(\0132\033.googl" +
      "e.protobuf.FloatValue\022o\n\006frames\030\006 \003(\0132_." +
      "google.cloud.aiplatform.v1.schema.predic" +
      "t.prediction.VideoObjectTrackingPredicti" +
      "onResult.Frame\032\347\001\n\005Frame\022.\n\013time_offset\030" +
      "\001 \001(\0132\031.google.protobuf.Duration\022*\n\005x_mi" +
      "n\030\002 \001(\0132\033.google.protobuf.FloatValue\022*\n\005" +
      "x_max\030\003 \001(\0132\033.google.protobuf.FloatValue" +
      "\022*\n\005y_min\030\004 \001(\0132\033.google.protobuf.FloatV" +
      "alue\022*\n\005y_max\030\005 \001(\0132\033.google.protobuf.Fl" +
      "oatValueB\361\002\n8com.google.cloud.aiplatform" +
      ".v1.schema.predict.predictionB(VideoObje" +
      "ctTrackingPredictionResultProtoP\001Z^googl" +
      "e.golang.org/genproto/googleapis/cloud/a" +
      "iplatform/v1/schema/predict/prediction;p" +
      "rediction\252\0024Google.Cloud.AIPlatform.V1.S" +
      "chema.Predict.Prediction\312\0024Google\\Cloud\\" +
      "AIPlatform\\V1\\Schema\\Predict\\Prediction\352" +
      "\002:Google::Cloud::AIPlatform::V1::Schema:" +
      ":Predict::Predictionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_VideoObjectTrackingPredictionResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_VideoObjectTrackingPredictionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_VideoObjectTrackingPredictionResult_descriptor,
        new java.lang.String[] { "Id", "DisplayName", "TimeSegmentStart", "TimeSegmentEnd", "Confidence", "Frames", });
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_VideoObjectTrackingPredictionResult_Frame_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_VideoObjectTrackingPredictionResult_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_VideoObjectTrackingPredictionResult_Frame_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_VideoObjectTrackingPredictionResult_Frame_descriptor,
        new java.lang.String[] { "TimeOffset", "XMin", "XMax", "YMin", "YMax", });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}