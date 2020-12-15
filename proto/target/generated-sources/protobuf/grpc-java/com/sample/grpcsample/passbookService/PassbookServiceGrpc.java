package com.sample.grpcsample.passbookService;

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
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: passbook-service.proto")
public final class PassbookServiceGrpc {

  private PassbookServiceGrpc() {}

  public static final String SERVICE_NAME = "PassbookService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sample.grpcsample.passbookService.PassbookRequest,
      com.sample.grpcsample.passbookService.PassbookResponseResponse> getGetTransactionHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTransactionHistory",
      requestType = com.sample.grpcsample.passbookService.PassbookRequest.class,
      responseType = com.sample.grpcsample.passbookService.PassbookResponseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sample.grpcsample.passbookService.PassbookRequest,
      com.sample.grpcsample.passbookService.PassbookResponseResponse> getGetTransactionHistoryMethod() {
    io.grpc.MethodDescriptor<com.sample.grpcsample.passbookService.PassbookRequest, com.sample.grpcsample.passbookService.PassbookResponseResponse> getGetTransactionHistoryMethod;
    if ((getGetTransactionHistoryMethod = PassbookServiceGrpc.getGetTransactionHistoryMethod) == null) {
      synchronized (PassbookServiceGrpc.class) {
        if ((getGetTransactionHistoryMethod = PassbookServiceGrpc.getGetTransactionHistoryMethod) == null) {
          PassbookServiceGrpc.getGetTransactionHistoryMethod = getGetTransactionHistoryMethod = 
              io.grpc.MethodDescriptor.<com.sample.grpcsample.passbookService.PassbookRequest, com.sample.grpcsample.passbookService.PassbookResponseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PassbookService", "getTransactionHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sample.grpcsample.passbookService.PassbookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sample.grpcsample.passbookService.PassbookResponseResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PassbookServiceMethodDescriptorSupplier("getTransactionHistory"))
                  .build();
          }
        }
     }
     return getGetTransactionHistoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PassbookServiceStub newStub(io.grpc.Channel channel) {
    return new PassbookServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PassbookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PassbookServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PassbookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PassbookServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PassbookServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTransactionHistory(com.sample.grpcsample.passbookService.PassbookRequest request,
        io.grpc.stub.StreamObserver<com.sample.grpcsample.passbookService.PassbookResponseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionHistoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTransactionHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sample.grpcsample.passbookService.PassbookRequest,
                com.sample.grpcsample.passbookService.PassbookResponseResponse>(
                  this, METHODID_GET_TRANSACTION_HISTORY)))
          .build();
    }
  }

  /**
   */
  public static final class PassbookServiceStub extends io.grpc.stub.AbstractStub<PassbookServiceStub> {
    private PassbookServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PassbookServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PassbookServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PassbookServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTransactionHistory(com.sample.grpcsample.passbookService.PassbookRequest request,
        io.grpc.stub.StreamObserver<com.sample.grpcsample.passbookService.PassbookResponseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionHistoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PassbookServiceBlockingStub extends io.grpc.stub.AbstractStub<PassbookServiceBlockingStub> {
    private PassbookServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PassbookServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PassbookServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PassbookServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sample.grpcsample.passbookService.PassbookResponseResponse getTransactionHistory(com.sample.grpcsample.passbookService.PassbookRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PassbookServiceFutureStub extends io.grpc.stub.AbstractStub<PassbookServiceFutureStub> {
    private PassbookServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PassbookServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PassbookServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PassbookServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sample.grpcsample.passbookService.PassbookResponseResponse> getTransactionHistory(
        com.sample.grpcsample.passbookService.PassbookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionHistoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TRANSACTION_HISTORY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PassbookServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PassbookServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TRANSACTION_HISTORY:
          serviceImpl.getTransactionHistory((com.sample.grpcsample.passbookService.PassbookRequest) request,
              (io.grpc.stub.StreamObserver<com.sample.grpcsample.passbookService.PassbookResponseResponse>) responseObserver);
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

  private static abstract class PassbookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PassbookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sample.grpcsample.passbookService.PassbookServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PassbookService");
    }
  }

  private static final class PassbookServiceFileDescriptorSupplier
      extends PassbookServiceBaseDescriptorSupplier {
    PassbookServiceFileDescriptorSupplier() {}
  }

  private static final class PassbookServiceMethodDescriptorSupplier
      extends PassbookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PassbookServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PassbookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PassbookServiceFileDescriptorSupplier())
              .addMethod(getGetTransactionHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
