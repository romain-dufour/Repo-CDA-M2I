package com.example.exercice_spring_boutique_bonbons.validator;


import com.example.exercice_spring_boutique_bonbons.entity.Candy;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Set;

@Component("beforeCreateCandyValidation")
public class CandyValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Candy.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Candy candy = (Candy) target;
        if(candy.getName() == null || candy.getName().isEmpty())
            errors.rejectValue("name","error.name");

    }
}
