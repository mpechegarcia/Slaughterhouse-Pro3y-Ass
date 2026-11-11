package dk.via.station1animalregistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "animal")
public class Animal {

  @Id
  private Integer animalId;

  private LocalDate arrivalDate;

  private Double weight;

  private String origin;

  public Animal() {
  }

  public Animal(Integer animalId, LocalDate arrivalDate, Double weight, String origin) {
    this.animalId = animalId;
    this.arrivalDate = arrivalDate;
    this.weight = weight;
    this.origin = origin;
  }

  public Integer getAnimalId() {
    return animalId;
  }

  public void setAnimalId(Integer animalId) {
    this.animalId = animalId;
  }

  public LocalDate getArrivalDate() {
    return arrivalDate;
  }

  public void setArrivalDate(LocalDate arrivalDate) {
    this.arrivalDate = arrivalDate;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }
}