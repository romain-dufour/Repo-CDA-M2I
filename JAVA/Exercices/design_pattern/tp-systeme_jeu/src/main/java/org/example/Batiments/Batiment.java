package org.example.Batiments;

import org.example.Batiments.entity.Fonctionnalite;
import org.example.Batiments.entity.Style;
import org.example.Batiments.entity.Taille;
import org.example.Batiments.factory.BatimentsFactory;

import java.util.Locale;

public abstract class Batiment {

    private String name;
    private Fonctionnalite fonctionnalite;
    private Style style;
    private Taille taille;

    protected Batiment(BatimentsFactory batimentsFactory) {
        fonctionnalite = batimentsFactory.definirFonctionnalite();
        style = batimentsFactory.definirStyle();
        taille = batimentsFactory.definirTaille();

    }

    @Override
    public String toString() {
        return "Batiment{" +
                "name='" + name + '\'' +
                ", fonctionnalite=" + fonctionnalite +
                ", style=" + style +
                ", taille=" + taille +
                '}';
    }
}
