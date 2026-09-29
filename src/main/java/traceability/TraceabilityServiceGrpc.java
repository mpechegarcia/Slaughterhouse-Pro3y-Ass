package traceability;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class TraceabilityServiceGrpc {

  private TraceabilityServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "traceability.TraceabilityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<traceability.ProductRequest,
      traceability.AnimalsResponse> getGetAnimalsForProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnimalsForProduct",
      requestType = traceability.ProductRequest.class,
      responseType = traceability.AnimalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<traceability.ProductRequest,
      traceability.AnimalsResponse> getGetAnimalsForProductMethod() {
    io.grpc.MethodDescriptor<traceability.ProductRequest, traceability.AnimalsResponse> getGetAnimalsForProductMethod;
    if ((getGetAnimalsForProductMethod = TraceabilityServiceGrpc.getGetAnimalsForProductMethod) == null) {
      synchronized (TraceabilityServiceGrpc.class) {
        if ((getGetAnimalsForProductMethod = TraceabilityServiceGrpc.getGetAnimalsForProductMethod) == null) {
          TraceabilityServiceGrpc.getGetAnimalsForProductMethod = getGetAnimalsForProductMethod =
              io.grpc.MethodDescriptor.<traceability.ProductRequest, traceability.AnimalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnimalsForProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  traceability.ProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  traceability.AnimalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TraceabilityServiceMethodDescriptorSupplier("GetAnimalsForProduct"))
              .build();
        }
      }
    }
    return getGetAnimalsForProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<traceability.AnimalRequest,
      traceability.ProductsResponse> getGetProductsForAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductsForAnimal",
      requestType = traceability.AnimalRequest.class,
      responseType = traceability.ProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<traceability.AnimalRequest,
      traceability.ProductsResponse> getGetProductsForAnimalMethod() {
    io.grpc.MethodDescriptor<traceability.AnimalRequest, traceability.ProductsResponse> getGetProductsForAnimalMethod;
    if ((getGetProductsForAnimalMethod = TraceabilityServiceGrpc.getGetProductsForAnimalMethod) == null) {
      synchronized (TraceabilityServiceGrpc.class) {
        if ((getGetProductsForAnimalMethod = TraceabilityServiceGrpc.getGetProductsForAnimalMethod) == null) {
          TraceabilityServiceGrpc.getGetProductsForAnimalMethod = getGetProductsForAnimalMethod =
              io.grpc.MethodDescriptor.<traceability.AnimalRequest, traceability.ProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductsForAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  traceability.AnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  traceability.ProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TraceabilityServiceMethodDescriptorSupplier("GetProductsForAnimal"))
              .build();
        }
      }
    }
    return getGetProductsForAnimalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TraceabilityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TraceabilityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TraceabilityServiceStub>() {
        @java.lang.Override
        public TraceabilityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TraceabilityServiceStub(channel, callOptions);
        }
      };
    return TraceabilityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static TraceabilityServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TraceabilityServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TraceabilityServiceBlockingV2Stub>() {
        @java.lang.Override
        public TraceabilityServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TraceabilityServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return TraceabilityServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TraceabilityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TraceabilityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TraceabilityServiceBlockingStub>() {
        @java.lang.Override
        public TraceabilityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TraceabilityServiceBlockingStub(channel, callOptions);
        }
      };
    return TraceabilityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TraceabilityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TraceabilityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TraceabilityServiceFutureStub>() {
        @java.lang.Override
        public TraceabilityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TraceabilityServiceFutureStub(channel, callOptions);
        }
      };
    return TraceabilityServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAnimalsForProduct(traceability.ProductRequest request,
        io.grpc.stub.StreamObserver<traceability.AnimalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalsForProductMethod(), responseObserver);
    }

    /**
     */
    default void getProductsForAnimal(traceability.AnimalRequest request,
        io.grpc.stub.StreamObserver<traceability.ProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsForAnimalMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TraceabilityService.
   */
  public static abstract class TraceabilityServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TraceabilityServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TraceabilityService.
   */
  public static final class TraceabilityServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TraceabilityServiceStub> {
    private TraceabilityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TraceabilityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TraceabilityServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAnimalsForProduct(traceability.ProductRequest request,
        io.grpc.stub.StreamObserver<traceability.AnimalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalsForProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductsForAnimal(traceability.AnimalRequest request,
        io.grpc.stub.StreamObserver<traceability.ProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductsForAnimalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TraceabilityService.
   */
  public static final class TraceabilityServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<TraceabilityServiceBlockingV2Stub> {
    private TraceabilityServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TraceabilityServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TraceabilityServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public traceability.AnimalsResponse getAnimalsForProduct(traceability.ProductRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAnimalsForProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public traceability.ProductsResponse getProductsForAnimal(traceability.AnimalRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetProductsForAnimalMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service TraceabilityService.
   */
  public static final class TraceabilityServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TraceabilityServiceBlockingStub> {
    private TraceabilityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TraceabilityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TraceabilityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public traceability.AnimalsResponse getAnimalsForProduct(traceability.ProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalsForProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public traceability.ProductsResponse getProductsForAnimal(traceability.AnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductsForAnimalMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TraceabilityService.
   */
  public static final class TraceabilityServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TraceabilityServiceFutureStub> {
    private TraceabilityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TraceabilityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TraceabilityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<traceability.AnimalsResponse> getAnimalsForProduct(
        traceability.ProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalsForProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<traceability.ProductsResponse> getProductsForAnimal(
        traceability.AnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductsForAnimalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ANIMALS_FOR_PRODUCT = 0;
  private static final int METHODID_GET_PRODUCTS_FOR_ANIMAL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ANIMALS_FOR_PRODUCT:
          serviceImpl.getAnimalsForProduct((traceability.ProductRequest) request,
              (io.grpc.stub.StreamObserver<traceability.AnimalsResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS_FOR_ANIMAL:
          serviceImpl.getProductsForAnimal((traceability.AnimalRequest) request,
              (io.grpc.stub.StreamObserver<traceability.ProductsResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetAnimalsForProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              traceability.ProductRequest,
              traceability.AnimalsResponse>(
                service, METHODID_GET_ANIMALS_FOR_PRODUCT)))
        .addMethod(
          getGetProductsForAnimalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              traceability.AnimalRequest,
              traceability.ProductsResponse>(
                service, METHODID_GET_PRODUCTS_FOR_ANIMAL)))
        .build();
  }

  private static abstract class TraceabilityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TraceabilityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return traceability.Traceability.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TraceabilityService");
    }
  }

  private static final class TraceabilityServiceFileDescriptorSupplier
      extends TraceabilityServiceBaseDescriptorSupplier {
    TraceabilityServiceFileDescriptorSupplier() {}
  }

  private static final class TraceabilityServiceMethodDescriptorSupplier
      extends TraceabilityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TraceabilityServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TraceabilityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TraceabilityServiceFileDescriptorSupplier())
              .addMethod(getGetAnimalsForProductMethod())
              .addMethod(getGetProductsForAnimalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
