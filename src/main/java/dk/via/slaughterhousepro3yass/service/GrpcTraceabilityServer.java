package dk.via.slaughterhousepro3yass.service;

import io.grpc.stub.StreamObserver;
import org.springframework.grpc.server.service.GrpcService;
import traceability.AnimalRequest;
import traceability.AnimalsResponse;
import traceability.ProductRequest;
import traceability.ProductsResponse;
import traceability.TraceabilityServiceGrpc;

@GrpcService
public class GrpcTraceabilityServer
    extends TraceabilityServiceGrpc.TraceabilityServiceImplBase {

  private final TraceabilityService traceabilityService;

  public GrpcTraceabilityServer(TraceabilityService traceabilityService) {
    this.traceabilityService = traceabilityService;
  }

  @Override
  public void getAnimalsForProduct(
      ProductRequest request,
      StreamObserver<AnimalsResponse> responseObserver) {

    var animalIds =
        traceabilityService.getAnimalsForProduct(request.getProductId());

    AnimalsResponse response = AnimalsResponse.newBuilder()
        .addAllAnimalIds(animalIds)
        .build();

    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void getProductsForAnimal(
      AnimalRequest request,
      StreamObserver<ProductsResponse> responseObserver) {

    var productIds =
        traceabilityService.getProductsForAnimal(request.getAnimalId());

    ProductsResponse response = ProductsResponse.newBuilder()
        .addAllProductIds(productIds)
        .build();

    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}