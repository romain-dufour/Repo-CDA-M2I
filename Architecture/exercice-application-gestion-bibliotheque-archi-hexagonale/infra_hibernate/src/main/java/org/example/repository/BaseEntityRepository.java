package org.example.repository;



import org.example.dto.BookDto;
import org.hibernate.Session;

import java.util.List;

public abstract class BaseEntityRepository<T> {
    protected Session session;

    public Session getSession() {
        return session;
    }

    public BaseEntityRepository() {

    }

    public void setSession(Session session) {
        this.session = session;
    }

    public BookDto create(T element) {
        this.session.persist(element);
        return null;
    }

    public boolean delete(T element) {
        session.remove(element);
        return false;
    }

    public void update(T element) {
        session.persist(element);
    }

    abstract T findById(Long id);

    abstract List<T> findAll();
}
