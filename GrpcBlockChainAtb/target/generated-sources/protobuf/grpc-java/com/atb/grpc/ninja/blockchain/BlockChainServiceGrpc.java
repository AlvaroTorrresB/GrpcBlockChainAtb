package com.atb.grpc.ninja.blockchain;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: blockchain.proto")
public final class BlockChainServiceGrpc {

  private BlockChainServiceGrpc() {}

  public static final String SERVICE_NAME = "com.atb.grpc.ninja.blockchain.BlockChainService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.atb.grpc.ninja.blockchain.Block,
      com.atb.grpc.ninja.blockchain.BlockConfirm> getAddBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addBlock",
      requestType = com.atb.grpc.ninja.blockchain.Block.class,
      responseType = com.atb.grpc.ninja.blockchain.BlockConfirm.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.atb.grpc.ninja.blockchain.Block,
      com.atb.grpc.ninja.blockchain.BlockConfirm> getAddBlockMethod() {
    io.grpc.MethodDescriptor<com.atb.grpc.ninja.blockchain.Block, com.atb.grpc.ninja.blockchain.BlockConfirm> getAddBlockMethod;
    if ((getAddBlockMethod = BlockChainServiceGrpc.getAddBlockMethod) == null) {
      synchronized (BlockChainServiceGrpc.class) {
        if ((getAddBlockMethod = BlockChainServiceGrpc.getAddBlockMethod) == null) {
          BlockChainServiceGrpc.getAddBlockMethod = getAddBlockMethod = 
              io.grpc.MethodDescriptor.<com.atb.grpc.ninja.blockchain.Block, com.atb.grpc.ninja.blockchain.BlockConfirm>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.atb.grpc.ninja.blockchain.BlockChainService", "addBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atb.grpc.ninja.blockchain.Block.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atb.grpc.ninja.blockchain.BlockConfirm.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainServiceMethodDescriptorSupplier("addBlock"))
                  .build();
          }
        }
     }
     return getAddBlockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BlockChainServiceStub newStub(io.grpc.Channel channel) {
    return new BlockChainServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BlockChainServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BlockChainServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BlockChainServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BlockChainServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BlockChainServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addBlock(com.atb.grpc.ninja.blockchain.Block request,
        io.grpc.stub.StreamObserver<com.atb.grpc.ninja.blockchain.BlockConfirm> responseObserver) {
      asyncUnimplementedUnaryCall(getAddBlockMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.atb.grpc.ninja.blockchain.Block,
                com.atb.grpc.ninja.blockchain.BlockConfirm>(
                  this, METHODID_ADD_BLOCK)))
          .build();
    }
  }

  /**
   */
  public static final class BlockChainServiceStub extends io.grpc.stub.AbstractStub<BlockChainServiceStub> {
    private BlockChainServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BlockChainServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlockChainServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BlockChainServiceStub(channel, callOptions);
    }

    /**
     */
    public void addBlock(com.atb.grpc.ninja.blockchain.Block request,
        io.grpc.stub.StreamObserver<com.atb.grpc.ninja.blockchain.BlockConfirm> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddBlockMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BlockChainServiceBlockingStub extends io.grpc.stub.AbstractStub<BlockChainServiceBlockingStub> {
    private BlockChainServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BlockChainServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlockChainServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BlockChainServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.atb.grpc.ninja.blockchain.BlockConfirm addBlock(com.atb.grpc.ninja.blockchain.Block request) {
      return blockingUnaryCall(
          getChannel(), getAddBlockMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BlockChainServiceFutureStub extends io.grpc.stub.AbstractStub<BlockChainServiceFutureStub> {
    private BlockChainServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BlockChainServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlockChainServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BlockChainServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.atb.grpc.ninja.blockchain.BlockConfirm> addBlock(
        com.atb.grpc.ninja.blockchain.Block request) {
      return futureUnaryCall(
          getChannel().newCall(getAddBlockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_BLOCK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BlockChainServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BlockChainServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_BLOCK:
          serviceImpl.addBlock((com.atb.grpc.ninja.blockchain.Block) request,
              (io.grpc.stub.StreamObserver<com.atb.grpc.ninja.blockchain.BlockConfirm>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BlockChainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BlockChainServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.atb.grpc.ninja.blockchain.Blockchain.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BlockChainService");
    }
  }

  private static final class BlockChainServiceFileDescriptorSupplier
      extends BlockChainServiceBaseDescriptorSupplier {
    BlockChainServiceFileDescriptorSupplier() {}
  }

  private static final class BlockChainServiceMethodDescriptorSupplier
      extends BlockChainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BlockChainServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BlockChainServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BlockChainServiceFileDescriptorSupplier())
              .addMethod(getAddBlockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
