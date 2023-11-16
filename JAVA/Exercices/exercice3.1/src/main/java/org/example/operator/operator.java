package org.example.operator;

import java.util.Scanner;

public class operator {

    public static void isPositifOrNegatif() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("rentrez un nombre");
        int nombre1 = scanner.nextInt();

        int nombre2 = 0;

        if(nombre1>nombre2) {
            System.out.println("le nombre " +nombre1+" est positif");
} else {
            System.out.println("le nombre " +nombre1+" est negatif");
}
}}