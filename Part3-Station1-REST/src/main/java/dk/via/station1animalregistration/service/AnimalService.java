package dk.via.station1animalregistration.service;

import dk.via.station1animalregistration.model.Animal;
import dk.via.station1animalregistration.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

  private final AnimalRepository repository;

  public AnimalService(AnimalRepository repository) {
    this.repository = repository;
  }

  public Animal registerAnimal(Animal animal) {
    return repository.save(animal);
  }

  public Optional<Animal> getAnimalById(Integer id) {
    return repository.findById(id);
  }

  public List<Animal> getAnimalsByDate(LocalDate date) {
    return repository.findByArrivalDate(date);
  }

  public List<Animal> getAnimalsByOrigin(String origin) {
    return repository.findByOrigin(origin);
  }
}