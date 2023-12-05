package org.example;

import org.example.Batiments.Batiment;
import org.example.Batiments.factory.impl.CaserneFactory;
import org.example.Batiments.factory.impl.ChateauFactory;
import org.example.Batiments.factory.impl.ForgesFactory;
import org.example.Personnages.Personnages;
import org.example.Personnages.factory.impl.ArcherFactory;
import org.example.Personnages.factory.impl.GuerrierFactory;
import org.example.Personnages.factory.impl.MageFactory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Personnages guerrierViking = new Personnages(new GuerrierFactory()) ;
        Personnages mageNoir = new Personnages(new MageFactory());
        Personnages archerAnglais = new Personnages(new ArcherFactory());


        Batiment chateauFort = new Batiment(new ChateauFactory());
        Batiment caserneLegionnaire = new Batiment(new CaserneFactory());
        Batiment forgesDesEnfers = new Batiment(new ForgesFactory());




    }
}