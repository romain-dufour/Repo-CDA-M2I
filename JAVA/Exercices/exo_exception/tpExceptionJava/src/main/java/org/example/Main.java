package org.example;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> tableauEntiers = new ArrayList<>();

        System.out.println("Entrez un tableau d'entiers, separés par un espace");
        String [] listeEntiers = scanner.nextLine().split(" ");
        for (String entier: listeEntiers ) {
        Integer intEntier = Integer.parseInt(entier);
        tableauEntiers.add(intEntier);
        }

        for (int i = 0; i < tableauEntiers.size(); i++) {
           Integer somme =  Addition.c


        }
        System.out.println("La longueur du tableau est : " + tableauEntiers.size());


    }
}