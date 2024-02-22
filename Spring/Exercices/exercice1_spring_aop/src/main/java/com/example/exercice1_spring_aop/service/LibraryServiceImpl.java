package com.example.exercice1_spring_aop.service;

import com.example.exercice1_spring_aop.annotation.LoggedAnnotation;
import com.example.exercice1_spring_aop.annotation.PerformanceAnnotation;
import com.example.exercice1_spring_aop.entity.Book;
import com.example.exercice1_spring_aop.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryServiceImpl implements LibraryService{

    private BookRepository bookRepository;

    public LibraryServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @LoggedAnnotation
    @PerformanceAnnotation
    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @LoggedAnnotation
    @PerformanceAnnotation
    @Override
    public Book getBookById(Long id) {
//        return bookRepository.findById(id);
        return bookRepository.findByIdIs(id);
    }

    @LoggedAnnotation
    @PerformanceAnnotation
    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll()
                .stream()
                .toList();
    }

    @LoggedAnnotation
    @PerformanceAnnotation
    @Override
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }
}
