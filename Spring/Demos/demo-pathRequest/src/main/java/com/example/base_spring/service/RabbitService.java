package com.example.base_spring.service;

import com.example.base_spring.model.Rabbit;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class RabbitService {
    private final Map<UUID, Rabbit> rabbits;


    public RabbitService() {
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
                .name("Roger Rabbit")
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
//        return rabbits.get(id);
        return  rabbits.values().stream().filter(r -> r.getId().equals(id)).findFirst().orElse(null);
    }

    public boolean addRabbit(Rabbit rabbit){
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


    public boolean deleteRabbit(UUID id){
        rabbits.remove(getRabbitById(id));
        return true;
    }

    public Rabbit updateRabbit(Rabbit rabbit) {
       Rabbit rabbit1 =
    }
}
