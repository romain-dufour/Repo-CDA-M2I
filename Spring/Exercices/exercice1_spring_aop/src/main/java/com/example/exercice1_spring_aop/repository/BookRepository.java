package com.example.exercice1_spring_aop.repository;

import com.example.exercice1_spring_aop.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

Book findByIdIs(Long id);}
