// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/instance/text_classification.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.instance;

public final class TextClassificationPredictionInstanceProto {
  private TextClassificationPredictionInstanceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_TextClassificationPredictionInstance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_TextClassificationPredictionInstance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nQgoogle/cloud/aiplatform/v1beta1/schema" +
      "/predict/instance/text_classification.pr" +
      "oto\0227google.cloud.aiplatform.v1beta1.sch" +
      "ema.predict.instance\032\034google/api/annotat" +
      "ions.proto\"J\n$TextClassificationPredicti" +
      "onInstance\022\017\n\007content\030\001 \001(\t\022\021\n\tmime_type" +
      "\030\002 \001(\tB\377\002\n;com.google.cloud.aiplatform.v" +
      "1beta1.schema.predict.instanceB)TextClas" +
      "sificationPredictionInstanceProtoP\001Z_goo" +
      "gle.golang.org/genproto/googleapis/cloud" +
      "/aiplatform/v1beta1/schema/predict/insta" +
      "nce;instance\252\0027Google.Cloud.AIPlatform.V" +
      "1Beta1.Schema.Predict.Instance\312\0027Google\\" +
      "Cloud\\AIPlatform\\V1beta1\\Schema\\Predict\\" +
      "Instance\352\002=Google::Cloud::AIPlatform::V1" +
      "beta1::Schema::Predict::Instanceb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_TextClassificationPredictionInstance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_TextClassificationPredictionInstance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_TextClassificationPredictionInstance_descriptor,
        new java.lang.String[] { "Content", "MimeType", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}