package com.example.exercice1_spring_aop.controller;

import com.example.exercice1_spring_aop.entity.Book;
import com.example.exercice1_spring_aop.service.LibraryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@AllArgsConstructor
public class BookController {

    private final LibraryService libraryService;



    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return libraryService.getAllBooks();
    }

//
//    @GetMapping("/book/{id}")
//    public Optional<Book> getBookById(@PathVariable("id") Long id) {
//        return libraryService.getBookById(id);
//    }


    @PostMapping("/addbook")
    public Book createBook (@RequestBody Book book){
        return libraryService.createBook(book);
    }

    @DeleteMapping("/deletebook/{id}")
    public void deleteBook(@PathVariable("id") Long id){
        Book book = libraryService.getBookById(id);
        libraryService.deleteBook(book);
    }


}
