package org.example;

import org.example.Batiments.Batiment;
import org.example.Batiments.Caserne;
import org.example.Batiments.Chateau;
import org.example.Batiments.Forges;
import org.example.Batiments.factory.impl.CaserneFactory;
import org.example.Batiments.factory.impl.ChateauFactory;
import org.example.Batiments.factory.impl.ForgesFactory;
import org.example.Personnages.Archer;
import org.example.Personnages.Guerrier;
import org.example.Personnages.Mage;
import org.example.Personnages.Personnages;
import org.example.Personnages.entity.Competence_Magique;
import org.example.Personnages.factory.impl.ArcherFactory;
import org.example.Personnages.factory.impl.GuerrierFactory;
import org.example.Personnages.factory.impl.MageFactory;

import java.util.List;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



//        Personnages guerrierViking = Royaume.createNewPersonnage("guerrier", "Guerrier Viking");
//        Personnages mageNoir = Royaume.createNewPersonnage("mage", "Mage Noir");
//        Personnages archerAnglais = Royaume.createNewPersonnage("archer", "Archer Anglais");


        Personnages guerrierViking = new Guerrier(new GuerrierFactory());
        Personnages mageNoir = new Mage(new MageFactory());
        Personnages archerAnglais = new Archer(new ArcherFactory());


        Royaume.addListPersonnages(guerrierViking);
        Royaume.addListPersonnages(mageNoir);
        Royaume.addListPersonnages(archerAnglais);

        Batiment chateauFort = new Chateau(new ChateauFactory());
        Batiment caserneLegionnaire = new Caserne(new CaserneFactory());
        Batiment forgesDesEnfers = new Forges(new ForgesFactory());

        Royaume.addListBatiments(chateauFort);
        Royaume.addListBatiments(caserneLegionnaire);
        Royaume.addListBatiments(forgesDesEnfers);

        Royaume.displayListePersonnages();

        System.out.println("*****************************");

        Royaume.displayListeBatiments();

        Royaume monRoyaume = new Royaume();
        Storage.getInstance().getListeRoyaume().add(monRoyaume);

        Royaume RoyaumeEnnemi = new Royaume();
        Storage.getInstance().getListeRoyaume().add(RoyaumeEnnemi);

    }
}