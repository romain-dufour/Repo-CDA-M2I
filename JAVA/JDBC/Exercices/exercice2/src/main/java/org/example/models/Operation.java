package org.example.models;

public class Operation {
    private int numero;
    private double montant;
    private TypeOperation statut;

    public Operation() {
    }

    public Operation(int numero, double montant, TypeOperation statut) {
        this.numero = numero;
        this.montant = montant;
        this.statut = statut;
    }

    public Operation(double montant, TypeOperation statut) {
        this.montant = montant;
        this.statut = statut;
    }

    public Operation(int operationId, int montant, String statut) {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public TypeOperation getStatut() {
        return statut;
    }

    public void setStatut(TypeOperation statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "numero=" + numero +
                ", montant=" + montant +
                ", statut=" + statut +
                '}';
    }
}
