package dk.via.slaughterhousepro3yass.service;

import dk.via.slaughterhousepro3yass.database.TraceabilityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraceabilityService {

  private final TraceabilityRepository repository;

  public TraceabilityService(TraceabilityRepository repository) {
    this.repository = repository;
  }

  public List<Integer> getAnimalsForProduct(int productId) {
    return repository.getAnimalsForProduct(productId);
  }

  public List<Integer> getProductsForAnimal(int animalId) {
    return repository.getProductsForAnimal(animalId);
  }
}