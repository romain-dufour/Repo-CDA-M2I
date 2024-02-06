package com.example.todolist.service;


import com.example.todolist.dto.TodoDto;
import com.example.todolist.entity.Todo;
import com.example.todolist.repository.TodoRepository;
import com.example.todolist.util.HibernateSession;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.hibernate.Session;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class TodoService {

    private final TodoRepository todoRepository;

    @Inject
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    public TodoDto createTodo(TodoDto todoDto) {
        Todo todo = todoDto.toEntity();
        Session session = HibernateSession.getSessionFactory().openSession();
        todoRepository.setSession(session);
        session.beginTransaction();
        try {
            todoRepository.create(todo);
            session.getTransaction().commit();
            return todo.toDto();
        }catch (Exception ex) {
            session.getTransaction().rollback();
            throw ex;
        }finally {
            session.close();
        }
    }

    public boolean deleteTodoById(Long id){

        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        try (session) {
            todoRepository.setSession(session);
            Todo todo = todoRepository.findById(id);
            todoRepository.delete(todo);
            session.getTransaction().commit();
            return true;

        }catch (Exception ex){
            session.getTransaction().rollback();
            throw ex;
        }finally {
            session.close();
        }

    }
    public TodoDto findById (Long id){
        Session session = HibernateSession.getSessionFactory().openSession();
        try(session){
            todoRepository.setSession(session);
            Todo todo = todoRepository.findById(id);
            return todo.toDto();

        } catch (Exception ex){
            throw ex;
        }
    }


    public List<TodoDto> findAll(){
        Session session = HibernateSession.getSessionFactory().openSession();
        try(session){
            todoRepository.setSession(session);
            return todoRepository.findAll().stream()
                    .map(todo -> todo.toDto())
                    .collect(Collectors.toList());
        } catch (Exception ex){
            throw ex;
        }
    }

    public TodoDto updateTodoStatus(int id){
        TodoDto todoDto = null;
        Long longId = Long.valueOf(id);
        Session session = HibernateSession.getSessionFactory().openSession();
        todoRepository.setSession(session);
        session.beginTransaction();

        try{
            Todo todo = todoRepository.findById(longId);

            if (todo != null){
                todo.setStatus(true);
                session.getTransaction().commit();
                todoDto = todo.toDto();
            }
        } catch (Exception ex){
            session.getTransaction().rollback();
            throw ex;
        }

        return todoDto;
    }

}
