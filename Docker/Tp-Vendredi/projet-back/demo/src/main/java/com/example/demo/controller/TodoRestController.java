package com.example.demo.controller;

import com.example.demo.model.Todo;
import com.example.demo.services.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TodoRestController {


    private final TodoService todoService;


    public TodoRestController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todos") // http://localhost:8081/api/todo
    public List<Todo> getAllTodos(){
        return todoService.todoList();
    }

    @PostMapping("/add")
    public Todo createTodo(@RequestBody Todo todo) { return todoService.createTodo(todo);}

    @DeleteMapping("/todo/{id}")
    public void deleteTodo (@PathVariable Long id) {
        todoService.deleteTodo(id);
    }

    @PutMapping("/todo/{id}")
    public Optional<Todo> updateTodo(@PathVariable Long id, @RequestBody Todo updatedTodo){
        return todoService.updateTodo(updatedTodo);

    }


}
