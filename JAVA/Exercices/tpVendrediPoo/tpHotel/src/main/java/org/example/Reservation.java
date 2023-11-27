package org.example;

public class Reservation {
    private static int count = 0;
    private int id;

    private boolean statut;
    private Client client;
    private int chambreId;

    public Reservation( Client client, int chambreId) {
        this.id = ++count;
        this.client = client;
        this.chambreId = chambreId;
    }



    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getChambreId() {
        return chambreId;
    }

    public void setChambreId(int chambreId) {
        this.chambreId = chambreId;
    }


    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", client=" + client +
                ", chambreId=" + chambreId +
                '}';
    }
}
