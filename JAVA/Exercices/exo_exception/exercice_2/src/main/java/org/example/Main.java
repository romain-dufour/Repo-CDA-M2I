package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        ArrayList<Integer> tableau = new ArrayList<>();

        int[] tableau = new int[5];

        for (int i = 0; i < 5; i++) {
            tableau[i] = i;
        }

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Donnez un numero d'index : ");
            int index = scanner.nextInt();
            int value = tableau[index];
            System.out.println("valeur du tableau a l'index " + index + " = " + value);
        }catch (Exception e){

            System.out.println("probleme !!!");
        }

            }
}