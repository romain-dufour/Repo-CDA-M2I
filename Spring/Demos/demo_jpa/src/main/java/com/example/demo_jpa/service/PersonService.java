package com.example.demo_jpa.service;

import com.example.demo_jpa.entity.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Person findById(int id);

    void save(Person person);
}
