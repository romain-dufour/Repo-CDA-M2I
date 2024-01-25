package com.example.correctionproduit.entities;

import javax.persistence.*;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String identifiant;

    private String password;

    public Utilisateur() {
    }

    public Utilisateur(String identifiant, String password) {
        this.identifiant = identifiant;
        this.password = password;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
