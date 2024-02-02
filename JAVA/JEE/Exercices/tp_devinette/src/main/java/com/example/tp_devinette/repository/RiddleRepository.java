package com.example.tp_devinette.repository;

import com.example.tp_devinette.entity.Ridlle;

import java.util.List;

public class RiddleRepository extends Repository<Ridlle> {
    public RiddleRepository(){}

    @Override
    List<Ridlle> findAll() {
        return session.createQuery("from Ridlle ").list();
    }
}
