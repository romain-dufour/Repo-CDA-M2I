package com.example.demo_jpa.service;

import com.example.demo_jpa.entity.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Person findById(int id);

    Person save(Person person);

    Person update(Person person);

    void delete(Person person);

    Person de
}
