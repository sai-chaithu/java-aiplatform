// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/endpoint.proto

package com.google.cloud.aiplatform.v1beta1;

public interface PredictRequestResponseLoggingConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.PredictRequestResponseLoggingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If logging is enabled or not.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <pre>
   * Percentage of requests to be logged, expressed as a fraction in
   * range(0,1].
   * </pre>
   *
   * <code>double sampling_rate = 2;</code>
   * @return The samplingRate.
   */
  double getSamplingRate();

  /**
   * <pre>
   * BigQuery table for logging.
   * If only given a project, a new dataset will be created with name
   * `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where
   * &lt;endpoint-display-name&gt; will be made BigQuery-dataset-name compatible (e.g.
   * most special characters will become underscores). If no table name is
   * given, a new table will be created with name `request_response_logging`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.BigQueryDestination bigquery_destination = 3;</code>
   * @return Whether the bigqueryDestination field is set.
   */
  boolean hasBigqueryDestination();
  /**
   * <pre>
   * BigQuery table for logging.
   * If only given a project, a new dataset will be created with name
   * `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where
   * &lt;endpoint-display-name&gt; will be made BigQuery-dataset-name compatible (e.g.
   * most special characters will become underscores). If no table name is
   * given, a new table will be created with name `request_response_logging`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.BigQueryDestination bigquery_destination = 3;</code>
   * @return The bigqueryDestination.
   */
  com.google.cloud.aiplatform.v1beta1.BigQueryDestination getBigqueryDestination();
  /**
   * <pre>
   * BigQuery table for logging.
   * If only given a project, a new dataset will be created with name
   * `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where
   * &lt;endpoint-display-name&gt; will be made BigQuery-dataset-name compatible (e.g.
   * most special characters will become underscores). If no table name is
   * given, a new table will be created with name `request_response_logging`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.BigQueryDestination bigquery_destination = 3;</code>
   */
  com.google.cloud.aiplatform.v1beta1.BigQueryDestinationOrBuilder getBigqueryDestinationOrBuilder();
}