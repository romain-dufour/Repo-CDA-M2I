package org.example.operator;

import java.util.Scanner;

public class operator {
    public static void calculateSquareNumber(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne moi un nombre :");
        Integer nombre = scanner.nextInt();

        Integer squareNombre = nombre * nombre ;
        System.out.println("le carre de " + nombre +" = " + squareNombre);

    }

    public static void firstName (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre prénom ?");
        String prenom = scanner.next();

        System.out.println("Bonjour, " + prenom + " !");
    }


    public static void calculatePriceTTC() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est le prix unitaire HT de l'article en euro?");
        Float prixHT = scanner.nextFloat();

        System.out.println("Quel est le nombre d'article ?");
        Integer nombreArticle =  scanner.nextInt();

        System.out.println("Quel est le taux de la TVA ?");
        Float tauxTVA =  scanner.nextFloat();

        Float prixTTC = (prixHT*(1+(tauxTVA/100)))*nombreArticle;
        System.out.println("le prix total TTC est : " + prixTTC + "€");
    }


    public static void isPositifOrNegatif() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("rentrez un nombre");
        int nombre1 = scanner.nextInt();

        int nombre2 = 0;

        if(nombre1>nombre2) {
            System.out.println("le nombre " +nombre1+" est positif");
        } else {
            System.out.println("le nombre " +nombre1+" est negatif");
        }
    }


    public static void calculateIsNegatifOrPositif(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("rentrez un premier nombre");
        int nombre1 = scanner.nextInt();

        Scanner scanne2 = new Scanner(System.in);
        System.out.println("rentrez un deuxieme nombre");
        int nombre2 = scanner.nextInt();


        if((nombre1>0 && nombre2>0) ||(nombre1<0 && nombre2<0)){
            System.out.println("le produit de " + nombre1 + " et de " + nombre2 + " est positif");
        } else {
            System.out.println("le produit de " + nombre1 + " et de " + nombre2 + " est négatif");
        }
    }


    public static void alphabeticOrder () {

        String nom1 = " ";
        String nom2 = " ";
        String nom3 = " ";

        Scanner scanner = new Scanner(System.in);
        System.out.println("rentrez un nom");
        nom1 = scanner.next().toLowerCase();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("rentrez un second nom");
        nom2 = scanner.next().toLowerCase();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("rentrez un troisieme nom");
        nom3 = scanner.next().toLowerCase();

        int compareFirstAndTwo = nom1.compareTo(nom2);
        int compareTwoAndThree = nom2.compareTo(nom3);

        if ( compareFirstAndTwo < 0 && compareTwoAndThree < 0) {
            System.out.println("Les noms sont rangés par ordre alphabétique");
        } else {
            System.out.println("Les noms ne sont pas rangés par ordre alphabétique");
        }

    }

}
