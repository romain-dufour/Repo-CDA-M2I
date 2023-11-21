package org.example.ExoMatrice;

public class Matrice {

    static  int [][] tableauExo1 = {{45,23,34,56,30},{67,75,21,52,59},{89,34,19,19,15},{1,78,90,48,42}};

    public static void exo1() {

        int max = 0;
        for (int i = 0; i < tableauExo1.length; i++) {
            for (int j = 0; j < tableauExo1[i].length; j++) {
                if(j > max){
                    max=j;
                }
            }
        }
        System.out.println("La valeur la plus élevé de cette matrice est :" + max);

    }
}
