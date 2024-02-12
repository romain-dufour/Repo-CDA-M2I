package com.example.exercice1_base_todo.controller;

import com.example.exercice1_base_todo.entity.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {

    @GetMapping(value = "/")
    public String home(){
        return "home";
    }

    @GetMapping("/todo")
    public String getTodo(Model model){
        Todo todo= new Todo("test", "description" , true);
        model.addAttribute("name",todo.getName());
        model.addAttribute("description",todo.getDescription());
        model.addAttribute("isDone",todo.isDone());
        if(todo.isDone()){
            model.addAttribute("status","finis");
        }else {
            model.addAttribute("status","en cours");
        }
        return "todo/todo";
    }

}
