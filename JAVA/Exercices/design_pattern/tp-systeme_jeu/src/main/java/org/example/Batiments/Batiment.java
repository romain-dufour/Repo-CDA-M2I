package org.example.Batiments;

import org.example.Batiments.entity.Fonctionnalite;
import org.example.Batiments.entity.Style;
import org.example.Batiments.entity.Taille;
import org.example.Batiments.factory.BatimentsFactory;

import java.util.Locale;

public class Batiment {
    private Fonctionnalite fonctionnalite;
    private Style style;
    private Taille taille;

    private BatimentsFactory batimentsFactory;

    public Batiment(BatimentsFactory batimentsFactory) {
        setBatimentFactory(batimentsFactory);
    }

    private Batiment(Builder builder){
        this f
    }


    public void setBatimentFactory(BatimentsFactory batimentsFactory){
        this.batimentsFactory = batimentsFactory;
        fonctionnalite = this.batimentsFactory.definirFonctionnalite();
        style = this.batimentsFactory.definirStyle();
        taille = this.batimentsFactory.definirTaille();
    }

    public void createBatiment(){
        fonctionnalite.createFonctionnalite();
        style.createStyle();
        taille.createSize();
    }
}
