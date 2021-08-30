package com.github.amsabots.programming_paradigms.factory;

import org.springframework.stereotype.Component;

@Component
public class PetFactory {
    public Pet createPet(String animalType){
        switch (animalType.toLowerCase()){
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                throw  new UnsupportedOperationException("Unknown class of animal type provided");
        }
    }
}
