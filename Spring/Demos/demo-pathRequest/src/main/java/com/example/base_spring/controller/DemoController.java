package com.example.base_spring.controller;

import com.example.base_spring.model.Rabbit;
import com.example.base_spring.service.RabbitService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;


@Controller
@RequiredArgsConstructor
public class DemoController {


    private final RabbitService rabbitService;


    @GetMapping
    public String homePage(){
        return "pagea";
    }

    @GetMapping("/pageb")
    public String pageb(Model model){
        List<Rabbit> rabbits = rabbitService.getRabbits();
        Rabbit rabbit = rabbits.get(0);
        Rabbit rabbit1 = rabbits.get(1);
        Rabbit rabbit2 = rabbits.get(2);
        model.addAttribute("idRabbit", rabbit.getId());
        model.addAttribute("idRabbit1", rabbit1.getId());
        model.addAttribute("idRabbit2", rabbit2.getId());

        model.addAttribute("rabbits",rabbits);

        return "pageb";
    }


    @GetMapping("/detail/{rabbitId}")
    public String detailRabbit(@PathVariable("rabbitId") UUID id, Model model){
        Rabbit rabbit=rabbitService.getRabbitById(id);
        model.addAttribute("monLapin",rabbit);
        return "pagec";
    }

}
