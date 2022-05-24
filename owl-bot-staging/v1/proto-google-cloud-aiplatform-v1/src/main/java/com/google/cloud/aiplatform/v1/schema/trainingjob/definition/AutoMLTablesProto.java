// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_tables.proto

package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

public final class AutoMLTablesProto {
  private AutoMLTablesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTables_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTables_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_AutoTransformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_AutoTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericTransformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalTransformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TimestampTransformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TimestampTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextTransformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericArrayTransformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericArrayTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalArrayTransformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalArrayTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextArrayTransformation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextArrayTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nLgoogle/cloud/aiplatform/v1/schema/trai" +
      "ningjob/definition/automl_tables.proto\0228" +
      "google.cloud.aiplatform.v1.schema.traini" +
      "ngjob.definition\032\037google/api/field_behav" +
      "ior.proto\032agoogle/cloud/aiplatform/v1/sc" +
      "hema/trainingjob/definition/export_evalu" +
      "ated_data_items_config.proto\032\034google/api" +
      "/annotations.proto\"\316\001\n\014AutoMlTables\022\\\n\006i" +
      "nputs\030\001 \001(\0132L.google.cloud.aiplatform.v1" +
      ".schema.trainingjob.definition.AutoMlTab" +
      "lesInputs\022`\n\010metadata\030\002 \001(\0132N.google.clo" +
      "ud.aiplatform.v1.schema.trainingjob.defi" +
      "nition.AutoMlTablesMetadata\"\364\021\n\022AutoMlTa" +
      "blesInputs\022-\n#optimization_objective_rec" +
      "all_value\030\005 \001(\002H\000\0220\n&optimization_object" +
      "ive_precision_value\030\006 \001(\002H\000\022\027\n\017predictio" +
      "n_type\030\001 \001(\t\022\025\n\rtarget_column\030\002 \001(\t\022t\n\017t" +
      "ransformations\030\003 \003(\0132[.google.cloud.aipl" +
      "atform.v1.schema.trainingjob.definition." +
      "AutoMlTablesInputs.Transformation\022\036\n\026opt" +
      "imization_objective\030\004 \001(\t\022%\n\035train_budge" +
      "t_milli_node_hours\030\007 \001(\003\022\036\n\026disable_earl" +
      "y_stopping\030\010 \001(\010\022\032\n\022weight_column_name\030\t" +
      " \001(\t\022\204\001\n\"export_evaluated_data_items_con" +
      "fig\030\n \001(\0132X.google.cloud.aiplatform.v1.s" +
      "chema.trainingjob.definition.ExportEvalu" +
      "atedDataItemsConfig\022\036\n\026additional_experi" +
      "ments\030\013 \003(\t\032\200\r\n\016Transformation\022~\n\004auto\030\001" +
      " \001(\0132n.google.cloud.aiplatform.v1.schema" +
      ".trainingjob.definition.AutoMlTablesInpu" +
      "ts.Transformation.AutoTransformationH\000\022\204" +
      "\001\n\007numeric\030\002 \001(\0132q.google.cloud.aiplatfo" +
      "rm.v1.schema.trainingjob.definition.Auto" +
      "MlTablesInputs.Transformation.NumericTra" +
      "nsformationH\000\022\214\001\n\013categorical\030\003 \001(\0132u.go" +
      "ogle.cloud.aiplatform.v1.schema.training" +
      "job.definition.AutoMlTablesInputs.Transf" +
      "ormation.CategoricalTransformationH\000\022\210\001\n" +
      "\ttimestamp\030\004 \001(\0132s.google.cloud.aiplatfo" +
      "rm.v1.schema.trainingjob.definition.Auto" +
      "MlTablesInputs.Transformation.TimestampT" +
      "ransformationH\000\022~\n\004text\030\005 \001(\0132n.google.c" +
      "loud.aiplatform.v1.schema.trainingjob.de" +
      "finition.AutoMlTablesInputs.Transformati" +
      "on.TextTransformationH\000\022\222\001\n\020repeated_num" +
      "eric\030\006 \001(\0132v.google.cloud.aiplatform.v1." +
      "schema.trainingjob.definition.AutoMlTabl" +
      "esInputs.Transformation.NumericArrayTran" +
      "sformationH\000\022\232\001\n\024repeated_categorical\030\007 " +
      "\001(\0132z.google.cloud.aiplatform.v1.schema." +
      "trainingjob.definition.AutoMlTablesInput" +
      "s.Transformation.CategoricalArrayTransfo" +
      "rmationH\000\022\214\001\n\rrepeated_text\030\010 \001(\0132s.goog" +
      "le.cloud.aiplatform.v1.schema.trainingjo" +
      "b.definition.AutoMlTablesInputs.Transfor" +
      "mation.TextArrayTransformationH\000\032)\n\022Auto" +
      "Transformation\022\023\n\013column_name\030\001 \001(\t\032L\n\025N" +
      "umericTransformation\022\023\n\013column_name\030\001 \001(" +
      "\t\022\036\n\026invalid_values_allowed\030\002 \001(\010\0320\n\031Cat" +
      "egoricalTransformation\022\023\n\013column_name\030\001 " +
      "\001(\t\032c\n\027TimestampTransformation\022\023\n\013column" +
      "_name\030\001 \001(\t\022\023\n\013time_format\030\002 \001(\t\022\036\n\026inva" +
      "lid_values_allowed\030\003 \001(\010\032)\n\022TextTransfor" +
      "mation\022\023\n\013column_name\030\001 \001(\t\032Q\n\032NumericAr" +
      "rayTransformation\022\023\n\013column_name\030\001 \001(\t\022\036" +
      "\n\026invalid_values_allowed\030\002 \001(\010\0325\n\036Catego" +
      "ricalArrayTransformation\022\023\n\013column_name\030" +
      "\001 \001(\t\032.\n\027TextArrayTransformation\022\023\n\013colu" +
      "mn_name\030\001 \001(\tB\027\n\025transformation_detailB*" +
      "\n(additional_optimization_objective_conf" +
      "ig\";\n\024AutoMlTablesMetadata\022#\n\033train_cost" +
      "_milli_node_hours\030\001 \001(\003B\356\002\n<com.google.c" +
      "loud.aiplatform.v1.schema.trainingjob.de" +
      "finitionB\021AutoMLTablesProtoP\001Zbgoogle.go" +
      "lang.org/genproto/googleapis/cloud/aipla" +
      "tform/v1/schema/trainingjob/definition;d" +
      "efinition\252\0028Google.Cloud.AIPlatform.V1.S" +
      "chema.TrainingJob.Definition\312\0028Google\\Cl" +
      "oud\\AIPlatform\\V1\\Schema\\TrainingJob\\Def" +
      "inition\352\002>Google::Cloud::AIPlatform::V1:" +
      ":Schema::TrainingJob::Definitionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfigProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTables_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTables_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTables_descriptor,
        new java.lang.String[] { "Inputs", "Metadata", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_descriptor,
        new java.lang.String[] { "OptimizationObjectiveRecallValue", "OptimizationObjectivePrecisionValue", "PredictionType", "TargetColumn", "Transformations", "OptimizationObjective", "TrainBudgetMilliNodeHours", "DisableEarlyStopping", "WeightColumnName", "ExportEvaluatedDataItemsConfig", "AdditionalExperiments", "AdditionalOptimizationObjectiveConfig", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor,
        new java.lang.String[] { "Auto", "Numeric", "Categorical", "Timestamp", "Text", "RepeatedNumeric", "RepeatedCategorical", "RepeatedText", "TransformationDetail", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_AutoTransformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_AutoTransformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_AutoTransformation_descriptor,
        new java.lang.String[] { "ColumnName", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericTransformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericTransformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericTransformation_descriptor,
        new java.lang.String[] { "ColumnName", "InvalidValuesAllowed", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalTransformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalTransformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalTransformation_descriptor,
        new java.lang.String[] { "ColumnName", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TimestampTransformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TimestampTransformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TimestampTransformation_descriptor,
        new java.lang.String[] { "ColumnName", "TimeFormat", "InvalidValuesAllowed", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextTransformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextTransformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextTransformation_descriptor,
        new java.lang.String[] { "ColumnName", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericArrayTransformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericArrayTransformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericArrayTransformation_descriptor,
        new java.lang.String[] { "ColumnName", "InvalidValuesAllowed", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalArrayTransformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor.getNestedTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalArrayTransformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalArrayTransformation_descriptor,
        new java.lang.String[] { "ColumnName", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextArrayTransformation_descriptor =
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor.getNestedTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextArrayTransformation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextArrayTransformation_descriptor,
        new java.lang.String[] { "ColumnName", });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_descriptor,
        new java.lang.String[] { "TrainCostMilliNodeHours", });
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfigProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}