package org.example.Personnages;

import org.example.Personnages.entity.Armement;
import org.example.Personnages.entity.Attribut_Physique;
import org.example.Personnages.entity.Competence_Magique;
import org.example.Personnages.factory.PersonnagesFactory;

public class Personnages {

    private Armement armement ;
    private Attribut_Physique attributPhysique;
    private Competence_Magique competenceMagique;

    private PersonnagesFactory personnagesFactory;

    public Personnages(PersonnagesFactory personnagesFactory){
        setPersonnagesFactory(personnagesFactory);
    }

    public void setPersonnagesFactory(PersonnagesFactory personnagesFactory){
        this.personnagesFactory = personnagesFactory;
        armement = this.personnagesFactory.definirArmement();
        attributPhysique= this.personnagesFactory.definirAttribut();
        competenceMagique = this.personnagesFactory.definirCompetenceMagique();
    }

    public void createPersonnage(){
        armement.createArmement();
        attributPhysique.createAttributPhysique();
        competenceMagique.createCompetenceMagique();
    }
}
