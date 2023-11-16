package org.example.operator;

import java.util.Scanner;

public class operator {

    public static void calculateIsNegatifOrPositif(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("rentrez un premier nombre");
        int nombre1 = scanner.nextInt();

        Scanner scanne2 = new Scanner(System.in);
        System.out.println("rentrez un deuxieme nombre");
        int nombre2 = scanner.nextInt();



        if(nombre1>0 && nombre2>0 || nombre1<0 && nombre2<0){
            System.out.println("le produit de " + nombre1 + " et de " + nombre2 + " est positif");
        } else {
            System.out.println("le produit de " + nombre1 + " et de " + nombre2 + " est négatif");
        }


    }
}
