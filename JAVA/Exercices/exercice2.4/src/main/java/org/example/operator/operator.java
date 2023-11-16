package org.example.operator;

import java.util.Scanner;

public class operator {
    public static void calculatePriceTTC() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est le prix unitaire HT de l'article en euro?");
        Float prixHT = scanner.nextFloat();

        System.out.println("Quel est le nombre d'article ?");
        Integer nombreArticle =  scanner.nextInt();

        System.out.println("Quel est le taux de la TVA ?");
        Float tauxTVA =  scanner.nextFloat();

        Float prixTTC = (prixHT*(tauxTVA/100+1))*nombreArticle;
        System.out.println("le prix total TTC est : " + prixTTC + "€");


    }
}
