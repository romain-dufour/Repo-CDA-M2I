package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.mapper.PersonMapper;
import com.example.demo.model.PersonDTO;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    private final PersonMapper personMapper;


    public PersonService(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper= personMapper;
    }

    public List<PersonDTO> listPersons(){
        return personRepository.findAll().stream()
                .map(personMapper::personToPersonDto) // meme chose que de faire person -> personMapper.personToPersonDto(person)
                .toList();
    }

    public PersonDTO addPerson(PersonDTO personDTO){
//        Person person = personMapper.personDtoToPerson(personDTO);
//        Person savedPerson = personRepository.save(person);
//        PersonDTO savedDto = personMapper.personToPersonDto(savedPerson);
//        return savedDto;

        return personMapper.personToPersonDto(personRepository.save(personMapper.personDtoToPerson(personDTO)));

    }
}
