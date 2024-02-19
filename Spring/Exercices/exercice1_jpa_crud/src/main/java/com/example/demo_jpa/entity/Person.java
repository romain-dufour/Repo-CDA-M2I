package com.example.demo_jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "personne")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    private String email;

}
