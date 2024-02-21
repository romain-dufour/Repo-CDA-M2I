package com.example.exercice_spring_boutique_bonbons.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class CandyOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "candyOrder")
    private List<LineOfOrder> lineOfOrderList;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private Status status;

}
