package com.example.demobase.service;


import org.springframework.stereotype.Service;

@Service("salutations")
public class GreetingsServiceFrench implements GreetingsService{
    @Override
    public String sayHello() {
        return "Bonjour tout le monde";
    }
}
