package com.example.demo_jpa.service;

import com.example.demo_jpa.dao.PersonRepository;
import com.example.demo_jpa.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<Person> result = personRepository.findById(id);
//        if (result.isPresent()){
//            return result.get();
//        }else {
//        return null;
//        }
        return result.orElse(null);
    }

    @Override
    public Person save(Person person) {
        personRepository.save(person);
        return person;
    }

    @Override
    public Person update(Person person) {
        personRepository.save(person);
        return person;
    }

    @Override
    public void delete(Person person) {
        personRepository.delete(person);
    }
}
