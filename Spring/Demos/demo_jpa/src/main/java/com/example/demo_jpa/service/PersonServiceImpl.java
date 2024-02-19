package com.example.demo_jpa.service;

import com.example.demo_jpa.dao.PersonRepository;
import com.example.demo_jpa.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    private PersonRepository personRepository;

    @Autowired //pas obligatoire mais mieux
    public PersonServiceImpl(PersonRepository personRepository){
        this.personRepository = personRepository;
    }
    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person findById(int id) {
        return personRepository.getReferenceById(id);
    }

    @Override
    public void save(Person person) {
        personRepository.save(person);
    }
}
