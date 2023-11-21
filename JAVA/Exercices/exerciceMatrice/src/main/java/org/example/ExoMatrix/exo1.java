package org.example.ExoMatrix;


import java.util.Scanner;

public class exo1 {
    static int[][] tableauExo1 = {{45, 23, 34, 56, 30}, {67, 75, 21, 52, 59}, {89, 34, 19, 19, 15}, {1, 78, 90, 48, 42}};

    public static void matrice1() {

        int max = 0;
        for (int i = 0; i < tableauExo1.length; i++) {
            for (int j = 0; j < tableauExo1[i].length; j++) {
                if (tableauExo1[i][j] > max) {
                    max = tableauExo1[i][j];
                }
            }
        }
        System.out.println("La valeur la plus élevé de cette matrice est :" + max);

    }

    public static void matrice2() {

        long somme = 0L;
        long produit = 1L;
        long moyenne = 0L;
        long cpt  = 1L;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nombre de lignes");

            long[][] tableau = new long[4][5];

            for (int i = 0; i < tableau.length ; i++) {
                for (int j = 0; j < tableau[i].length; j++) {
                    tableau[i][j] = cpt;
                    cpt++;
                    somme += tableau[i][j];
//                    produit = produit +  * cpt;
                    moyenne = somme / (cpt);
                }}

                System.out.println("La somme de la matrice est : " + somme);
                System.out.println("Le produit de la matrice est : " + produit);
                System.out.println("La moyenne de la matrice est : " + moyenne);

            };

    public static void matrice3() {
        Scanner scanner = new Scanner(System.in);
        String nomVendeur = "";
        String nomMarque = "";

        System.out.println("Combien avez vous de vendeur ?");
        int nbrVendeurs = scanner.nextInt();
        System.out.println("Combien de marque ?");
        int nbrMarques = scanner.nextInt();

        String[][] bddVente = new String[nbrMarques][nbrVendeurs];

        for (int i = 0; i < 1 ; i++) {
            for (int j = 0; j < bddVente[i].length; j++) {
                System.out.println("nom du vendeur");
                nomVendeur= scanner.next();
            }
        }
        for (int i = 1; i < bddVente.length ; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.println("nom de la marque");
                nomMarque= scanner.next();
            }
        }
        for (int i = 0; i < bddVente.length; i++) {
            for (int j = 0; j < bddVente[i].length ; j++) {
                nomMarque=bddVente[0][j];
                nomVendeur=bddVente[i][0];
                System.out.print("Combien de véhicule de la marque " + nomMarque + " le vendeur " +nomVendeur +  " a t il vendu ?");
                String nbrVehicule = scanner.next();
                bddVente[i][j] = nbrVehicule;
            }
        }
    }
}
