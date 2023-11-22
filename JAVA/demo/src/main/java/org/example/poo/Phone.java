package org.example.poo;

public class Phone extends Product{
    int prix;;

    public Phone() {
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Phone(int NewID, String name, int prix) {
        super(NewID, name);
        this.prix = prix;


    }
}
