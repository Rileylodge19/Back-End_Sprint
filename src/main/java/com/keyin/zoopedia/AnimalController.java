package com.keyin.zoopedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
public class AnimalController {

    @Autowired
    private AnimalRepository repo;

    // Update operation

    @PutMapping("/update")
    @CrossOrigin
    public void updateAnimal(@PathVariable String id, @RequestBody Animal animal, HttpServletResponse response) {
        Optional<Animal> returnValue = repo.findById(Long.parseLong(id));
        Animal animalToUpdate;
        if (returnValue.isPresent()) {
            animalToUpdate = returnValue.get();
            animalToUpdate.setId(animal.getId());
            repo.save(animalToUpdate);
        } else {
            try {
                response.sendError(404, "Animal with ID: " + animal.getId() + " not found.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
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
