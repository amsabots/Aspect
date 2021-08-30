package com.github.amsabots.programming_paradigms.controller;

import com.github.amsabots.programming_paradigms.BuilderPattern.Contact;
import com.github.amsabots.programming_paradigms.BuilderPattern.ContactBuilder;
import com.github.amsabots.programming_paradigms.factory.Pet;
import com.github.amsabots.programming_paradigms.factory.PetFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetFactoryController {
    @Autowired
    PetFactory petFactory;

    @PostMapping("/adopt/{type}/{name}")
    public Pet adoptPet(@PathVariable String type, @PathVariable String name) {
        Pet pet = petFactory.createPet(type);
        pet.setName(name);
        pet.feed();
        return pet;
    }

    @GetMapping("/employees")
    public List<Contact> allEmployees() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new ContactBuilder().setName("Andre").setEmail("andymwebi@gmail.com").buildContact());
        contacts.add(new ContactBuilder().setName("Krop").setEmail("ikrop@gmail.com").setAddress("Kinoo").buildContact());

        return contacts;

    }
}
