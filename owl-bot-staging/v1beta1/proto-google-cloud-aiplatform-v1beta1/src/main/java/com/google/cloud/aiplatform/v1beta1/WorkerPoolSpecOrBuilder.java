// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/custom_job.proto

package com.google.cloud.aiplatform.v1beta1;

public interface WorkerPoolSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.WorkerPoolSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The custom container task.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ContainerSpec container_spec = 6;</code>
   * @return Whether the containerSpec field is set.
   */
  boolean hasContainerSpec();
  /**
   * <pre>
   * The custom container task.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ContainerSpec container_spec = 6;</code>
   * @return The containerSpec.
   */
  com.google.cloud.aiplatform.v1beta1.ContainerSpec getContainerSpec();
  /**
   * <pre>
   * The custom container task.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ContainerSpec container_spec = 6;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ContainerSpecOrBuilder getContainerSpecOrBuilder();

  /**
   * <pre>
   * The Python packaged task.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PythonPackageSpec python_package_spec = 7;</code>
   * @return Whether the pythonPackageSpec field is set.
   */
  boolean hasPythonPackageSpec();
  /**
   * <pre>
   * The Python packaged task.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PythonPackageSpec python_package_spec = 7;</code>
   * @return The pythonPackageSpec.
   */
  com.google.cloud.aiplatform.v1beta1.PythonPackageSpec getPythonPackageSpec();
  /**
   * <pre>
   * The Python packaged task.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PythonPackageSpec python_package_spec = 7;</code>
   */
  com.google.cloud.aiplatform.v1beta1.PythonPackageSpecOrBuilder getPythonPackageSpecOrBuilder();

  /**
   * <pre>
   * Optional. Immutable. The specification of a single machine.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the machineSpec field is set.
   */
  boolean hasMachineSpec();
  /**
   * <pre>
   * Optional. Immutable. The specification of a single machine.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The machineSpec.
   */
  com.google.cloud.aiplatform.v1beta1.MachineSpec getMachineSpec();
  /**
   * <pre>
   * Optional. Immutable. The specification of a single machine.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.cloud.aiplatform.v1beta1.MachineSpecOrBuilder getMachineSpecOrBuilder();

  /**
   * <pre>
   * Optional. The number of worker replicas to use for this worker pool.
   * </pre>
   *
   * <code>int64 replica_count = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The replicaCount.
   */
  long getReplicaCount();

  /**
   * <pre>
   * Optional. List of NFS mount spec.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NfsMount nfs_mounts = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.NfsMount> 
      getNfsMountsList();
  /**
   * <pre>
   * Optional. List of NFS mount spec.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NfsMount nfs_mounts = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.aiplatform.v1beta1.NfsMount getNfsMounts(int index);
  /**
   * <pre>
   * Optional. List of NFS mount spec.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NfsMount nfs_mounts = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getNfsMountsCount();
  /**
   * <pre>
   * Optional. List of NFS mount spec.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NfsMount nfs_mounts = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.NfsMountOrBuilder> 
      getNfsMountsOrBuilderList();
  /**
   * <pre>
   * Optional. List of NFS mount spec.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NfsMount nfs_mounts = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.aiplatform.v1beta1.NfsMountOrBuilder getNfsMountsOrBuilder(
      int index);

  /**
   * <pre>
   * Disk spec.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DiskSpec disk_spec = 5;</code>
   * @return Whether the diskSpec field is set.
   */
  boolean hasDiskSpec();
  /**
   * <pre>
   * Disk spec.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DiskSpec disk_spec = 5;</code>
   * @return The diskSpec.
   */
  com.google.cloud.aiplatform.v1beta1.DiskSpec getDiskSpec();
  /**
   * <pre>
   * Disk spec.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DiskSpec disk_spec = 5;</code>
   */
  com.google.cloud.aiplatform.v1beta1.DiskSpecOrBuilder getDiskSpecOrBuilder();

  public com.google.cloud.aiplatform.v1beta1.WorkerPoolSpec.TaskCase getTaskCase();
}
