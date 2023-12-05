package org.example.Personnages.factory;

import org.example.Personnages.entity.Armement;
import org.example.Personnages.entity.Attribut_Physique;
import org.example.Personnages.entity.Competence_Magique;

public abstract class PersonnagesFactory {

    public abstract Armement definirArmement();
    public abstract Attribut_Physique definirAttribut();
    public abstract Competence_Magique definirCompetenceMagique();

}
