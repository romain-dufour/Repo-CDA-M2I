package org.example.entity;

public class Depense {
    private int id;
    private double montant;
    private String titre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    private Depense(Depense.Builder builder){
        this.setId(builder.id);
        this.setMontant(builder.montant);
        this.setTitre(builder.titre);
    }


    public static class Builder {
        private int id;
        private double montant;
        private String titre;


        public Depense.Builder id (int id) {
            this.id = id;
            return  this;
        }

        public Depense.Builder montant (double montant) {
            this.montant = montant;
            return  this;
        }

        public Depense.Builder titre (String titre) {
            this.titre = titre;
            return  this;
        }

        public Depense build(){ return new Depense(this);}

    }
}
