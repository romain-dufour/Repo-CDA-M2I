package com.example.exercice_spring_boutique_bonbons.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;

public enum Status {
    NOUVELLE,
    EN_COURS,
    LIVREE
}
