package org.example.exercicesTableaux;

import java.util.Random;
import java.util.Scanner;

public class ExercicesTableaux {
    public static Scanner scanner = new Scanner(System.in);

    public static void exercice1() {
        int tab[];
        tab = new int[5];

        for (int i = 0; i < 5; i++) {
            tab[i]=i+1;
        }
        System.out.println(tab[2]);
        scanner.close();
    }

    public static void exercice2() {

        int tab[];
        tab= new int[10];

        for (int i = 0; i < 9; i++) {
            tab[i]=i+1;
            System.out.println(tab[i]);
        }
        scanner.close();

    }

    public static void exercice3() {
        int tab[];
        int compteur=0;
        int userChoice = 0;
        tab= new int[8];

        for (int i = 0; i < 7; i++) {
            tab[i]=(i+1)*10;
        }

        System.out.println("Merci de saisir un nombre entier");
        userChoice = scanner.nextInt();

        for ( compteur = 0; compteur < 7; compteur++) {
            int tabValue = tab[compteur];
            if(userChoice==tabValue) {
                break;
            }
        }
        if (compteur<7){
            System.out.println("L'entier est présent dans le tableau");
        }else {
            System.out.println("L'entier n'est pas présent dans le tableau");

        }
        scanner.close();

    }

    public static void exercice4() {
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        int[] tab = new int[taille];

        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < taille; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tab[i] = scanner.nextInt();
        }

        boolean tousPairs = true;
        for (int i = 0; i < taille; i++) {
            if (tab[i] % 2 != 0) {
                tousPairs = false;
                break;
            }
        }

        if (tousPairs) {
            System.out.println("Tous les éléments sont pairs.");
        } else {
            System.out.println("Au moins un élément est impair.");
        }
        scanner.close();

    }

    public static void exercice5() {
        int[] tab = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int nombreRandom = random.nextInt(100) + 1;
            tab[i] = nombreRandom;
        }
        for (int i = 0; i < 10 ; i++) {
            System.out.println(tab[i]);
        }

        scanner.close();

    }

    public static void exercice6() {
        int[] tab1 = new int[10];
        int[] tab2 = new int[10];
        int somme =0;

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int nombreRandom1 = random.nextInt(100) + 1;
            int nombreRandom2 = random.nextInt(100) + 1;
            tab1[i] = nombreRandom1;
            tab2[i] = nombreRandom2;
            somme += nombreRandom1+nombreRandom2;

        }
        for (int i = 0; i < 10 ; i++) {
            System.out.println(tab1[i]);
            System.out.println(tab2[i]);

        }
        System.out.println(somme);

        scanner.close();

    }

    public static void exercice7() {
        int[] tab = new int[10];
        int max =0;

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int nombreRandom = random.nextInt(100) + 1;
            tab[i] = nombreRandom;
                if (max<nombreRandom){
                    max=nombreRandom;
                }
            System.out.println(nombreRandom);
        }
        System.out.println("le nombre max est :" + max);
        scanner.close();

    }


    public static void exercice5_1() {
        System.out.print("Entrez la taille du tableau : ");
        int tabLength = scanner.nextInt();

        int [] tab = new int[tabLength];

        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < tabLength; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tab[i] = scanner.nextInt();
        }

        System.out.print("Entrez la valeur pour laquelle vous souhaitez trouver les occurrences : ");
        int valeurCherchee = scanner.nextInt();

        int occurrence = 0;
        for (int i = 0; i < tabLength; i++) {

        if (tab[i] == valeurCherchee) {
            occurrence++;
        }
        }
        System.out.println("Le nombre d'occurrences pour la valeur " + valeurCherchee + " est de : " + occurrence) ;

        scanner.close();

    }

    public static void exercice5_2() {
        // ne fonctionne pas

        System.out.print("Entrez la taille du tableau : ");
        int tabLength = scanner.nextInt();

        int [] tab = new int[tabLength];

        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < tabLength; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tab[i] = scanner.nextInt();
        }
        boolean ordreCroissant = true;
        for (int i = 0; i < tabLength-1; i++) {
            if (tab[i] > tab[i + 1]){
                ordreCroissant = false;

            }
        }
        if (ordreCroissant = true){
            System.out.println("Le tableau d’entiers à une dimension est trié par ordre croissant");
        } else {
            System.out.println("Le tableau d’entiers à une dimension n'est pas trié par ordre croissant");
        }
        scanner.close();

    }

    public static void exercice5_3() {
        int max = 0;
        int min = 0;
        int valeurAbsolue = 0;

        System.out.print("Entrez la taille du tableau : ");
        int tabLength = scanner.nextInt();

        int [] tab = new int[tabLength];

        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < tabLength; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tab[i] = scanner.nextInt();
        }

        min = tab[0];
        for (int i = 0; i < tabLength; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
            if (tab[i] > max){
                max = tab[i];
            }
        }
        valeurAbsolue= max-min;
        System.out.println("La valeur absolue entre le min : " + min + " et le max : " + max + " est de : " + valeurAbsolue );

        scanner.close();

    }

    public static void exercice5_4() {
        System.out.print("Entrez la taille du tableau : ");
        int tabLength = scanner.nextInt();

        int [] tab = new int[tabLength];

        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < tabLength; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tab[i] = scanner.nextInt();
        }

        scanner.close();

    }

    public static void exercice5_5() {


        scanner.close();

    }

    public static void exercice5_6() {


        scanner.close();

    }
    public static void exercice5_7() {


        scanner.close();

    }
    public static void exercice5_8() {


        scanner.close();

    }
    }



