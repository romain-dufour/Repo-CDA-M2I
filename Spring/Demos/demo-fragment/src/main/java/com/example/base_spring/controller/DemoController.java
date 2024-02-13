package com.example.base_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping
    public String homePage(){
        return "pagea";
    }

    @GetMapping(value = "/pageb")
    public String pageb(){
        return "pageb";
    }
}
