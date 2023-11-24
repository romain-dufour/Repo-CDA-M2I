package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class IHM {


    public static void main(String[] args) {



        Scanner scanner = new Scanner((System.in));

        System.out.print("Entrez le nom de l'hôtel : ");
        String nomHotel = scanner.nextLine();

        System.out.print("Entrez le nombre de chambres : ");
        int nombreChambres = scanner.nextInt();

        Hotel hotel = new Hotel(nomHotel, nombreChambres);


        while (true) {
            hotel.afficherMenu();
            System.out.print("Choix : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    // Ajouter un client
                    System.out.print("Nom du client : ");
                    scanner.nextLine();  // Clear the buffer
                    String nomClient = scanner.nextLine();
                    System.out.print("Prénom du client : ");
                    String prenomClient = scanner.nextLine();
                    System.out.print("Téléphone du client : ");
                    String telephoneClient = scanner.nextLine();
                    hotel.ajouterClient(nomClient, prenomClient, telephoneClient);
                    break;

                case 2:
                    // Afficher la liste des clients
                    hotel.afficherListeClients();
                    break;
                case 3:
                    // Afficher les réservations d'un client
                System.out.print("Entrez le téléphone du client : ");
                scanner.nextLine();  // Clear the buffer
                telephoneClient = scanner.nextLine();
                int clientIdByPhone = hotel.trouverClientParTelephone(telephoneClient);
                if (clientIdByPhone != -1) {
                    hotel.afficherReservationsClient(clientIdByPhone);
                } else {
                    System.out.println("Aucun client trouvé avec ce téléphone !");
                }
                break;



                case 4:
                    // Ajouter une réservation
                    System.out.print("ID du client : ");
                    int idClientReservation = scanner.nextInt();
                    System.out.print("ID de la chambre : ");
                    int idChambre = scanner.nextInt();
                   // hotel.ajouterReservation(idClientReservation, idChambre);
                    break;
                case 5:
                    // Annuler une réservation
                    System.out.print("ID de la réservation à annuler : ");
                    int idReservation = scanner.nextInt();
                    hotel.annulerReservation(idReservation);
                    break;
                case 6:
                    // Afficher la liste des réservations
                    hotel.afficherListeReservations();
                    break;
                case 0:
                    System.out.println("Merci d'avoir utilisé le système de gestion de l'hôtel. Au revoir !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix non valide. Veuillez réessayer.");}}}}

