package com.example.exercice_formulaire_etudiant.service;

import com.example.exercice_formulaire_etudiant.model.Studient;

import java.util.List;
import java.util.UUID;

public interface StudientService {


    boolean addStudient(Studient studient);
    Studient searchStudientById(UUID id);
    List<Studient> findAllStudient();

    Studient getStudientByLastName(String lastName);
}
