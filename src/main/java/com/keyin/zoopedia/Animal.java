package com.keyin.zoopedia;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String commonName;
    private String scientificName;
    private String animalDescription;
    private String primaryDiet;
    private String dateOfDiscovery;
    private String countryOfOrigin;
    private String conservationStatus;

    public Animal() {
    }

    public Animal(String commonName, String scientificName, String animalDescription, String primaryDiet,
                  String dateOfDiscovery, String countryOfOrigin, String conservationStatus) {
        this.commonName = commonName;
        this.scientificName = scientificName;
        this.animalDescription = animalDescription;
        this.primaryDiet = primaryDiet;
        this.dateOfDiscovery = dateOfDiscovery;
        this.countryOfOrigin = countryOfOrigin;
        this.conservationStatus = conservationStatus;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Animal animal = (Animal) obj;
        return Objects.equals(id, animal.id) &&
                Objects.equals(commonName, animal.commonName) &&
                Objects.equals(scientificName, animal.scientificName) &&
                Objects.equals(animalDescription, animal.animalDescription) &&
                Objects.equals(primaryDiet, animal.primaryDiet) &&
                Objects.equals(dateOfDiscovery, animal.dateOfDiscovery) &&
                Objects.equals(countryOfOrigin, animal.countryOfOrigin) &&
                Objects.equals(conservationStatus, animal.conservationStatus);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getAnimalDescription() {
        return animalDescription;
    }

    public void setAnimalDescription(String animalDescription) {
        this.animalDescription = animalDescription;
    }

    public String getPrimaryDiet() {
        return primaryDiet;
    }

    public void setPrimaryDiet(String primaryDiet) {
        this.primaryDiet = primaryDiet;
    }

    public String getDateOfDiscovery() {
        return dateOfDiscovery;
    }

    public void setDateOfDiscovery(String dateOfDiscovery) {
        this.dateOfDiscovery = dateOfDiscovery;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getConservationStatus() {
        return conservationStatus;
    }

    public void setConservationStatus(String conservationStatus) {
        this.conservationStatus = conservationStatus;
    }

    @Override
    public String toString() {
        return "Animal Id: " + id + "\n" +
                "Animal Common Name: " + commonName + "\n" +
                "Animal Scientific Name: " + scientificName + "\n" +
                "Animal Description: " + animalDescription + "\n" +
                "Animal Primary Diet: " + primaryDiet + "\n" +
                "Animal Date of Discovery: " + dateOfDiscovery + "\n" +
                "Animal Country of Origin: " + countryOfOrigin + "\n" +
                "Animal Conservation Status: " + conservationStatus;
    }
}
