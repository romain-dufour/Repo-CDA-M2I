package com.example.exercice1_base_todo.controller;

import com.example.exercice1_base_todo.entity.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/base")
public class TodoRestController {

    @GetMapping(value = "todo")
    public Todo getTodo(){
        Todo todo= new Todo(1,"test", "decription" , true);

        return todo;
    }

//    public List<String> getTodos(){return List.of()}
}
