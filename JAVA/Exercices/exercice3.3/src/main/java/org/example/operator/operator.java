package org.example.operator;

import java.util.Scanner;

public class operator {

    public static void alphabeticOrder () {


        Scanner scanner = new Scanner(System.in);
        System.out.println("rentrez un nom");
        String nom1 = scanner.next();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("rentrez un second nom");
        String nom2 = scanner.next();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("rentrez un troisieme nom");
        String nom3 = scanner.next();

        int compareFirstAndTwo = nom1.compareTo(nom2);
        int compareTwoAndThree = nom2.compareTo(nom3);

        if ( compareFirstAndTwo < 0 && compareTwoAndThree < 0) {
            System.out.println("Les noms sont rangés par ordre alphabétique");
        } else {
            System.out.println("Les noms ne sont pas rangés par ordre alphabétique");
        }

    }
}
