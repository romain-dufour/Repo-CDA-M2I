package org.example.Personnages.factory.impl;

import org.example.Personnages.entity.Armement;
import org.example.Personnages.entity.Attribut_Physique;
import org.example.Personnages.entity.Competence_Magique;
import org.example.Personnages.factory.PersonnagesFactory;

public class GuerrierFactory extends PersonnagesFactory {
    @Override
    public Armement definirArmement() {
        return null;
    }

    @Override
    public Attribut_Physique definirAttribut() {
        return null;
    }

    @Override
    public Competence_Magique definirCompetenceMagique() {
        return null;
    }
}
