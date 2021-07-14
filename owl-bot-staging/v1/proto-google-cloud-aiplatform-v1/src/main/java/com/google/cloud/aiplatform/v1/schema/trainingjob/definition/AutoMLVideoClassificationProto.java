// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_video_classification.proto

package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

public final class AutoMLVideoClassificationProto {
  private AutoMLVideoClassificationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nZgoogle/cloud/aiplatform/v1/schema/trai" +
      "ningjob/definition/automl_video_classifi" +
      "cation.proto\0228google.cloud.aiplatform.v1" +
      ".schema.trainingjob.definition\032\034google/a" +
      "pi/annotations.proto\"\206\001\n\031AutoMlVideoClas" +
      "sification\022i\n\006inputs\030\001 \001(\0132Y.google.clou" +
      "d.aiplatform.v1.schema.trainingjob.defin" +
      "ition.AutoMlVideoClassificationInputs\"\205\002" +
      "\n\037AutoMlVideoClassificationInputs\022w\n\nmod" +
      "el_type\030\001 \001(\0162c.google.cloud.aiplatform." +
      "v1.schema.trainingjob.definition.AutoMlV" +
      "ideoClassificationInputs.ModelType\"i\n\tMo" +
      "delType\022\032\n\026MODEL_TYPE_UNSPECIFIED\020\000\022\t\n\005C" +
      "LOUD\020\001\022\026\n\022MOBILE_VERSATILE_1\020\002\022\035\n\031MOBILE" +
      "_JETSON_VERSATILE_1\020\003B\373\002\n<com.google.clo" +
      "ud.aiplatform.v1.schema.trainingjob.defi" +
      "nitionB\036AutoMLVideoClassificationProtoP\001" +
      "Zbgoogle.golang.org/genproto/googleapis/" +
      "cloud/aiplatform/v1/schema/trainingjob/d" +
      "efinition;definition\252\0028Google.Cloud.AIPl" +
      "atform.V1.Schema.TrainingJob.Definition\312" +
      "\0028Google\\Cloud\\AIPlatform\\V1\\Schema\\Trai" +
      "ningJob\\Definition\352\002>Google::Cloud::AIPl" +
      "atform::V1::Schema::TrainingJob::Definit" +
      "ionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassification_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassification_descriptor,
        new java.lang.String[] { "Inputs", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_descriptor,
        new java.lang.String[] { "ModelType", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
