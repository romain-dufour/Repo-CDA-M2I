package org.example.operator;

import java.util.Scanner;

public class operator {

    public static Scanner s = new Scanner(System.in);
    public static void exercice3_4 () {
        int nombre = 0;

        System.out.println("Merci de saisir un nombre :");

        nombre = s.nextInt();
if(nombre == 0) {
    System.out.print("Le nombre" + " " + nombre + " " + "est égal à 0");
} else if (nombre < 0) {
    System.out.print("Le nombre" + " " + nombre + " " + "est négatif.");
} else{
     System.out.print("Le nombre" + " " + nombre + " " + "est positif.");
    }
    s.close();
    }

    public static void exercice3_5 () {
        int age = 0;

        System.out.println("Quel age a votre enfant ?");
        age = s.nextInt();

        if (age < 6) {
            System.out.println("Votre enfant est trop jeune pour jouer");
        } else if (age >= 6 && age < 8) {
            System.out.println("Votre enfant est en poussin");
        } else if (age >= 8 && age < 10) {
            System.out.println("Votre enfant est en Pupille");
        } else if (age >= 10 && age < 12) {
            System.out.println("Votre enfant est en Minime");
        } else if (age > 12) {
            System.out.println("Votre enfant est en Cadet");

        }}

    public static void exercice3_6 () {
        int nombreEntier = 0;
        System.out.println("Merci de saisir un nombre entier :");
        nombreEntier = s.nextInt();

        if (nombreEntier % 3 == 0) {
            System.out.println("Le nombre " + nombreEntier + " est divisible par 3");
        } else {
            System.out.println("Le nombre " + nombreEntier + " n'est pas divisible par 3");
        }
    }


    public static void exercice3_7 () {
        int nombrePhotocopies = 0;

        System.out.println("Merci de saisir le nombre de photocopies:");
        nombrePhotocopies = s.nextInt();

        if (nombrePhotocopies> 20) {
            System.out.println("Le prix a payer est de " + (nombrePhotocopies * 0.05) + " €");
        } else if( nombrePhotocopies> 10) {
            System.out.println("Le prix a payer est de " + (nombrePhotocopies * 0.10) + " €");
        } else {
            System.out.println("Le prix a payer est de " + (nombrePhotocopies * 0.15) + " €");
        }



    }


}
