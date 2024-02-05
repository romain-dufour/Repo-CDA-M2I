package com.example.todolist.service;


import com.example.todolist.dto.TodoDto;
import com.example.todolist.entity.Todo;
import com.example.todolist.repository.TodoRepository;
import com.example.todolist.util.HibernateSession;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.hibernate.Session;

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
        }
    }

    public boolean deleteTodoById(int id){

        Session session = HibernateSession.getSessionFactory().openSession();
        todoRepository.setSession(session);

        try {
            Todo existingTodo = todoRepository.findById((long) id);
            if(existingTodo != null){
                todoRepository.delete(existingTodo);
                session.getTransaction().commit();
                return true;
            }
            else {
                return false;
            }
        }catch (Exception ex){
            session.getTransaction().rollback();
            throw ex;
        }finally {
            session.close();
        }

    }
    public Todo TodoById (Long id){
        Todo todo = null;
        Session session = HibernateSession.getSessionFactory().openSession();
        todoRepository.setSession(session);
        session.beginTransaction();
        try{
            todo = todoRepository.findById(id);

        } catch (Exception ex){
        }
        return todo;
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
