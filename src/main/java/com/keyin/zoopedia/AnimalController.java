package com.keyin.zoopedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    private AnimalRepository repo;

    @GetMapping("/animal")
    public List<Animal> getAnimals(){return (List<Animal>) repo.findAll();}

    @PostMapping("/animal")
    public void createAnimal(@RequestBody Animal animal){repo.save(animal);}

    @DeleteMapping("/animal/{id}")
    public void deleteAnimal(@PathVariable Long id){repo.deleteById(id);}
}
