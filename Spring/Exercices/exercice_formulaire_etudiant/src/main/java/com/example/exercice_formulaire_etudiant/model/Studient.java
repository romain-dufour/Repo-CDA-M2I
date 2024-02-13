package com.example.exercice_formulaire_etudiant.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Studient {
    private UUID id;
    private String lastName;
    private String firstName;
    private int age;
    private String email;

}
