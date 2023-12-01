package org.example.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExemple {

    public static void main() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("*******DIVISIONS************");
            System.out.println("Donnez moi un nombre : ");
            Integer valeur = scanner.nextInt();
            System.out.println("Donnez moi un diviseur : ");
            Integer diviseur = scanner.nextInt();
            double resultat = valeur / diviseur;
            System.out.println("Resultat : " + resultat);
        }
        catch (ArithmeticException  | InputMismatchException e){
                System.out.println("message :" + e.getMessage());
                SimpleExemple.main();
                return;
            }
//        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
//        catch (InputMismatchException e){
//            System.out.println("Problème de saisie !");
//        }
         catch (Exception e){
            System.out.println("Une exception !!");
        }
        System.out.println("Fin de partie");




    }
}
