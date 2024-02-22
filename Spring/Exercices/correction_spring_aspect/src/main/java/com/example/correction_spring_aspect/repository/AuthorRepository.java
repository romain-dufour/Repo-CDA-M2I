package com.example.correction_spring_aspect.repository;

import com.example.correction_spring_aspect.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
