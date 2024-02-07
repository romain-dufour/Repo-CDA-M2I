package org.example.spi.port;

import org.example.entity.Book;

import java.util.List;


public interface BookRepository {
    boolean create(Book book);
    boolean delete(Book book);
    boolean update (Book book);
    Book findById(Long id);
    List<Book> searchBook(String search);
}
