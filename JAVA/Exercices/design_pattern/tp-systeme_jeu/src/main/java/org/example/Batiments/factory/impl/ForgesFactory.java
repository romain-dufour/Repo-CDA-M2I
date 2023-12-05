package org.example.Batiments.factory.impl;

import org.example.Batiments.entity.Fonctionnalite;
import org.example.Batiments.entity.Style;
import org.example.Batiments.entity.Taille;
import org.example.Batiments.entity.impl.ForgesFonctionnalite;
import org.example.Batiments.entity.impl.ForgesStyle;
import org.example.Batiments.entity.impl.ForgesTaille;
import org.example.Batiments.factory.BatimentsFactory;

public class ForgesFactory extends BatimentsFactory {
    @Override
    public Style definirStyle() {
        return new ForgesStyle();
    }

    @Override
    public Taille definirTaille() {
        return new ForgesTaille();
    }

    @Override
    public Fonctionnalite definirFonctionnalite() {
        return new ForgesFonctionnalite();
    }
}
