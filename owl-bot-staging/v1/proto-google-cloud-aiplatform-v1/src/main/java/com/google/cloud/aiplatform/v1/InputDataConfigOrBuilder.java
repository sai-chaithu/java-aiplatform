// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/training_pipeline.proto

package com.google.cloud.aiplatform.v1;

public interface InputDataConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.InputDataConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Split based on fractions defining the size of each set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FractionSplit fraction_split = 2;</code>
   * @return Whether the fractionSplit field is set.
   */
  boolean hasFractionSplit();
  /**
   * <pre>
   * Split based on fractions defining the size of each set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FractionSplit fraction_split = 2;</code>
   * @return The fractionSplit.
   */
  com.google.cloud.aiplatform.v1.FractionSplit getFractionSplit();
  /**
   * <pre>
   * Split based on fractions defining the size of each set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FractionSplit fraction_split = 2;</code>
   */
  com.google.cloud.aiplatform.v1.FractionSplitOrBuilder getFractionSplitOrBuilder();

  /**
   * <pre>
   * Split based on the provided filters for each set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FilterSplit filter_split = 3;</code>
   * @return Whether the filterSplit field is set.
   */
  boolean hasFilterSplit();
  /**
   * <pre>
   * Split based on the provided filters for each set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FilterSplit filter_split = 3;</code>
   * @return The filterSplit.
   */
  com.google.cloud.aiplatform.v1.FilterSplit getFilterSplit();
  /**
   * <pre>
   * Split based on the provided filters for each set.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FilterSplit filter_split = 3;</code>
   */
  com.google.cloud.aiplatform.v1.FilterSplitOrBuilder getFilterSplitOrBuilder();

  /**
   * <pre>
   * Supported only for tabular Datasets.
   * Split based on a predefined key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.PredefinedSplit predefined_split = 4;</code>
   * @return Whether the predefinedSplit field is set.
   */
  boolean hasPredefinedSplit();
  /**
   * <pre>
   * Supported only for tabular Datasets.
   * Split based on a predefined key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.PredefinedSplit predefined_split = 4;</code>
   * @return The predefinedSplit.
   */
  com.google.cloud.aiplatform.v1.PredefinedSplit getPredefinedSplit();
  /**
   * <pre>
   * Supported only for tabular Datasets.
   * Split based on a predefined key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.PredefinedSplit predefined_split = 4;</code>
   */
  com.google.cloud.aiplatform.v1.PredefinedSplitOrBuilder getPredefinedSplitOrBuilder();

  /**
   * <pre>
   * Supported only for tabular Datasets.
   * Split based on the timestamp of the input data pieces.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TimestampSplit timestamp_split = 5;</code>
   * @return Whether the timestampSplit field is set.
   */
  boolean hasTimestampSplit();
  /**
   * <pre>
   * Supported only for tabular Datasets.
   * Split based on the timestamp of the input data pieces.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TimestampSplit timestamp_split = 5;</code>
   * @return The timestampSplit.
   */
  com.google.cloud.aiplatform.v1.TimestampSplit getTimestampSplit();
  /**
   * <pre>
   * Supported only for tabular Datasets.
   * Split based on the timestamp of the input data pieces.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TimestampSplit timestamp_split = 5;</code>
   */
  com.google.cloud.aiplatform.v1.TimestampSplitOrBuilder getTimestampSplitOrBuilder();

  /**
   * <pre>
   * Supported only for tabular Datasets.
   * Split based on the distribution of the specified column.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.StratifiedSplit stratified_split = 12;</code>
   * @return Whether the stratifiedSplit field is set.
   */
  boolean hasStratifiedSplit();
  /**
   * <pre>
   * Supported only for tabular Datasets.
   * Split based on the distribution of the specified column.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.StratifiedSplit stratified_split = 12;</code>
   * @return The stratifiedSplit.
   */
  com.google.cloud.aiplatform.v1.StratifiedSplit getStratifiedSplit();
  /**
   * <pre>
   * Supported only for tabular Datasets.
   * Split based on the distribution of the specified column.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.StratifiedSplit stratified_split = 12;</code>
   */
  com.google.cloud.aiplatform.v1.StratifiedSplitOrBuilder getStratifiedSplitOrBuilder();

  /**
   * <pre>
   * The Cloud Storage location where the training data is to be
   * written to. In the given directory a new directory is created with
   * name:
   * `dataset-&lt;dataset-id&gt;-&lt;annotation-type&gt;-&lt;timestamp-of-training-call&gt;`
   * where timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format.
   * All training input data is written into that directory.
   * The Vertex AI environment variables representing Cloud Storage
   * data URIs are represented in the Cloud Storage wildcard
   * format to support sharded data. e.g.: "gs://.../training-*.jsonl"
   * * AIP_DATA_FORMAT = "jsonl" for non-tabular data, "csv" for tabular data
   * * AIP_TRAINING_DATA_URI =
   * "gcs_destination/dataset-&lt;dataset-id&gt;-&lt;annotation-type&gt;-&lt;time&gt;/training-*.${AIP_DATA_FORMAT}"
   * * AIP_VALIDATION_DATA_URI =
   * "gcs_destination/dataset-&lt;dataset-id&gt;-&lt;annotation-type&gt;-&lt;time&gt;/validation-*.${AIP_DATA_FORMAT}"
   * * AIP_TEST_DATA_URI =
   * "gcs_destination/dataset-&lt;dataset-id&gt;-&lt;annotation-type&gt;-&lt;time&gt;/test-*.${AIP_DATA_FORMAT}"
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 8;</code>
   * @return Whether the gcsDestination field is set.
   */
  boolean hasGcsDestination();
  /**
   * <pre>
   * The Cloud Storage location where the training data is to be
   * written to. In the given directory a new directory is created with
   * name:
   * `dataset-&lt;dataset-id&gt;-&lt;annotation-type&gt;-&lt;timestamp-of-training-call&gt;`
   * where timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format.
   * All training input data is written into that directory.
   * The Vertex AI environment variables representing Cloud Storage
   * data URIs are represented in the Cloud Storage wildcard
   * format to support sharded data. e.g.: "gs://.../training-*.jsonl"
   * * AIP_DATA_FORMAT = "jsonl" for non-tabular data, "csv" for tabular data
   * * AIP_TRAINING_DATA_URI =
   * "gcs_destination/dataset-&lt;dataset-id&gt;-&lt;annotation-type&gt;-&lt;time&gt;/training-*.${AIP_DATA_FORMAT}"
   * * AIP_VALIDATION_DATA_URI =
   * "gcs_destination/dataset-&lt;dataset-id&gt;-&lt;annotation-type&gt;-&lt;time&gt;/validation-*.${AIP_DATA_FORMAT}"
   * * AIP_TEST_DATA_URI =
   * "gcs_destination/dataset-&lt;dataset-id&gt;-&lt;annotation-type&gt;-&lt;time&gt;/test-*.${AIP_DATA_FORMAT}"
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 8;</code>
   * @return The gcsDestination.
   */
  com.google.cloud.aiplatform.v1.GcsDestination getGcsDestination();
  /**
   * <pre>
   * The Cloud Storage location where the training data is to be
   * written to. In the given directory a new directory is created with
   * name:
   * `dataset-&lt;dataset-id&gt;-&lt;annotation-type&gt;-&lt;timestamp-of-training-call&gt;`
   * where timestamp is in YYYY-MM-DDThh:mm:ss.sssZ ISO-8601 format.
   * All training input data is written into that directory.
   * The Vertex AI environment variables representing Cloud Storage
   * data URIs are represented in the Cloud Storage wildcard
   * format to support sharded data. e.g.: "gs://.../training-*.jsonl"
   * * AIP_DATA_FORMAT = "jsonl" for non-tabular data, "csv" for tabular data
   * * AIP_TRAINING_DATA_URI =
   * "gcs_destination/dataset-&lt;dataset-id&gt;-&lt;annotation-type&gt;-&lt;time&gt;/training-*.${AIP_DATA_FORMAT}"
   * * AIP_VALIDATION_DATA_URI =
   * "gcs_destination/dataset-&lt;dataset-id&gt;-&lt;annotation-type&gt;-&lt;time&gt;/validation-*.${AIP_DATA_FORMAT}"
   * * AIP_TEST_DATA_URI =
   * "gcs_destination/dataset-&lt;dataset-id&gt;-&lt;annotation-type&gt;-&lt;time&gt;/test-*.${AIP_DATA_FORMAT}"
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GcsDestination gcs_destination = 8;</code>
   */
  com.google.cloud.aiplatform.v1.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  /**
   * <pre>
   * Only applicable to custom training with tabular Dataset with BigQuery
   * source.
   * The BigQuery project location where the training data is to be written
   * to. In the given project a new dataset is created with name
   * `dataset_&lt;dataset-id&gt;_&lt;annotation-type&gt;_&lt;timestamp-of-training-call&gt;`
   * where timestamp is in YYYY_MM_DDThh_mm_ss_sssZ format. All training
   * input data is written into that dataset. In the dataset three
   * tables are created, `training`, `validation` and `test`.
   * * AIP_DATA_FORMAT = "bigquery".
   * * AIP_TRAINING_DATA_URI  =
   * "bigquery_destination.dataset_&lt;dataset-id&gt;_&lt;annotation-type&gt;_&lt;time&gt;.training"
   * * AIP_VALIDATION_DATA_URI =
   * "bigquery_destination.dataset_&lt;dataset-id&gt;_&lt;annotation-type&gt;_&lt;time&gt;.validation"
   * * AIP_TEST_DATA_URI =
   * "bigquery_destination.dataset_&lt;dataset-id&gt;_&lt;annotation-type&gt;_&lt;time&gt;.test"
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BigQueryDestination bigquery_destination = 10;</code>
   * @return Whether the bigqueryDestination field is set.
   */
  boolean hasBigqueryDestination();
  /**
   * <pre>
   * Only applicable to custom training with tabular Dataset with BigQuery
   * source.
   * The BigQuery project location where the training data is to be written
   * to. In the given project a new dataset is created with name
   * `dataset_&lt;dataset-id&gt;_&lt;annotation-type&gt;_&lt;timestamp-of-training-call&gt;`
   * where timestamp is in YYYY_MM_DDThh_mm_ss_sssZ format. All training
   * input data is written into that dataset. In the dataset three
   * tables are created, `training`, `validation` and `test`.
   * * AIP_DATA_FORMAT = "bigquery".
   * * AIP_TRAINING_DATA_URI  =
   * "bigquery_destination.dataset_&lt;dataset-id&gt;_&lt;annotation-type&gt;_&lt;time&gt;.training"
   * * AIP_VALIDATION_DATA_URI =
   * "bigquery_destination.dataset_&lt;dataset-id&gt;_&lt;annotation-type&gt;_&lt;time&gt;.validation"
   * * AIP_TEST_DATA_URI =
   * "bigquery_destination.dataset_&lt;dataset-id&gt;_&lt;annotation-type&gt;_&lt;time&gt;.test"
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BigQueryDestination bigquery_destination = 10;</code>
   * @return The bigqueryDestination.
   */
  com.google.cloud.aiplatform.v1.BigQueryDestination getBigqueryDestination();
  /**
   * <pre>
   * Only applicable to custom training with tabular Dataset with BigQuery
   * source.
   * The BigQuery project location where the training data is to be written
   * to. In the given project a new dataset is created with name
   * `dataset_&lt;dataset-id&gt;_&lt;annotation-type&gt;_&lt;timestamp-of-training-call&gt;`
   * where timestamp is in YYYY_MM_DDThh_mm_ss_sssZ format. All training
   * input data is written into that dataset. In the dataset three
   * tables are created, `training`, `validation` and `test`.
   * * AIP_DATA_FORMAT = "bigquery".
   * * AIP_TRAINING_DATA_URI  =
   * "bigquery_destination.dataset_&lt;dataset-id&gt;_&lt;annotation-type&gt;_&lt;time&gt;.training"
   * * AIP_VALIDATION_DATA_URI =
   * "bigquery_destination.dataset_&lt;dataset-id&gt;_&lt;annotation-type&gt;_&lt;time&gt;.validation"
   * * AIP_TEST_DATA_URI =
   * "bigquery_destination.dataset_&lt;dataset-id&gt;_&lt;annotation-type&gt;_&lt;time&gt;.test"
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.BigQueryDestination bigquery_destination = 10;</code>
   */
  com.google.cloud.aiplatform.v1.BigQueryDestinationOrBuilder getBigqueryDestinationOrBuilder();

  /**
   * <pre>
   * Required. The ID of the Dataset in the same Project and Location which data will be
   * used to train the Model. The Dataset must use schema compatible with
   * Model being trained, and what is compatible should be described in the
   * used TrainingPipeline's [training_task_definition]
   * [google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition].
   * For tabular Datasets, all their data is exported to training, to pick
   * and choose from.
   * </pre>
   *
   * <code>string dataset_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The datasetId.
   */
  java.lang.String getDatasetId();
  /**
   * <pre>
   * Required. The ID of the Dataset in the same Project and Location which data will be
   * used to train the Model. The Dataset must use schema compatible with
   * Model being trained, and what is compatible should be described in the
   * used TrainingPipeline's [training_task_definition]
   * [google.cloud.aiplatform.v1.TrainingPipeline.training_task_definition].
   * For tabular Datasets, all their data is exported to training, to pick
   * and choose from.
   * </pre>
   *
   * <code>string dataset_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for datasetId.
   */
  com.google.protobuf.ByteString
      getDatasetIdBytes();

  /**
   * <pre>
   * Applicable only to Datasets that have DataItems and Annotations.
   * A filter on Annotations of the Dataset. Only Annotations that both
   * match this filter and belong to DataItems not ignored by the split method
   * are used in respectively training, validation or test role, depending on
   * the role of the DataItem they are on (for the auto-assigned that role is
   * decided by Vertex AI). A filter with same syntax as the one used in
   * [ListAnnotations][google.cloud.aiplatform.v1.DatasetService.ListAnnotations] may be used, but note
   * here it filters across all Annotations of the Dataset, and not just within
   * a single DataItem.
   * </pre>
   *
   * <code>string annotations_filter = 6;</code>
   * @return The annotationsFilter.
   */
  java.lang.String getAnnotationsFilter();
  /**
   * <pre>
   * Applicable only to Datasets that have DataItems and Annotations.
   * A filter on Annotations of the Dataset. Only Annotations that both
   * match this filter and belong to DataItems not ignored by the split method
   * are used in respectively training, validation or test role, depending on
   * the role of the DataItem they are on (for the auto-assigned that role is
   * decided by Vertex AI). A filter with same syntax as the one used in
   * [ListAnnotations][google.cloud.aiplatform.v1.DatasetService.ListAnnotations] may be used, but note
   * here it filters across all Annotations of the Dataset, and not just within
   * a single DataItem.
   * </pre>
   *
   * <code>string annotations_filter = 6;</code>
   * @return The bytes for annotationsFilter.
   */
  com.google.protobuf.ByteString
      getAnnotationsFilterBytes();

  /**
   * <pre>
   * Applicable only to custom training with Datasets that have DataItems and
   * Annotations.
   * Cloud Storage URI that points to a YAML file describing the annotation
   * schema. The schema is defined as an OpenAPI 3.0.2 [Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * The schema files that can be used here are found in
   * gs://google-cloud-aiplatform/schema/dataset/annotation/ , note that the
   * chosen schema must be consistent with
   * [metadata][google.cloud.aiplatform.v1.Dataset.metadata_schema_uri] of the Dataset specified by
   * [dataset_id][google.cloud.aiplatform.v1.InputDataConfig.dataset_id].
   * Only Annotations that both match this schema and belong to DataItems not
   * ignored by the split method are used in respectively training, validation
   * or test role, depending on the role of the DataItem they are on.
   * When used in conjunction with [annotations_filter][google.cloud.aiplatform.v1.InputDataConfig.annotations_filter], the Annotations used
   * for training are filtered by both [annotations_filter][google.cloud.aiplatform.v1.InputDataConfig.annotations_filter] and
   * [annotation_schema_uri][google.cloud.aiplatform.v1.InputDataConfig.annotation_schema_uri].
   * </pre>
   *
   * <code>string annotation_schema_uri = 9;</code>
   * @return The annotationSchemaUri.
   */
  java.lang.String getAnnotationSchemaUri();
  /**
   * <pre>
   * Applicable only to custom training with Datasets that have DataItems and
   * Annotations.
   * Cloud Storage URI that points to a YAML file describing the annotation
   * schema. The schema is defined as an OpenAPI 3.0.2 [Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * The schema files that can be used here are found in
   * gs://google-cloud-aiplatform/schema/dataset/annotation/ , note that the
   * chosen schema must be consistent with
   * [metadata][google.cloud.aiplatform.v1.Dataset.metadata_schema_uri] of the Dataset specified by
   * [dataset_id][google.cloud.aiplatform.v1.InputDataConfig.dataset_id].
   * Only Annotations that both match this schema and belong to DataItems not
   * ignored by the split method are used in respectively training, validation
   * or test role, depending on the role of the DataItem they are on.
   * When used in conjunction with [annotations_filter][google.cloud.aiplatform.v1.InputDataConfig.annotations_filter], the Annotations used
   * for training are filtered by both [annotations_filter][google.cloud.aiplatform.v1.InputDataConfig.annotations_filter] and
   * [annotation_schema_uri][google.cloud.aiplatform.v1.InputDataConfig.annotation_schema_uri].
   * </pre>
   *
   * <code>string annotation_schema_uri = 9;</code>
   * @return The bytes for annotationSchemaUri.
   */
  com.google.protobuf.ByteString
      getAnnotationSchemaUriBytes();

  public com.google.cloud.aiplatform.v1.InputDataConfig.SplitCase getSplitCase();

  public com.google.cloud.aiplatform.v1.InputDataConfig.DestinationCase getDestinationCase();
}
