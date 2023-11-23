package org.example.TpClasseChaise;

public class Chaise {
    int nbPieds;
 String couleur, materiaux;

    public Chaise(int nbPieds, String couleur, String materiaux){
        this.nbPieds=nbPieds;
        this.couleur=couleur;
        this.materiaux=materiaux;
    }


    @Override
    public String toString() {
        return "-------------------Affichage d'un nouvel objet --------------------\n" +
                "Je suis une Chaise, avec " + nbPieds + " pieds en " + materiaux + " et de couleur " + couleur +
                "\n-------------------------------------------------------------------";

    }
}
