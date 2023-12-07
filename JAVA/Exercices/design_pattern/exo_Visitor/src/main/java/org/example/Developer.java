package org.example;

public class Developer implements PartElement{
    private int salaire;
    private String nom;

    public Developer(int salaire, String nom) {
        this.salaire = salaire;
        this.nom = nom;
    }

    public Developer() {

    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void accept(EmployeeVisitor visitor){visitor.visit(this);}
}
