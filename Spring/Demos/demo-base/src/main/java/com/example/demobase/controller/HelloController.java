package com.example.demobase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {


    @RequestMapping(value = "/")
    public String sayHello(){
        System.out.println("Coucou");
        return "hello";
    }

    @RequestMapping(value = "/coucou")
    @ResponseBody
    public List<String> getPersons(){
        return List.of("John Dupont","Toto Doe","Tata Dae");
    }

    @RequestMapping(value = "toto")
    public String showToto(){
        return "toto";
    }


    @RequestMapping("/home/person")
    public String personName(Model model) {
        model.addAttribute("firstName", "John");
        model.addAttribute("lastName", "DUPONT");


        List<String> persons = List.of("John Dupont","Toto Doe","Tata Dae");
//        List<String> persons = List.of();

        model.addAttribute("persons", persons);
        return "person/details";
    }








}
