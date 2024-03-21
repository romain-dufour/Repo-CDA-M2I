package org.example.tptodolistspringsecurity.service;

import org.example.tptodolistspringsecurity.model.Todo;

import java.util.List;
import java.util.Optional;

public interface ITodoService {

    public Todo saveTodo(Todo todo);

    public List<Todo> getAllTodos();

    public Optional<Todo> getTodoById(Long id);

    public Todo updateTodo(Todo todo);

    public void deleteTodo(Long id);
}
