package com.keyin.zoopedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class AnimalController {

    @Autowired
    private AnimalRepository repo;

    // Update operation

    @PutMapping("/animals/{id}")
    @CrossOrigin
    public void updateAnimal(@PathVariable("id") long id, @RequestBody Animal animal) {
        Optional<Animal> returnValue = repo.findById(id);
        Animal _animalToUpdate;
        if (returnValue.isPresent()) {
            _animalToUpdate = returnValue.get();
            _animalToUpdate.setId(animal.getId());
            _animalToUpdate.setCommonName(animal.getCommonName());
            _animalToUpdate.setScientificName(animal.getScientificName());
            _animalToUpdate.setAnimalDescription(animal.getAnimalDescription());
            _animalToUpdate.setCountryOfOrigin(animal.getCountryOfOrigin());
            _animalToUpdate.setDateOfDiscovery(animal.getDateOfDiscovery());
            _animalToUpdate.setPrimaryDiet(animal.getPrimaryDiet());
            _animalToUpdate.setConservationStatus(animal.getConservationStatus());
            repo.save(_animalToUpdate);
        }
        }

    @GetMapping("/animals")
    @CrossOrigin
    public List<Animal> getAnimals(){return (List<Animal>) repo.findAll();}


    @PostMapping("/animals")
    @CrossOrigin
    public void createAnimal(@RequestBody Animal animal) {
        repo.save(animal);
    }

    @DeleteMapping("/animals/{id}")
    @CrossOrigin
    public void deleteAnimal(@PathVariable Long id){repo.deleteById(id);}
}
