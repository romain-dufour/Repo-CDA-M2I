package com.example.exercice_spring_boutique_bonbons.repository;

import com.example.exercice_spring_boutique_bonbons.entity.CandyOrder;
import com.example.exercice_spring_boutique_bonbons.entity.Status;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<CandyOrder, Long> {



}
