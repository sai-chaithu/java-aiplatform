// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_video_classification.proto

package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

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
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n_google/cloud/aiplatform/v1beta1/schema" +
      "/trainingjob/definition/automl_video_cla" +
      "ssification.proto\022=google.cloud.aiplatfo" +
      "rm.v1beta1.schema.trainingjob.definition" +
      "\032\034google/api/annotations.proto\"\213\001\n\031AutoM" +
      "lVideoClassification\022n\n\006inputs\030\001 \001(\0132^.g" +
      "oogle.cloud.aiplatform.v1beta1.schema.tr" +
      "ainingjob.definition.AutoMlVideoClassifi" +
      "cationInputs\"\212\002\n\037AutoMlVideoClassificati" +
      "onInputs\022|\n\nmodel_type\030\001 \001(\0162h.google.cl" +
      "oud.aiplatform.v1beta1.schema.trainingjo" +
      "b.definition.AutoMlVideoClassificationIn" +
      "puts.ModelType\"i\n\tModelType\022\032\n\026MODEL_TYP" +
      "E_UNSPECIFIED\020\000\022\t\n\005CLOUD\020\001\022\026\n\022MOBILE_VER" +
      "SATILE_1\020\002\022\035\n\031MOBILE_JETSON_VERSATILE_1\020" +
      "\003B\224\003\nAcom.google.cloud.aiplatform.v1beta" +
      "1.schema.trainingjob.definitionB\036AutoMLV" +
      "ideoClassificationProtoP\001Zggoogle.golang" +
      ".org/genproto/googleapis/cloud/aiplatfor" +
      "m/v1beta1/schema/trainingjob/definition;" +
      "definition\252\002=Google.Cloud.AIPlatform.V1B" +
      "eta1.Schema.TrainingJob.Definition\312\002=Goo" +
      "gle\\Cloud\\AIPlatform\\V1beta1\\Schema\\Trai" +
      "ningJob\\Definition\352\002CGoogle::Cloud::AIPl" +
      "atform::V1beta1::Schema::TrainingJob::De" +
      "finitionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassification_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassification_descriptor,
        new java.lang.String[] { "Inputs", });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlVideoClassificationInputs_descriptor,
        new java.lang.String[] { "ModelType", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}