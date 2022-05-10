// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/index_endpoint_service.proto

package com.google.cloud.aiplatform.v1;

public final class IndexEndpointServiceProto {
  private IndexEndpointServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_CreateIndexEndpointRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateIndexEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_CreateIndexEndpointOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateIndexEndpointOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_GetIndexEndpointRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetIndexEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ListIndexEndpointsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListIndexEndpointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ListIndexEndpointsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListIndexEndpointsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_UpdateIndexEndpointRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateIndexEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_DeleteIndexEndpointRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeleteIndexEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_DeployIndexRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeployIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_DeployIndexResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeployIndexResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_DeployIndexOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeployIndexOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_UndeployIndexRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UndeployIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_UndeployIndexResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UndeployIndexResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_UndeployIndexOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UndeployIndexOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/aiplatform/v1/index_endpo" +
      "int_service.proto\022\032google.cloud.aiplatfo" +
      "rm.v1\032\034google/api/annotations.proto\032\027goo" +
      "gle/api/client.proto\032\037google/api/field_b" +
      "ehavior.proto\032\031google/api/resource.proto" +
      "\032/google/cloud/aiplatform/v1/index_endpo" +
      "int.proto\032*google/cloud/aiplatform/v1/op" +
      "eration.proto\032#google/longrunning/operat" +
      "ions.proto\032 google/protobuf/field_mask.p" +
      "roto\"\237\001\n\032CreateIndexEndpointRequest\0229\n\006p" +
      "arent\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapi" +
      "s.com/Location\022F\n\016index_endpoint\030\002 \001(\0132)" +
      ".google.cloud.aiplatform.v1.IndexEndpoin" +
      "tB\003\340A\002\"v\n$CreateIndexEndpointOperationMe" +
      "tadata\022N\n\020generic_metadata\030\001 \001(\01324.googl" +
      "e.cloud.aiplatform.v1.GenericOperationMe" +
      "tadata\"X\n\027GetIndexEndpointRequest\022=\n\004nam" +
      "e\030\001 \001(\tB/\340A\002\372A)\n\'aiplatform.googleapis.c" +
      "om/IndexEndpoint\"\320\001\n\031ListIndexEndpointsR" +
      "equest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!location" +
      "s.googleapis.com/Location\022\023\n\006filter\030\002 \001(" +
      "\tB\003\340A\001\022\026\n\tpage_size\030\003 \001(\005B\003\340A\001\022\027\n\npage_t" +
      "oken\030\004 \001(\tB\003\340A\001\0222\n\tread_mask\030\005 \001(\0132\032.goo" +
      "gle.protobuf.FieldMaskB\003\340A\001\"y\n\032ListIndex" +
      "EndpointsResponse\022B\n\017index_endpoints\030\001 \003" +
      "(\0132).google.cloud.aiplatform.v1.IndexEnd" +
      "point\022\027\n\017next_page_token\030\002 \001(\t\"\232\001\n\032Updat" +
      "eIndexEndpointRequest\022F\n\016index_endpoint\030" +
      "\001 \001(\0132).google.cloud.aiplatform.v1.Index" +
      "EndpointB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.goo" +
      "gle.protobuf.FieldMaskB\003\340A\002\"[\n\032DeleteInd" +
      "exEndpointRequest\022=\n\004name\030\001 \001(\tB/\340A\002\372A)\n" +
      "\'aiplatform.googleapis.com/IndexEndpoint" +
      "\"\245\001\n\022DeployIndexRequest\022G\n\016index_endpoin" +
      "t\030\001 \001(\tB/\340A\002\372A)\n\'aiplatform.googleapis.c" +
      "om/IndexEndpoint\022F\n\016deployed_index\030\002 \001(\013" +
      "2).google.cloud.aiplatform.v1.DeployedIn" +
      "dexB\003\340A\002\"X\n\023DeployIndexResponse\022A\n\016deplo" +
      "yed_index\030\001 \001(\0132).google.cloud.aiplatfor" +
      "m.v1.DeployedIndex\"\211\001\n\034DeployIndexOperat" +
      "ionMetadata\022N\n\020generic_metadata\030\001 \001(\01324." +
      "google.cloud.aiplatform.v1.GenericOperat" +
      "ionMetadata\022\031\n\021deployed_index_id\030\002 \001(\t\"\177" +
      "\n\024UndeployIndexRequest\022G\n\016index_endpoint" +
      "\030\001 \001(\tB/\340A\002\372A)\n\'aiplatform.googleapis.co" +
      "m/IndexEndpoint\022\036\n\021deployed_index_id\030\002 \001" +
      "(\tB\003\340A\002\"\027\n\025UndeployIndexResponse\"p\n\036Unde" +
      "ployIndexOperationMetadata\022N\n\020generic_me" +
      "tadata\030\001 \001(\01324.google.cloud.aiplatform.v" +
      "1.GenericOperationMetadata\"\255\001\n\032MutateDep" +
      "loyedIndexRequest\022G\n\016index_endpoint\030\001 \001(" +
      "\tB/\340A\002\372A)\n\'aiplatform.googleapis.com/Ind" +
      "exEndpoint\022F\n\016deployed_index\030\002 \001(\0132).goo" +
      "gle.cloud.aiplatform.v1.DeployedIndexB\003\340" +
      "A\002\"`\n\033MutateDeployedIndexResponse\022A\n\016dep" +
      "loyed_index\030\001 \001(\0132).google.cloud.aiplatf" +
      "orm.v1.DeployedIndex\"\221\001\n$MutateDeployedI" +
      "ndexOperationMetadata\022N\n\020generic_metadat" +
      "a\030\001 \001(\01324.google.cloud.aiplatform.v1.Gen" +
      "ericOperationMetadata\022\031\n\021deployed_index_" +
      "id\030\002 \001(\t2\257\020\n\024IndexEndpointService\022\211\002\n\023Cr" +
      "eateIndexEndpoint\0226.google.cloud.aiplatf" +
      "orm.v1.CreateIndexEndpointRequest\032\035.goog" +
      "le.longrunning.Operation\"\232\001\202\323\344\223\002D\"2/v1/{" +
      "parent=projects/*/locations/*}/indexEndp" +
      "oints:\016index_endpoint\332A\025parent,index_end" +
      "point\312A5\n\rIndexEndpoint\022$CreateIndexEndp" +
      "ointOperationMetadata\022\265\001\n\020GetIndexEndpoi" +
      "nt\0223.google.cloud.aiplatform.v1.GetIndex" +
      "EndpointRequest\032).google.cloud.aiplatfor" +
      "m.v1.IndexEndpoint\"A\202\323\344\223\0024\0222/v1/{name=pr" +
      "ojects/*/locations/*/indexEndpoints/*}\332A" +
      "\004name\022\310\001\n\022ListIndexEndpoints\0225.google.cl" +
      "oud.aiplatform.v1.ListIndexEndpointsRequ" +
      "est\0326.google.cloud.aiplatform.v1.ListInd" +
      "exEndpointsResponse\"C\202\323\344\223\0024\0222/v1/{parent" +
      "=projects/*/locations/*}/indexEndpoints\332" +
      "A\006parent\022\360\001\n\023UpdateIndexEndpoint\0226.googl" +
      "e.cloud.aiplatform.v1.UpdateIndexEndpoin" +
      "tRequest\032).google.cloud.aiplatform.v1.In" +
      "dexEndpoint\"v\202\323\344\223\002S2A/v1/{index_endpoint" +
      ".name=projects/*/locations/*/indexEndpoi" +
      "nts/*}:\016index_endpoint\332A\032index_endpoint," +
      "update_mask\022\342\001\n\023DeleteIndexEndpoint\0226.go" +
      "ogle.cloud.aiplatform.v1.DeleteIndexEndp" +
      "ointRequest\032\035.google.longrunning.Operati" +
      "on\"t\202\323\344\223\0024*2/v1/{name=projects/*/locatio" +
      "ns/*/indexEndpoints/*}\332A\004name\312A0\n\025google" +
      ".protobuf.Empty\022\027DeleteOperationMetadata" +
      "\022\210\002\n\013DeployIndex\022..google.cloud.aiplatfo" +
      "rm.v1.DeployIndexRequest\032\035.google.longru" +
      "nning.Operation\"\251\001\202\323\344\223\002M\"H/v1/{index_end" +
      "point=projects/*/locations/*/indexEndpoi" +
      "nts/*}:deployIndex:\001*\332A\035index_endpoint,d" +
      "eployed_index\312A3\n\023DeployIndexResponse\022\034D" +
      "eployIndexOperationMetadata\022\225\002\n\rUndeploy" +
      "Index\0220.google.cloud.aiplatform.v1.Undep" +
      "loyIndexRequest\032\035.google.longrunning.Ope" +
      "ration\"\262\001\202\323\344\223\002O\"J/v1/{index_endpoint=pro" +
      "jects/*/locations/*/indexEndpoints/*}:un" +
      "deployIndex:\001*\332A index_endpoint,deployed" +
      "_index_id\312A7\n\025UndeployIndexResponse\022\036Und" +
      "eployIndexOperationMetadata\022\275\002\n\023MutateDe" +
      "ployedIndex\0226.google.cloud.aiplatform.v1" +
      ".MutateDeployedIndexRequest\032\035.google.lon" +
      "grunning.Operation\"\316\001\202\323\344\223\002b\"P/v1/{index_" +
      "endpoint=projects/*/locations/*/indexEnd" +
      "points/*}:mutateDeployedIndex:\016deployed_" +
      "index\332A\035index_endpoint,deployed_index\312AC" +
      "\n\033MutateDeployedIndexResponse\022$MutateDep" +
      "loyedIndexOperationMetadata\032M\312A\031aiplatfo" +
      "rm.googleapis.com\322A.https://www.googleap" +
      "is.com/auth/cloud-platformB\335\001\n\036com.googl" +
      "e.cloud.aiplatform.v1B\031IndexEndpointServ" +
      "iceProtoP\001ZDgoogle.golang.org/genproto/g" +
      "oogleapis/cloud/aiplatform/v1;aiplatform" +
      "\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\C" +
      "loud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPl" +
      "atform::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.IndexEndpointProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.OperationProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_CreateIndexEndpointRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CreateIndexEndpointRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_CreateIndexEndpointRequest_descriptor,
        new java.lang.String[] { "Parent", "IndexEndpoint", });
    internal_static_google_cloud_aiplatform_v1_CreateIndexEndpointOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_CreateIndexEndpointOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_CreateIndexEndpointOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", });
    internal_static_google_cloud_aiplatform_v1_GetIndexEndpointRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_GetIndexEndpointRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_GetIndexEndpointRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_aiplatform_v1_ListIndexEndpointsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ListIndexEndpointsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ListIndexEndpointsRequest_descriptor,
        new java.lang.String[] { "Parent", "Filter", "PageSize", "PageToken", "ReadMask", });
    internal_static_google_cloud_aiplatform_v1_ListIndexEndpointsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_ListIndexEndpointsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ListIndexEndpointsResponse_descriptor,
        new java.lang.String[] { "IndexEndpoints", "NextPageToken", });
    internal_static_google_cloud_aiplatform_v1_UpdateIndexEndpointRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_UpdateIndexEndpointRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_UpdateIndexEndpointRequest_descriptor,
        new java.lang.String[] { "IndexEndpoint", "UpdateMask", });
    internal_static_google_cloud_aiplatform_v1_DeleteIndexEndpointRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_DeleteIndexEndpointRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_DeleteIndexEndpointRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_aiplatform_v1_DeployIndexRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_DeployIndexRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_DeployIndexRequest_descriptor,
        new java.lang.String[] { "IndexEndpoint", "DeployedIndex", });
    internal_static_google_cloud_aiplatform_v1_DeployIndexResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_DeployIndexResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_DeployIndexResponse_descriptor,
        new java.lang.String[] { "DeployedIndex", });
    internal_static_google_cloud_aiplatform_v1_DeployIndexOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1_DeployIndexOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_DeployIndexOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", "DeployedIndexId", });
    internal_static_google_cloud_aiplatform_v1_UndeployIndexRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1_UndeployIndexRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_UndeployIndexRequest_descriptor,
        new java.lang.String[] { "IndexEndpoint", "DeployedIndexId", });
    internal_static_google_cloud_aiplatform_v1_UndeployIndexResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1_UndeployIndexResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_UndeployIndexResponse_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_aiplatform_v1_UndeployIndexOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1_UndeployIndexOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_UndeployIndexOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", });
    internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexRequest_descriptor,
        new java.lang.String[] { "IndexEndpoint", "DeployedIndex", });
    internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexResponse_descriptor,
        new java.lang.String[] { "DeployedIndex", });
    internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", "DeployedIndexId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IndexEndpointProto.getDescriptor();
    com.google.cloud.aiplatform.v1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
