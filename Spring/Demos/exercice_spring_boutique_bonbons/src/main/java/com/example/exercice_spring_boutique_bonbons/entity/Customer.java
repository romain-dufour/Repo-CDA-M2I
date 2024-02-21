package com.example.exercice_spring_boutique_bonbons.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToMany(mappedBy = "customer")
    private List<CandyOrder> orderList;

    @OneToMany(mappedBy = "customer")
    private List<Notice> noticeList;
}
