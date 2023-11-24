package org.example;

public class Chambre {


    private int id ;
    private boolean statut ;
    private double tarif;
    private int capacity;

    private static int count = 0;

    public Chambre(int id, boolean statut, double tarif, int capacity) {
        this.id = id;
        this.statut = statut;
        this.tarif = tarif;
        this.capacity = capacity;
    }
}
