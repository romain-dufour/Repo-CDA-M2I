package com.example.demobase.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("greetings")
//@Primary
public class GreetingServiceEnglish implements GreetingsService{
    @Override
    public String sayHello() {
        return "Hello everyBody !!!";
    }
}
