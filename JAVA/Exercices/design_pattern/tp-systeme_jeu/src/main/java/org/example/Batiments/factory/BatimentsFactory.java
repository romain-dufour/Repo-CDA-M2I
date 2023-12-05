package org.example.Batiments.factory;

import org.example.Batiments.entity.Fonctionnalite;
import org.example.Batiments.entity.Style;
import org.example.Batiments.entity.Taille;

public abstract class BatimentsFactory {

    public abstract Style definirStyle();
    public abstract Taille definirTaille();
    public abstract Fonctionnalite definirFonctionnalite();


}
