package org.example.Personnages;

import org.example.Personnages.entity.Armement;
import org.example.Personnages.entity.Attribut_Physique;
import org.example.Personnages.factory.PersonnagesFactory;

public class Guerrier extends Personnages{

    private Armement arme ;
    private Attribut_Physique attributPhysique;

    public Guerrier(PersonnagesFactory personnagesFactory) {
        super(personnagesFactory);
    }
}
