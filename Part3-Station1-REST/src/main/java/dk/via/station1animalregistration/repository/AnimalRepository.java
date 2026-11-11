package dk.via.station1animalregistration.repository;

import dk.via.station1animalregistration.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

  List<Animal> findByArrivalDate(LocalDate arrivalDate);

  List<Animal> findByOrigin(String origin);
}