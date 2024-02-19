package com.example.demo_jpa.controller;

import com.example.demo_jpa.entity.Person;
import com.example.demo_jpa.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PersonRestController {

    private PersonService personService;
    @GetMapping("/list")
    public List<Person> getAllPersons(){
        return personService.findAll();
    }

    @PostMapping ("/addoneperson")// http://localhost:8080/addoneperson
    public void addOnePerson(@RequestBody Person person){
        personService.save(person);
    };


    @PutMapping("/updateperson/{id}")
    public Person updatePerson(@PathVariable Integer id,@RequestBody Person person){
        return personService.update(id,person);
    }

    @DeleteMapping("/deletePerson/{id}")
    public void deletePerson(@PathVariable int id){
        personService.delete(id);
    }

}
