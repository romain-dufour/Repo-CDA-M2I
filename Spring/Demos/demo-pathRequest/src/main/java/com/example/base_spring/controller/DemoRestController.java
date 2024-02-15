package com.example.base_spring.controller;

import com.example.base_spring.model.Rabbit;
import com.example.base_spring.service.RabbitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/demo")
@RequiredArgsConstructor
public class DemoRestController {

    private final RabbitService rabbitService;

    @GetMapping
    public List<Rabbit> getAllRabbit(){
        return rabbitService.getRabbits();
    }

    @GetMapping ("/{id}")
    public Rabbit getRabbitById(@PathVariable UUID id){
        return rabbitService.getRabbitById(id);
    }

    @PostMapping
    public Rabbit createRabbit(@RequestBody Rabbit rabbit){
        rabbitService.addRabbit(rabbit);
        return rabbit;
    }

    @DeleteMapping("/{id}")
    public boolean deleteRabbit(@PathVariable UUID id){
        rabbitService.deleteRabbit(id);
        System.out.println(id);
        return true;
    }

    @PutMapping("/{id}")
    public Rabbit updateRabbit(@PathVariable UUID id){

        System.out.println(id);
    }


}

