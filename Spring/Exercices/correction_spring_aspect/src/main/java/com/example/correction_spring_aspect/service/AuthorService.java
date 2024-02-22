package com.example.correction_spring_aspect.service;

import com.example.correction_spring_aspect.entity.Author;
import com.example.correction_spring_aspect.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

        private final AuthorRepository authorRepository;

        public AuthorService(AuthorRepository authorRepository) {
            this.authorRepository = authorRepository;
        }

        public Author save(String name) {
            Author author = new Author();
            author.setName(name);
            return authorRepository.save(author);
        }

        public Author findById(long id) {
            Optional<Author> optionalAuthor = authorRepository.findById(id);
            if(optionalAuthor.isPresent()){
                return optionalAuthor.get();
            }
            throw new RuntimeException("Not found");
        }

        public List<Author> findAll() {
            List<Author> authors = (List<Author>) authorRepository.findAll();
            return authors;
        }
}
