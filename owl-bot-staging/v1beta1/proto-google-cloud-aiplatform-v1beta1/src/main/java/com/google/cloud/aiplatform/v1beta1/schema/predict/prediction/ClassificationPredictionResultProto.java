// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/classification.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.prediction;

public final class ClassificationPredictionResultProto {
  private ClassificationPredictionResultProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ClassificationPredictionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ClassificationPredictionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nNgoogle/cloud/aiplatform/v1beta1/schema" +
      "/predict/prediction/classification.proto" +
      "\0229google.cloud.aiplatform.v1beta1.schema" +
      ".predict.prediction\032\034google/api/annotati" +
      "ons.proto\"Y\n\036ClassificationPredictionRes" +
      "ult\022\013\n\003ids\030\001 \003(\003\022\025\n\rdisplay_names\030\002 \003(\t\022" +
      "\023\n\013confidences\030\003 \003(\002B\205\003\n=com.google.clou" +
      "d.aiplatform.v1beta1.schema.predict.pred" +
      "ictionB#ClassificationPredictionResultPr" +
      "otoP\001Zcgoogle.golang.org/genproto/google" +
      "apis/cloud/aiplatform/v1beta1/schema/pre" +
      "dict/prediction;prediction\252\0029Google.Clou" +
      "d.AIPlatform.V1Beta1.Schema.Predict.Pred" +
      "iction\312\0029Google\\Cloud\\AIPlatform\\V1beta1" +
      "\\Schema\\Predict\\Prediction\352\002?Google::Clo" +
      "ud::AIPlatform::V1beta1::Schema::Predict" +
      "::Predictionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ClassificationPredictionResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ClassificationPredictionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ClassificationPredictionResult_descriptor,
        new java.lang.String[] { "Ids", "DisplayNames", "Confidences", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
