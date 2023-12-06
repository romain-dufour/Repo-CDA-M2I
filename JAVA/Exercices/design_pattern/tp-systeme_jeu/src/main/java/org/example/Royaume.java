package org.example;

import org.example.Batiments.Batiment;
import org.example.Batiments.Caserne;
import org.example.Batiments.factory.BatimentsFactory;
import org.example.Batiments.factory.impl.CaserneFactory;
import org.example.Batiments.factory.impl.ChateauFactory;
import org.example.Personnages.Personnages;
import org.example.Personnages.factory.impl.ArcherFactory;
import org.example.Personnages.factory.impl.GuerrierFactory;
import org.example.Personnages.factory.impl.MageFactory;

import java.util.ArrayList;
import java.util.List;

public class Royaume {
    public static List<Batiment>listeBatiments = new ArrayList<>();
    public static List<Personnages>listePersonnages = new ArrayList<>();

    public static void addListPersonnages(Personnages personnages) {
        listePersonnages.add(personnages);
    };
    public static void addListBatiments(Batiment batiment){
        listeBatiments.add(batiment);
    }



//    public static Personnages createNewPersonnage(String categorie, String name) {
//        String categorieMin = categorie.toLowerCase();
//        switch (categorieMin) {
//            case "guerrier":
//                GuerrierFactory guerrierFactory = new GuerrierFactory();
//                Personnages guerrierPersonnage = new Personnages(guerrierFactory);
//                guerrierPersonnage.setName(name);
//                listePersonnages.add(guerrierPersonnage);
//                return guerrierPersonnage;
//
//            case "mage":
//                MageFactory mageFactory = new MageFactory();
//                Personnages magePersonnage = new Personnages(mageFactory);
//                magePersonnage.setName(name);
//                listePersonnages.add(magePersonnage);
//                return magePersonnage;
//
//            case "archer":
//                ArcherFactory archerFactory = new ArcherFactory();
//                Personnages archerPersonnage = new Personnages(archerFactory);
//                archerPersonnage.setName(name);
//                listePersonnages.add(archerPersonnage);
//                return archerPersonnage;
//
//
//            default:
//                System.out.println("Catégorie non valide : " + categorie);
//                return null;
//        }
//    }



//    public static Personnages createNewBatiment(String categorie, String name) {
//        String categorieMin = categorie.toLowerCase();
//        switch (categorieMin) {
//            case "chateau":
//                GuerrierFactory guerrierFactory = new GuerrierFactory();
//                Personnages guerrierPersonnage = new Personnages(guerrierFactory);
//                guerrierPersonnage.setName(name);
//                listePersonnages.add(guerrierPersonnage);
//                return guerrierPersonnage;
//
//            case "caserne":
//                MageFactory mageFactory = new MageFactory();
//                Personnages magePersonnage = new Personnages(mageFactory);
//                magePersonnage.setName(name);
//                listePersonnages.add(magePersonnage);
//                return magePersonnage;
//
//            case "forge":
//                ArcherFactory archerFactory = new ArcherFactory();
//                Personnages archerPersonnage = new Personnages(archerFactory);
//                archerPersonnage.setName(name);
//                listePersonnages.add(archerPersonnage);
//                return archerPersonnage;
//
//
//            default:
//                System.out.println("Catégorie non valide : " + categorie);
//                return null;
//        }
//    }
    public static void displayListePersonnages() {
        System.out.println("Liste des personnages du Royaume :");
        for (Personnages personnage : listePersonnages) {
            System.out.println(personnage);
        }
    }
    public static void displayListeBatiments() {
        System.out.println("Liste des batiments du Royaume :");
        for (Batiment batiment : listeBatiments) {
            System.out.println(batiment);
        }
    }





//    public Personnages createNewPersonnage(String categorie,String name){
//       String categorieMin = categorie.toLowerCase();
//        switch (categorieMin){
//            case("archer"):
//                ArcherFactory archerFactory = new ArcherFactory();
//                Personnages archerPersonnage = new Personnages(archerFactory);
//
//
//        }
//
//        return listePersonnages.add()


}
