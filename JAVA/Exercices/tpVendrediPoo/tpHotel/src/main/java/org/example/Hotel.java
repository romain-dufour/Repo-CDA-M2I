package org.example;
public class Hotel {

    private String nom;
    private Client[] clients;
    private Reservation[] reservations;
    private Chambre[] chambres;
    private int clientCount = 0;
    private int reservationCount = 0;
    private int nombreChambres;

    public Hotel(String nom, int nombreChambres) {
        this.nombreChambres= nombreChambres;
        this.nom = nom;
        this.chambres=new Chambre[nombreChambres];
        this.clients = new Client[100];
        this.reservations = new Reservation[100];
    }

    public void afficherMenu() {
        System.out.println("\nMenu :");
        System.out.println("1- Ajouter un client");
        System.out.println("2- Afficher la liste des clients");
        System.out.println("3- Afficher les réservations d'un client");
        System.out.println("4- Ajouter une réservation");
        System.out.println("5- Annuler une réservation");
        System.out.println("6- Afficher la liste des réservations");
        System.out.println("0- Quitter");
    }
    public void ajouterClient(String nom, String prenom, String telephone) {
        clients[clientCount++] = new Client( nom, prenom, telephone);
        System.out.println("Client ajouté avec succès !");
    }

    public int trouverClientParTelephone(String telephone) {
        for (int i = 0; i < clientCount; i++) {
            if (clients[i].getTelephone().equals(telephone)) {
                return clients[i].getId();
            }
        }
        return -1;
    }


    public void afficherListeClients() {
        System.out.println("Liste des clients :");
        for (int i = 0; i < clientCount; i++) {
            System.out.println(clients[i]);
        }
    }

    public void afficherReservationsClient(int clientId) {
        System.out.println("Réservations pour le client " + clientId + " :");
        for (int i = 0; i < reservationCount; i++) {
            if (reservations[i].getClient().getId() == clientId) {
                System.out.println(reservations[i]);
            }
        }
    }

    public void ajouterReservation(int clientId, int chambreId) {

        if (clientExists(clientId) && chambreId >= 1 && chambreId <= nombreChambres) {
            reservations[reservationCount++] = new Reservation( clients[getClientIndex(clientId)], chambreId);
            System.out.println("Réservation ajoutée avec succès !");
        } else {
            System.out.println("Client non trouvé ou chambre non valide !");
        }
    }


    public void annulerReservation(int reservationId) {
        for (int i = 0; i < reservationCount; i++) {
            if (reservations[i] != null && reservations[i].getId() == reservationId) {
                int clientId = reservations[i].getClient().getId();
                reservations[i] = null;
                System.out.println("Réservation annulée avec succès pour le client " + clientId + " !");
                return;
            }
        }
        System.out.println("Réservation non trouvée !");
    }


//    public void annulerReservation(int reservationId) {
//        for (int i = 0; i < reservationCount; i++) {
//            if (reservations[i] != null && reservations[i].getId() == reservationId) {
//                reservations[i].getClient().annulerReservation(reservationId);
//                reservations[i] = null;
//                System.out.println("Réservation annulée avec succès !");
//                return;
//            }
//        }
//        System.out.println("Réservation non trouvée !");
//    }

    public void afficherListeReservations() {
        System.out.println("Liste des réservations :");
        for (int i = 0; i < reservationCount; i++) {
            if (reservations[i] != null) {
                System.out.println(reservations[i]);
            }
        }
    }

    private boolean clientExists(int clientId) {
        for (int i = 0; i < clientCount; i++) {
            if (clients[i].getId() == clientId) {

                return true;
            }
        }
        return false;
    }

    private int getClientIndex(int clientId) {
        for (int i = 0; i < clientCount; i++) {
            if (clients[i].getId() == clientId) {
                return i;
            }
        }
        return -1;
    }

//    private int getReservationIndex(int reservationId) {
//        for (int i = 0; i < reservationCount; i++) {
//            if (reservations[i] != null && reservations[i].getId() == reservationId) {
//                return i;
//            }
//        }
//        return -1;
//    }



}
