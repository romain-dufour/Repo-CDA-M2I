package org.example;

import org.example.exceptions.SecondException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> tableauEntiers = new ArrayList<>();

            Integer somme = 0;
            System.out.println("Entrez un tableau d'entiers, separés par un espace");
            String [] listeEntiers = scanner.nextLine().split(" ");
            for (String entier: listeEntiers ) {
                try {
                    Integer intEntier = Integer.parseInt(entier);
                    somme += intEntier;
                } catch (RuntimeException e){
                    System.out.println(entier + " n'est pas un entier");
                }}

        System.out.println("la somme est de : " + somme );

    }
}