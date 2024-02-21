package com.example.exercice_spring_boutique_bonbons.repository;

import com.example.exercice_spring_boutique_bonbons.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
