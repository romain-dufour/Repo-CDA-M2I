package com.example.correction_boutique_bonbons.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class CandyOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "candyOrder")
    private List<CandyOrderLine> candyList;
}
