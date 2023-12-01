package org.example;

public class Client{
    private static int count = 0;
    private int id;
    private String nom;
    private String prenom;
    private String telephone;

    public Client( String nom, String prenom, String telephone) {
        this.id = ++count;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }



    //    public Client(int clientCount, String nom, String prenom, String telephone) {
//        super();
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

//    public void annulerReservation(int reservationId) {
//        for (int i = 0; i < reservations.length; i++) {
//            if (reservations[i] != null && reservations[i].getId() == reservationId) {
//                reservations[i] = null;
//                System.out.println("Réservation annulée avec succès !");
//                return;
//            }
//        }
//        System.out.println("Réservation non trouvée !");
//    }
    public void ajouterReservation(int id){


    };

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
