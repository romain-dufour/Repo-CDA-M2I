package org.example.collections;

import java.util.ArrayList;

public class Liste {

    public static void main(String[] args) {
        // ArrayList<type> <nom> = new ArrayList<type>();
        ArrayList<String> prenoms = new ArrayList<String>();

        // la méthode add() permet d'ajouter des éléments
        prenoms.add("toto");
        prenoms.add("titi");
        prenoms.add("tutu");
//        prenoms.add(42); pas possible a cause du type

        // la methode get() permet de recuperer un element
        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(1));
        System.out.println(prenoms.get(2));

        // la methode set() permet de modifier un element
        prenoms.set(1,"Nassim");
        System.out.println(prenoms.get(1));

        // la methode remove permet de supprimer un element
        // la methode size permet de retourner la taille de la liste
        System.out.println(prenoms.size());
        prenoms.remove(1);
        System.out.println(prenoms.size());


        // Parcourir avec la boucle for

        for (int cpt = 0; cpt < prenoms.size(); cpt++){
            System.out.println(prenoms.get(cpt));
        }

        // Parcourir avec la boucle foreach
        for (String prenom : prenoms ) {
            System.out.println(prenom);

        }

    }

}
