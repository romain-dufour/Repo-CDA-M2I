package org.example.Exercices;

import java.util.Arrays;
import java.util.Scanner;

public class Exercices {
    public static void comptageDeMot() {

        String phrase = "il y a huit mots dans cette phrase";
        int nombreDeMots = 0;

        String[] mots = phrase.split("\\s+");
        nombreDeMots = mots.length;


        System.out.println("Il y a " + (nombreDeMots ) + " mots dans la phrase");
    }

    public static void comptageOccurrence() {
        String phrase = " il y a huit mots dans cette phrase";

        int occurrence = 0;

        char lettre = 'e';


        for (int i = 0; i < phrase.length(); i++) {
            // Vérifier si le caractère actuel est égal à la lettre recherchée
            if (phrase.charAt(i) == lettre) {
                occurrence++;
            }
        }

        System.out.println("il y a " + occurrence + " " + lettre + " dans la phrase");
    }



    public static void anagramme(  String mot1 ,String mot2 ){

        boolean annagramme = false;

        if (mot1.length()==mot2.length()){
            char[] tableauMot1 = mot1.toCharArray();
            char[] tableauMot2 = mot2.toCharArray();

            Arrays.sort(tableauMot1);
            Arrays.sort(tableauMot2);

            if (Arrays.equals(tableauMot1,tableauMot2)==true){
                System.out.println("'" + mot1 + "' et '" + mot2 + "' sont des anagrammes.") ;
            }else {
                System.out.println("'" + mot1 + "' et '" + mot2 + "' ne sont pas des anagrammes.");
            };
        }else {
            System.out.println("'" + mot1 + "' et '" + mot2 + "' ne sont pas des anagrammes.");}

    }

    public static void palindrome(String mot1  ) {
        char[] tableauMot1 = mot1.toCharArray();
        char[] motReverse = tableauMot1;
        System.out.println(motReverse);

        for (int i = 0; i < tableauMot1.length/2; i++) {
            char tmp = tableauMot1[i];
            tableauMot1[i]=tableauMot1[tableauMot1.length-i-1];
            tableauMot1[tableauMot1.length-i-1] = tmp;
        }
        System.out.println(tableauMot1);
        if (Arrays.equals(tableauMot1,motReverse)==true){
            System.out.println(mot1 +" est un palindrome") ;
        }else {
            System.out.println(mot1 +" n'est pas un palindrome");
        };

    }

    public static void pyramide() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("rentrez la hauteur de la pyramide");
        int hauteur = scanner.nextInt();
        char affichage = '*';

        for (int i = 1; i <= hauteur; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        };
        for (int i = hauteur-1; i > 0; i--) {
            for (int j = 1;j<= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        };


    }
    }

