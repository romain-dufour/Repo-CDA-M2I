package org.example.operator;

import java.util.Scanner;

public class operator {
    public static void calculateSquareNumber(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne moi un nombre :");
        Integer nombre = scanner.nextInt();

        Integer squareNombre = nombre * nombre ;
        System.out.println("le carre de " + nombre +" = " + squareNombre);


    }

}
