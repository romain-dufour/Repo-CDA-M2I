package com.example.exercice_spring_boutique_bonbons.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Entity
@Data
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String notice;

    @Column(name = "notation",nullable = false)
    @Min(1)
    @Max(5)
    private int notation;

    @ManyToOne
    @JoinColumn(name = "candy_id")
    private Candy candy;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
