// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blockchain.proto

package com.atb.grpc.ninja.blockchain;

public final class Blockchain {
  private Blockchain() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_atb_grpc_ninja_blockchain_Block_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_atb_grpc_ninja_blockchain_Block_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_atb_grpc_ninja_blockchain_BlockConfirm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_atb_grpc_ninja_blockchain_BlockConfirm_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020blockchain.proto\022\035com.atb.grpc.ninja.b" +
      "lockchain\"6\n\005Block\022\014\n\004data\030\001 \001(\t\022\014\n\004hash" +
      "\030\002 \001(\t\022\021\n\tlink_hash\030\003 \001(\t\"\037\n\014BlockConfir" +
      "m\022\017\n\007message\030\001 \001(\t2r\n\021BlockChainService\022" +
      "]\n\010addBlock\022$.com.atb.grpc.ninja.blockch" +
      "ain.Block\032+.com.atb.grpc.ninja.blockchai" +
      "n.BlockConfirmB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_atb_grpc_ninja_blockchain_Block_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_atb_grpc_ninja_blockchain_Block_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_atb_grpc_ninja_blockchain_Block_descriptor,
        new java.lang.String[] { "Data", "Hash", "LinkHash", });
    internal_static_com_atb_grpc_ninja_blockchain_BlockConfirm_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_atb_grpc_ninja_blockchain_BlockConfirm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_atb_grpc_ninja_blockchain_BlockConfirm_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}