package com.example.exercice1_base_todo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Todo {

    private int id;
    private String name;
    private String description;
    private boolean done;

}
