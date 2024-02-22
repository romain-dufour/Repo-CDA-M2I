package com.example.correction_spring_aspect.controller;

import com.example.correction_spring_aspect.dto.AuthorDTO;
import com.example.correction_spring_aspect.dto.BookDTO;
import com.example.correction_spring_aspect.entity.Author;
import com.example.correction_spring_aspect.entity.Book;
import com.example.correction_spring_aspect.service.AuthorService;
import com.example.correction_spring_aspect.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("authors")
public class AuthorController {


    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public ResponseEntity<Author> save(@RequestBody AuthorDTO authorDTO) {
        Author author = authorService.save(authorDTO.getName());
        return ResponseEntity.ok(author);
    }

    @GetMapping
    public ResponseEntity<List<Author>> get() {
        List<Author> authors = authorService.findAll();
        return ResponseEntity.ok(authors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> get(@PathVariable long id) {
        return ResponseEntity.ok(authorService.findById(id));
    }
}


