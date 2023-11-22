package org.example.TpClasseChaise;

public class Chaise {

    protected int nbPieds;
    protected String couleur;

    protected String materiaux;

    public Chaise(){
    }

    public int getNbPieds() {
        return nbPieds;
    }

    public void setNbPieds(int nbPieds) {
        this.nbPieds = nbPieds;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        couleur = couleur;
    }

    public String getMateriaux() {
        return materiaux;
    }

    public void setMateriaux(String materiaux) {
        materiaux = materiaux;
    }

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
