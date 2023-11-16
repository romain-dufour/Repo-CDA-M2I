package org.example.operator;

import java.util.Scanner;

public class operator {

    public static Scanner s = new Scanner(System.in);

    public static void exercice5_1() {
        int nombre = 0;
        System.out.println("Merci de saisir un nombre entre 1 et 3:");
        nombre = s.nextInt();
        while (nombre < 1 || nombre > 3) {
            System.out.println("Merci de saisir un nombre :");
            nombre = s.nextInt();
        }
        System.out.println("Merci");
        s.close();
    }

    public static void exercice5_2() {

        int nombre = 0;
        System.out.println("Merci de saisir un nombre entre 10 et 20:");
        nombre = s.nextInt();
        while (nombre < 20 ^ nombre > 10) {
            if (nombre > 20) {
                System.out.println("plus petit");
            } else if (nombre < 10) {
                System.out.println("plus grand");
            }
            System.out.println("Merci de saisir un nombre :");
            nombre = s.nextInt();
        }
        System.out.println("Merci");
        s.close();

    }

    public static void exercice5_3() {

        int nombre = 0;
        int i = 0;
        System.out.println("Merci de saisir un nombre:");
        nombre = s.nextInt();
        i = nombre + 1;
        while (i < (nombre + 11)) {
            System.out.println((i));
            i = ++i;
        }
        s.close();

    }

    public static void exercice5_4() {
        int nombre = 0;
        System.out.println("Merci de saisir un nombre:");
        nombre = s.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println((nombre + i));
        }
        s.close();

    }

    public static void exercice5_5() {
        int nombre = 0;
        int j = 0;
        System.out.println("Merci de saisir un nombre:");
        nombre = s.nextInt();
        System.out.println("Table de " + nombre +" :" );

        while(j<11){

            System.out.println(nombre + " x " + j + " = " + (nombre*j));
        j++;
        }
        s.close();

    }

    public static void exercice5_6() {
        int nombre = 0;
        int somme = 0;
        int i = 1;
        System.out.println("Merci de saisir un nombre:");
        nombre = s.nextInt();

        while (i != (nombre+1)) {
            somme += i ;
            i++;

        }
        System.out.println(somme);
        s.close();

    }

    public static void exercice5_7() {
        int i = 0;
        int nombre = 0;
        int bigger = 0;
        while (i < 4) {
            System.out.println("Merci de saisir un nombre " +(i+1) + " :");
            nombre = s.nextInt();
            if(bigger < nombre){
                bigger = nombre;
        }
            i++;
    }
        System.out.println("Le nombre le plus grand est :" + bigger);
        s.close();
    }

    public static void exercice5_7_2() {
        int i = 0;
        int nombre = 0;
        int bigger = 0;
        int position = 0;
        while (i < 4) {

            System.out.println("Merci de saisir un nombre " +(i+1) + " :");
            nombre = s.nextInt();
            if(bigger < nombre){
                bigger = nombre;
                position=i+1;
            }
            i++;
        }
        System.out.println("Le nombre le plus grand est :" + bigger + "\nC'etait le nombre numéro " + position);
        s.close();

    }


    public static void exercice5_8() {
        int nombre = 0;
        int i = 1;
        long factorielle = 1L;
        System.out.println("Merci de saisir un nombre:");
        nombre = s.nextInt();

        if(nombre == 0){
            i=0;
        }
        while (i != nombre){
            factorielle = factorielle*(i+1);
            i++;
        }
        System.out.println(factorielle);
        s.close();

    }

    public static void exercice5_9() {

        int i = 0;
        int nombre = -1;
        int bigger = 0;
        int position = 0;
        while (nombre != 0) {
            System.out.println("Merci de saisir un nombre :");
            nombre = s.nextInt();
            i++;
            if(nombre == 0){
                System.out.println("Vous avez saisi le nombre 0");
                break;
            }
            if(bigger < nombre){
                bigger = nombre;
                position=i;
            }

        }
        System.out.println("Le nombre le plus grand est :" + bigger + "\nC'etait le nombre numéro " + i);
        s.close();

    }

    public static void exercice5_10() {
        int prixArticle = 0;
        int somme = 0;
        int sommePayee = 0;
        int rendu = 0;
        int billet10 = 0;
        int billet5 = 0;
        int piece1 = 0;
        System.out.println("Saisissez le prix d'un article :");
        prixArticle = s.nextInt();

        while (prixArticle !=0){
            somme = somme + prixArticle;
            System.out.println("Saisissez le prix d'un article :");
            prixArticle = s.nextInt();

        }
        System.out.println("Montant payé :");
        sommePayee = s.nextInt();

        rendu = sommePayee - somme;
        while(rendu >= 10){
            billet10++;
            rendu = rendu -10;
        }
        while (rendu >= 5){
            billet5++;
            rendu = rendu -5;
        }
        while (rendu != 0){
            piece1++;
            rendu = rendu -1;
        }
        System.out.println("Le prix total est de : " + somme + " €" + "\nLa somme donnée est de : " + sommePayee +
                "\n la remise de la monnaie est de " + billet10 + "x 10€, " + billet5 + "x 5€, " + piece1 + "x 1€");
        s.close();

    }

    public static void exercice5_11() {

        int N = 0;
        int somme = 0;
        while (somme < 100) {
            N++;
            somme = somme + N;

        }
        System.out.println(N);
        s.close();

    }

}
