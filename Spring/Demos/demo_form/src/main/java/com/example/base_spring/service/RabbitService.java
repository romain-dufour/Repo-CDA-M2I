package com.example.base_spring.service;

import com.example.base_spring.model.Rabbit;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;


@Service
public class RabbitService {
    private final Map<UUID, Rabbit> rabbits;

    public RabbitService(){
        rabbits = new HashMap<>();

        Rabbit rabbitA = Rabbit.builder()
                .id(UUID.randomUUID())
                .name("bugs bunny")
                .breed("angora")
                .build();

        Rabbit rabbitB = Rabbit.builder()
                .id(UUID.randomUUID())
                .name("lola bunny")
                .breed("bélier")
                .build();

        Rabbit rabbitC = Rabbit.builder()
                .id(UUID.randomUUID())
                .name("roger")
                .breed("jersey wooly")
                .build();

        rabbits.put(rabbitA.getId(),rabbitA);
        rabbits.put(rabbitB.getId(),rabbitB);
        rabbits.put(rabbitC.getId(),rabbitC);
    }

    public List<Rabbit> getRabbits(){
        return rabbits.values().stream().toList();
    }

    public Rabbit getRabbitById(UUID id){
        return rabbits.values().stream().filter(r -> r.getId().equals(id)).findFirst().orElse(null);
      //  return rabbits.get(id);
    }


    public List<Rabbit> addRabbitsList(Rabbit newRabbit){
        rabbits.put(newRabbit.getId(), newRabbit);
        return getRabbits();

    }

    public boolean addRabbit(Rabbit rabbit){
//        Rabbit rabbitToAdd = Rabbit.builder()
////                .id(UUID.randomUUID())
////                .name("bugs bunny")
////                .breed("angora")
////                .build();

        if (rabbit.getId() == null){
            rabbit.setId(UUID.randomUUID());
            rabbits.put(rabbit.getId(),rabbit);
            return true;
        }else {
            return false;
        }

    }

    public Rabbit getRabbitByName(String name){
        return rabbits.values().stream().filter(r -> r.getName().equals(name)).findFirst().orElse(null);


    }

}
