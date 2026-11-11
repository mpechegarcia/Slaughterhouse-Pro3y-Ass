package dk.via.station1animalregistration.controller;

import dk.via.station1animalregistration.model.Animal;
import dk.via.station1animalregistration.service.AnimalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

  private final AnimalService service;

  public AnimalController(AnimalService service) {
    this.service = service;
  }

  @PostMapping
  public Animal registerAnimal(@RequestBody Animal animal) {
    return service.registerAnimal(animal);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Animal> getAnimalById(@PathVariable Integer id) {
    return service.getAnimalById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }

  @GetMapping("/date/{date}")
  public List<Animal> getAnimalsByDate(@PathVariable LocalDate date) {
    return service.getAnimalsByDate(date);
  }

  @GetMapping("/origin/{origin}")
  public List<Animal> getAnimalsByOrigin(@PathVariable String origin) {
    return service.getAnimalsByOrigin(origin);
  }
}