package org.example;

public class Ingredients {
    private  String nom_aliments;
    private String etat;
    private int quantity;
    private String unity;


    public Ingredients(String nom_aliments, String etat, int quantity, String unity) {
        this.nom_aliments = nom_aliments;
        this.etat = etat;
        this.quantity = quantity;
        this.unity = unity;
    }

    public enum Etat {
        CUIT,
        ENTIER,
        CRU,
        DECOUPE;

    }

    public enum Unity {

        GRAMME,
        KG,
        LITRE,
        ML,
        CL,

    }
}
