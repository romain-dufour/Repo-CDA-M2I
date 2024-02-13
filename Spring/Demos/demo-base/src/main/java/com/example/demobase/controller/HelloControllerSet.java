package com.example.demobase.controller;

import com.example.demobase.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloControllerSet {

    // Injection de dépendances

    private final GreetingsService greetingsService;

    @Autowired
    public HelloControllerSet(@Qualifier("salutations") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    @RequestMapping(value = "/hello-set")
    public String sayHello(){
        System.out.println(greetingsService.sayHello());

        return "home";
    }
}
