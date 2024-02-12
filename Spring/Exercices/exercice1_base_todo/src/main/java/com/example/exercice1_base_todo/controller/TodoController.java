package com.example.exercice1_base_todo.controller;

import com.example.exercice1_base_todo.entity.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {

    @RequestMapping(value = "/")
    public String home(){
        return "home";
    }

    @RequestMapping("/todo")
    public String getTodo(Model model){
        Todo todo= new Todo(1,"test", "decription" , true);
        model.addAttribute("name",todo.getName());
        model.addAttribute("description",todo.getDescription());
        model.addAttribute("isDone",todo.isDone());

        return "todo/todo";
    }

}
