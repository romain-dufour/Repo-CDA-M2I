package org.example.Personnages;

import org.example.Personnages.entity.Armement;
import org.example.Personnages.entity.Attribut_Physique;
import org.example.Personnages.entity.Competence_Magique;
import org.example.Personnages.factory.PersonnagesFactory;

public abstract class Personnages {
    private String name;
    private Armement armement ;
    private Attribut_Physique attributPhysique;
    private Competence_Magique competenceMagique;


    protected Personnages(PersonnagesFactory personnagesFactory){
        armement = personnagesFactory.definirArmement();
        attributPhysique = personnagesFactory.definirAttribut();
        competenceMagique = personnagesFactory.definirCompetenceMagique();
    }
    @Override
    public String toString() {
        return "Personnages{" +
                "name='" + name + '\'' +
                ", armement=" + armement +
                ", attributPhysique=" + attributPhysique +
                ", competenceMagique=" + competenceMagique +
                '}';
    }
}
