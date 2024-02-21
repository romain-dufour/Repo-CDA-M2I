package com.example.exercice_spring_boutique_bonbons.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Candy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String description;

    private String magicEffect;

    private int stockQuantity;

    private double price;

//    private int note;

    @OneToMany(mappedBy = "candy")
    private List<LineOfOrder> lineOfOrderList;

    @OneToMany(mappedBy = "candy")
    private List<Notice> noticeList;
}
