package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class CompteBancaire {
    private int numeroCompte;
    private double solde;
    private int clientId;
    private Client client;
    private List<String> operations;


    public CompteBancaire() {
    }

    public CompteBancaire(int numeroCompte, double solde, int clientId) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.clientId = clientId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public CompteBancaire(int numeroCompte, int clientId) {
        this.numeroCompte = numeroCompte;
        this.clientId = clientId;
    }

    public CompteBancaire(int numeroCompte, Client client) {
        this.numeroCompte = numeroCompte;
        this.solde = 0.0;
        this.client = client;
        this.operations = new ArrayList<>();
    }

    public void addOperation(String operation){
        operations.add(operation);
    }
    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<String> getOperations() {
        return operations;
    }

    public void setOperations(List<String> operations) {
        this.operations = operations;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }
}
