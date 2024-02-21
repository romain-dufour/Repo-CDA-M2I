package com.example.exercice_spring_boutique_bonbons.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class LineOfOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "candy_id")
    private Candy candy;

    @ManyToOne
    @JoinColumn(name = "candy_order_id")
    private CandyOrder candyOrder;

    private int quantity;
}
