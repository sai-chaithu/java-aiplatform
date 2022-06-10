/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/job_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface SearchModelDeploymentMonitoringStatsAnomaliesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.SearchModelDeploymentMonitoringStatsAnomaliesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Stats retrieved for requested objectives.
   * There are at most 1000
   * [ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies.prediction_stats][google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies.prediction_stats]
   * in the response.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies monitoring_stats = 1;
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies>
      getMonitoringStatsList();
  /**
   *
   *
   * <pre>
   * Stats retrieved for requested objectives.
   * There are at most 1000
   * [ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies.prediction_stats][google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies.prediction_stats]
   * in the response.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies monitoring_stats = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies getMonitoringStats(int index);
  /**
   *
   *
   * <pre>
   * Stats retrieved for requested objectives.
   * There are at most 1000
   * [ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies.prediction_stats][google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies.prediction_stats]
   * in the response.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies monitoring_stats = 1;
   * </code>
   */
  int getMonitoringStatsCount();
  /**
   *
   *
   * <pre>
   * Stats retrieved for requested objectives.
   * There are at most 1000
   * [ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies.prediction_stats][google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies.prediction_stats]
   * in the response.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies monitoring_stats = 1;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomaliesOrBuilder>
      getMonitoringStatsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Stats retrieved for requested objectives.
   * There are at most 1000
   * [ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies.prediction_stats][google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies.prediction_stats]
   * in the response.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies monitoring_stats = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomaliesOrBuilder
      getMonitoringStatsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The page token that can be used by the next
   * [JobService.SearchModelDeploymentMonitoringStatsAnomalies][google.cloud.aiplatform.v1beta1.JobService.SearchModelDeploymentMonitoringStatsAnomalies]
   * call.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * The page token that can be used by the next
   * [JobService.SearchModelDeploymentMonitoringStatsAnomalies][google.cloud.aiplatform.v1beta1.JobService.SearchModelDeploymentMonitoringStatsAnomalies]
   * call.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
