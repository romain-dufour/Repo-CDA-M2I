package com.example.demo.mapper;

import com.example.demo.entity.Person;
import com.example.demo.model.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(source = "firstName", target = "blabla")
    @Mapping(source = "birthDate", target = "age", qualifiedByName = "convertDataToAge")
    PersonDTO personToPersonDto(Person person) ;

    @Mapping(source = "blabla",target = "firstName")
    Person personDtoToPerson(PersonDTO personDTO);

    @Named("convertDataToAge")
    public static Integer convertDataToAge(LocalDate date){
        LocalDate now = LocalDate.now();
        Integer age = now.getYear() - date.getYear();
        if(now.minusYears(age).isBefore(date)){
            age--;
        }

        return age;

    }

}
