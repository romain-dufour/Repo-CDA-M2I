package com.example.exercice_formulaire_etudiant.service;

import com.example.exercice_formulaire_etudiant.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentService {

    boolean addStudent(Student student);
    Student searchStudentById(UUID id);
    List<Student> findAllStudent();

    List<Student> getStudentByLastName(String lastName);
}
