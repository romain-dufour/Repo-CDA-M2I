package com.example.exercice1_spring_aop.service;

import com.example.exercice1_spring_aop.entity.Book;

import java.util.List;
import java.util.Optional;

public interface LibraryService {
    Book createBook(Book book);

   Book getBookById(Long id);

    List<Book> getAllBooks();

    void deleteBook(Book book);
}
