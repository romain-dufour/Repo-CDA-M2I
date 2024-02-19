package com.example.demo_jpa.controller;

import com.example.demo_jpa.entity.Person;
import com.example.demo_jpa.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PersonRestController {

    private PersonService personService;
    @GetMapping("/list")
    public List<Person> getAllPersons(){
        return personService.findAll();
    }

    @GetMapping("/addoneperson")
    public void addOnePerson(){
        personService.save(Person.builder()
                .firstName("toto")
                .lastName("tata")
                .email("tata@toto.com")
                .build());
    }

}
