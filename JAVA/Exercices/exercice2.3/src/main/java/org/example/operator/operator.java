package org.example.operator;

import java.util.Scanner;

public class operator {
    public static void firstName (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre prénom ?");
        String prenom = scanner.next();

        System.out.println("Bonjour, " + prenom + " !");
    }

}
