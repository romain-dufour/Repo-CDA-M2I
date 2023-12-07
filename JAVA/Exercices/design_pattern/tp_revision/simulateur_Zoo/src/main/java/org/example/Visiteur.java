package org.example;

import org.example.entity.Animal;

public class Visiteur implements Observer<Animal>{
    @Override
    public void update(Animal animal) {
//        System.out.println("Le zoo accueil un " + animal.getEspece() + " qui s'appelle " + animal.getNom());
    }
}
