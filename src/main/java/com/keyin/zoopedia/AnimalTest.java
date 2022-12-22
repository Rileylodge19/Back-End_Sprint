package com.keyin.zoopedia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {


    @Test
    void getCommonName() {
        Animal animal1 = new Animal("Wolf","test","Hairy","Carnivore","2001","Canada","endangered");
        assertEquals("Wolf", animal1.getCommonName());
    }

    @Test
    void setCommonName() {
        Animal animal2 = new Animal("Bear","Bear","Hairy","Carnivore","1999","Russia","endangered");
        animal2.setCommonName("Gorilla");
        assertEquals("Gorilla", animal2.getCommonName());
    }

    @Test
    void getScientificName() {
        Animal animal3 = new Animal("Shark","sharkeic isomas","Scaly","Herbivore","1900","Africa","extinct");
        assertEquals("sharkeic isomas", animal3.getScientificName());
    }

    @Test
    void setScientificName() {
        Animal animal4 = new Animal("Bear","Bearousneier","Scaly","Carnivore","1999","Russia","extinct");
        animal4.setScientificName("Bearousneier");
        assertEquals("Bearousneier", animal4.getScientificName());
    }

    @Test
    void getAnimalDescription() {
        Animal animal5 = new Animal("Eagle","Eagleieir","Feathered","Carnivore","1880","USA","vulnerable");
        assertEquals("Feathered", animal5.getAnimalDescription());
    }

    @Test
    void setAnimalDescription() {
        Animal animal6 = new Animal("Eagle","Eagleieir","Feathered","Carnivore","1880","USA","vulnerable");
        animal6.setAnimalDescription("Tall, Hairy");
        assertEquals("Tall, Hairy", animal6.getAnimalDescription());
    }

    @Test
    void getPrimaryDiet() {
        Animal animal7 = new Animal("Eagle","Eagleieir","Feathered","Carnivore","1880","USA","vulnerable");
        assertEquals("Carnivore", animal7.getPrimaryDiet());
    }

    @Test
    void setPrimaryDiet() {
        Animal animal8 = new Animal("Monkey","Monkeyienco","Short, Hairy","Herbivore","1880","USA","vulnerable");
        animal8.setPrimaryDiet("Carnivore");
        assertEquals("Carnivore", animal8.getPrimaryDiet());
    }

    @Test
    void getDateOfDiscovery() {
        Animal animal9 = new Animal("Iguana","Iguaneirodc","Feathered","Herbivore","1880","USA","vulnerable");
        assertEquals("1880", animal9.getDateOfDiscovery());

    }

    @Test
    void setDateOfDiscovery() {
        Animal animal10 = new Animal("Girrafe","Girraferansife","Feathered","Carnivore","1880","USA","vulnerable");
        animal10.setDateOfDiscovery("1773");
        assertEquals("1773", animal10.getDateOfDiscovery());
    }

    @Test
    void getCountryOfOrigin() {
        Animal animal11 = new Animal("Iguana","Iguaneirodc","Feathered","Herbivore","1950","Germany","vulnerable");
        assertEquals("Germany", animal11.getCountryOfOrigin());
    }

    @Test
    void setCountryOfOrigin() {
        Animal animal12 = new Animal("Squid","Squiderndo","Hairy","Carnivore","1765","Kazakstan","vulnerable");
        animal12.setCountryOfOrigin("Mexico");
        assertEquals("Mexico", animal12.getCountryOfOrigin());
    }

    @Test
    void getConservationStatus() {
        Animal animal13 = new Animal("Iguana","Iguaneirodc","Feathered","Herbivore","1880","Germany","Extinct");
        assertEquals("Extinct", animal13.getConservationStatus());
    }

    @Test
    void setConservationStatus() {
        Animal animal14 = new Animal("Eagle","Eagleieir","Feathered","Carnivore","1918","Italy","vulnerable");
        animal14.setConservationStatus("Endangered");
        assertEquals("Endangered", animal14.getConservationStatus());
    }
}