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
// source: google/cloud/aiplatform/v1/machine_resources.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Represents a mount configuration for Network File System (NFS) to mount.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.NfsMount}
 */
public final class NfsMount extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.NfsMount)
    NfsMountOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NfsMount.newBuilder() to construct.
  private NfsMount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NfsMount() {
    server_ = "";
    path_ = "";
    mountPoint_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NfsMount();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private NfsMount(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              server_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              path_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              mountPoint_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.MachineResourcesProto
        .internal_static_google_cloud_aiplatform_v1_NfsMount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.MachineResourcesProto
        .internal_static_google_cloud_aiplatform_v1_NfsMount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.NfsMount.class,
            com.google.cloud.aiplatform.v1.NfsMount.Builder.class);
  }

  public static final int SERVER_FIELD_NUMBER = 1;
  private volatile java.lang.Object server_;
  /**
   *
   *
   * <pre>
   * Required. IP address of the NFS server.
   * </pre>
   *
   * <code>string server = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The server.
   */
  @java.lang.Override
  public java.lang.String getServer() {
    java.lang.Object ref = server_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      server_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. IP address of the NFS server.
   * </pre>
   *
   * <code>string server = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for server.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServerBytes() {
    java.lang.Object ref = server_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      server_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object path_;
  /**
   *
   *
   * <pre>
   * Required. Source path exported from NFS server.
   * Has to start with '/', and combined with the ip address, it indicates
   * the source mount path in the form of `server:path`
   * </pre>
   *
   * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Source path exported from NFS server.
   * Has to start with '/', and combined with the ip address, it indicates
   * the source mount path in the form of `server:path`
   * </pre>
   *
   * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MOUNT_POINT_FIELD_NUMBER = 3;
  private volatile java.lang.Object mountPoint_;
  /**
   *
   *
   * <pre>
   * Required. Destination mount path. The NFS will be mounted for the user under
   * /mnt/nfs/&lt;mount_point&gt;
   * </pre>
   *
   * <code>string mount_point = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The mountPoint.
   */
  @java.lang.Override
  public java.lang.String getMountPoint() {
    java.lang.Object ref = mountPoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mountPoint_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Destination mount path. The NFS will be mounted for the user under
   * /mnt/nfs/&lt;mount_point&gt;
   * </pre>
   *
   * <code>string mount_point = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for mountPoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMountPointBytes() {
    java.lang.Object ref = mountPoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      mountPoint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(server_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, server_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, path_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mountPoint_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, mountPoint_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(server_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, server_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, path_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mountPoint_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, mountPoint_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.aiplatform.v1.NfsMount)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.NfsMount other = (com.google.cloud.aiplatform.v1.NfsMount) obj;

    if (!getServer().equals(other.getServer())) return false;
    if (!getPath().equals(other.getPath())) return false;
    if (!getMountPoint().equals(other.getMountPoint())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SERVER_FIELD_NUMBER;
    hash = (53 * hash) + getServer().hashCode();
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (37 * hash) + MOUNT_POINT_FIELD_NUMBER;
    hash = (53 * hash) + getMountPoint().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.NfsMount parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.NfsMount parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.NfsMount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.NfsMount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.NfsMount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.NfsMount parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.NfsMount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.NfsMount parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.NfsMount parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.NfsMount parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.NfsMount parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.NfsMount parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.NfsMount prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Represents a mount configuration for Network File System (NFS) to mount.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.NfsMount}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.NfsMount)
      com.google.cloud.aiplatform.v1.NfsMountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.MachineResourcesProto
          .internal_static_google_cloud_aiplatform_v1_NfsMount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.MachineResourcesProto
          .internal_static_google_cloud_aiplatform_v1_NfsMount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.NfsMount.class,
              com.google.cloud.aiplatform.v1.NfsMount.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.NfsMount.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      server_ = "";

      path_ = "";

      mountPoint_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.MachineResourcesProto
          .internal_static_google_cloud_aiplatform_v1_NfsMount_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.NfsMount getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.NfsMount.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.NfsMount build() {
      com.google.cloud.aiplatform.v1.NfsMount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.NfsMount buildPartial() {
      com.google.cloud.aiplatform.v1.NfsMount result =
          new com.google.cloud.aiplatform.v1.NfsMount(this);
      result.server_ = server_;
      result.path_ = path_;
      result.mountPoint_ = mountPoint_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1.NfsMount) {
        return mergeFrom((com.google.cloud.aiplatform.v1.NfsMount) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.NfsMount other) {
      if (other == com.google.cloud.aiplatform.v1.NfsMount.getDefaultInstance()) return this;
      if (!other.getServer().isEmpty()) {
        server_ = other.server_;
        onChanged();
      }
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
      }
      if (!other.getMountPoint().isEmpty()) {
        mountPoint_ = other.mountPoint_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.aiplatform.v1.NfsMount parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1.NfsMount) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object server_ = "";
    /**
     *
     *
     * <pre>
     * Required. IP address of the NFS server.
     * </pre>
     *
     * <code>string server = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The server.
     */
    public java.lang.String getServer() {
      java.lang.Object ref = server_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        server_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. IP address of the NFS server.
     * </pre>
     *
     * <code>string server = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for server.
     */
    public com.google.protobuf.ByteString getServerBytes() {
      java.lang.Object ref = server_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        server_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. IP address of the NFS server.
     * </pre>
     *
     * <code>string server = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The server to set.
     * @return This builder for chaining.
     */
    public Builder setServer(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      server_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. IP address of the NFS server.
     * </pre>
     *
     * <code>string server = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServer() {

      server_ = getDefaultInstance().getServer();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. IP address of the NFS server.
     * </pre>
     *
     * <code>string server = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for server to set.
     * @return This builder for chaining.
     */
    public Builder setServerBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      server_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     *
     *
     * <pre>
     * Required. Source path exported from NFS server.
     * Has to start with '/', and combined with the ip address, it indicates
     * the source mount path in the form of `server:path`
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Source path exported from NFS server.
     * Has to start with '/', and combined with the ip address, it indicates
     * the source mount path in the form of `server:path`
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Source path exported from NFS server.
     * Has to start with '/', and combined with the ip address, it indicates
     * the source mount path in the form of `server:path`
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      path_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Source path exported from NFS server.
     * Has to start with '/', and combined with the ip address, it indicates
     * the source mount path in the form of `server:path`
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPath() {

      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Source path exported from NFS server.
     * Has to start with '/', and combined with the ip address, it indicates
     * the source mount path in the form of `server:path`
     * </pre>
     *
     * <code>string path = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      path_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object mountPoint_ = "";
    /**
     *
     *
     * <pre>
     * Required. Destination mount path. The NFS will be mounted for the user under
     * /mnt/nfs/&lt;mount_point&gt;
     * </pre>
     *
     * <code>string mount_point = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The mountPoint.
     */
    public java.lang.String getMountPoint() {
      java.lang.Object ref = mountPoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mountPoint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Destination mount path. The NFS will be mounted for the user under
     * /mnt/nfs/&lt;mount_point&gt;
     * </pre>
     *
     * <code>string mount_point = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for mountPoint.
     */
    public com.google.protobuf.ByteString getMountPointBytes() {
      java.lang.Object ref = mountPoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        mountPoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Destination mount path. The NFS will be mounted for the user under
     * /mnt/nfs/&lt;mount_point&gt;
     * </pre>
     *
     * <code>string mount_point = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The mountPoint to set.
     * @return This builder for chaining.
     */
    public Builder setMountPoint(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      mountPoint_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Destination mount path. The NFS will be mounted for the user under
     * /mnt/nfs/&lt;mount_point&gt;
     * </pre>
     *
     * <code>string mount_point = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMountPoint() {

      mountPoint_ = getDefaultInstance().getMountPoint();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Destination mount path. The NFS will be mounted for the user under
     * /mnt/nfs/&lt;mount_point&gt;
     * </pre>
     *
     * <code>string mount_point = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for mountPoint to set.
     * @return This builder for chaining.
     */
    public Builder setMountPointBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      mountPoint_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.NfsMount)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.NfsMount)
  private static final com.google.cloud.aiplatform.v1.NfsMount DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.NfsMount();
  }

  public static com.google.cloud.aiplatform.v1.NfsMount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NfsMount> PARSER =
      new com.google.protobuf.AbstractParser<NfsMount>() {
        @java.lang.Override
        public NfsMount parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new NfsMount(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<NfsMount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NfsMount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.NfsMount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
