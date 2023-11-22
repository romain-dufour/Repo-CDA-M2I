package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class function {



    public static int finMaxIntInArray(int[] intArray){
        int max = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]>max){
                max = intArray[i];
            }
        }

        return max;
    };
    public static void exo1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("rentrez des nombres entier, séparez les par un espace");
        String numbers = scanner.nextLine();
        String[] stringNumbers = numbers.split(" ");

        int[] numbersArray = new int[stringNumbers.length];
        for (int i = 0; i < stringNumbers.length; i++) {
            numbersArray[i]=Integer.parseInt(stringNumbers[i]);

        }

       int max = finMaxIntInArray(numbersArray);

        System.out.println("La valeur maximale dans ce tableau est : " + max);
    }



    public static void displayRectangle (int hauteur, int largeur){
        Scanner scanner = new Scanner(System.in);

        int [][] tab = new int [hauteur][largeur];

        for (int i = 1; i <= hauteur; i++) {
            for (int j = 1; j <= largeur; j++) {
                if(i == 1 || j==1 || j == largeur || i== hauteur){
                     System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
    public static void exo2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("rentrez la hauteur du rectangle");
        int hauteur = scanner.nextInt();

        System.out.print("rentrez la largeur du rectangle");
        int largeur = scanner.nextInt();

        displayRectangle(hauteur,largeur);

    }

    public static int nbreDeMot (String texteSaisie){
        String[] stringNumbers = texteSaisie.trim().split(" ");

        return stringNumbers.length;
    }
    public static void exo3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez du texte : ");
        String texteSaisie = scanner.nextLine();

        int result = nbreDeMot(texteSaisie);
        System.out.println("Votre phrase contient "+ result + " mots.");
    }


    public static String [] filterWordsByLength(int minLength, String[] mots){
        int index = 0;
        for (String mot : mots) {
            if (mot.length() >= minLength){
                index++;
            }
        }
        String[] tableauFiltre = new String[index];
        int i = 0;
        for (String mot : mots){
            if (mot.length() >= minLength) {
                tableauFiltre[i] = mot;
                i++;
            }
        }
        return tableauFiltre;
    }

    public static void exo4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("rentrez des nombres entier, séparez les par un espace : ");
        String texte = scanner.nextLine();
        String[] mots = texte.split(" ");
        System.out.print("rentrez une longueur maximale de mot : ");
        int minLength = scanner.nextInt();

        String [] result = filterWordsByLength(minLength,mots);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " - ");
        }

    }


//    exercice boucle recursive
    public static void exoRecursivite() {
        int nombre = 8;
        long resultat = fonctionFactorielle(nombre);
        System.out.println("La factorielle de " + nombre + " est : " + resultat);

    }

    public static int fonctionFactorielle(int n) {
        if ( n == 0){
            return 1;
        }
        else {
            return n * fonctionFactorielle( n -1);
        }


    }
}
