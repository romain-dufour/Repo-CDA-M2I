package org.example.builder.EspeceBuilder;

import org.example.Comportement;
import org.example.builder.AnimalBuilder;
import org.example.entity.Animal;

public class ChouetteBuilder extends AnimalBuilder {

    private String espece;
    private String name;
    private double taille;
    private Comportement comportement;


    @Override
    public AnimalBuilder espece(String espece) {
        this.espece = espece;
        return this;
    }

    @Override
    public AnimalBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public AnimalBuilder taille(double taille) {
        this.taille = taille;
        return this;
    }

    @Override
    public AnimalBuilder comportement(Comportement comportement) {
        this.comportement = comportement;
        return this;
    }

    @Override
    public Animal build() {
        return null;
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public Comportement getComportement() {
        return comportement;
    }

    public void setComportement(Comportement comportement) {
        this.comportement = comportement;
    }
}
