package com.example.todolist.repository;

import com.example.todolist.entity.Todo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;

import java.util.List;


@ApplicationScoped
public class TodoRepository extends Repository<Todo> {
    @Override
    public Todo findById(Long id) {
        return null;
    }

    @Override
    List<Todo> findAll() {
        return null;
    }
}
