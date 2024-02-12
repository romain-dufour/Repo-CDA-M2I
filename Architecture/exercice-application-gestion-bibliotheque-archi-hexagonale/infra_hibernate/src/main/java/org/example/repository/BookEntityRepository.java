package org.example.repository;


import jakarta.enterprise.context.ApplicationScoped;
import org.example.entity.Book;
import org.example.entity.BookEntity;

import java.util.List;

@ApplicationScoped
public class BookEntityRepository extends BaseEntityRepository<BookEntity> {
    @Override
    public BookEntity findById(Long id) {
        return session.get(BookEntity.class,id);
    }

    public List<BookEntity> findAllByKey(String key) {
        return (session
                .createQuery("from BookEntity where title like :q", BookEntity.class)
                .setParameter("q", key+"%"))
                .list();
    }
    @Override
    public List<BookEntity> findAll() {
        return session.createQuery("from BookEntity ", BookEntity.class).list();
    }
}