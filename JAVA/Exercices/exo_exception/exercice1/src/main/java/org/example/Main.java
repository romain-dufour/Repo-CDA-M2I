package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Veuillez rentrer une chaine de caracteres : ");
            String chaineDeCaractere = scanner.nextLine();

            Integer entier = Integer.parseInt(chaineDeCaractere);
            System.out.println("La chaine de caractere parsé est : " + entier);
        }
        catch (Exception e){
            System.out.println("probleme !!!");

        }

    }
}