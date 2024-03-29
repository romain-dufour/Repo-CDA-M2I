package com.example.demo.services;

import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService{

    private TodoRepository todoRepository;

    public Todo createTodo(Todo todo) {
      return todoRepository.save(todo);
    }

    public Optional<Todo> getTodoById (Long id) {
        return todoRepository.findById(id);
    }
    public List<Todo> todoList (){
        return todoRepository.findAll();
    }

    public Optional<Todo> updateTodo(Todo todo) {
        Optional<Todo> existingTodo = getTodoById(todo.getId());
        if (existingTodo != null) {
            existingTodo.get().setTask(todo.getTask());
            existingTodo.get().setName(todo.getName());
        }
        return existingTodo;
    }

    public void deleteTodo(Long id) {
        Optional<Todo> todo = todoRepository.findById(id);
        todoRepository.delete(todo);
    }
}
