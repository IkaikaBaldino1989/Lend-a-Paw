// AdoptionService.kt

package com.example.petAdoption

import kotlin.collections.ArrayList

class AdoptionService { 
    // ArrayList to store animals up for adoption
    private val animals = ArrayList<Animal>()

    // Add an animal to the list of animals
    fun addAnimal(animal: Animal){
        animals.add(animal)
    }

    // Return a list of all animals available for adoption
    fun getAllAnimals(): List<Animal> {
        return animals
    }

    // Get one animal with specified animalId
    fun getAnimal(id: Int): Animal? {
        for (animal in animals){
            if (animal.id == id){
                return animal
            }
        }
        return null
    }

    // Update an animal
    fun updateAnimal(animal: Animal) {
        for (a in animals){
            if (a.id == animal.id) {
                a.name = animal.name
                a.age = animal.age
                a.breed = animal.breed
                a.gender = animal.gender
                a.type = animal.type
                a.location = animal.location
                a.adoptionStatus = animal.adoptionStatus
            }
        }
    }

    // Delete animal from list of animals
    fun deleteAnimal(id: Int) {
        val animal = getAnimal(id)

        if (animal != null) {
            animals.remove(animal)
        }
    }

    // Filter animals by breed
    fun filterByBreed(breed: String): List<Animal> {
        val filteredAnimals = ArrayList<Animal>()

        for (animal in animals) {
            if (animal.breed == breed) {
                filteredAnimals.add(animal)
            }
        }
        return filteredAnimals
    }

    // Filter animals by adoptionStatus
    fun filterByAdoptionStatus(status: String): List<Animal> {
        val filteredAnimals = ArrayList<Animal>()

        for (animal in animals) {
            if (animal.adoptionStatus == status) {
                filteredAnimals.add(animal)
            }
        }
        return filteredAnimals
    }

}