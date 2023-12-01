package org.example;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class IhmConsole {

    private static Scanner scanner = new Scanner(System.in);

    public static void start() {

        menu();
    }

    private static void menu() {

        String display[] = {
                "1- Gestion des lieux",
                "2- Gestion des evenements",
                "3- Gestion des clients",
                "4- Acheter un billet",
                "5- Annuler un achat",
                "6- Afficher la liste des evenements disponibles",
                "7- Afficher la liste de vos billets",
                "0- Quitter"
        };

        String displayPlace[] = {
                "1- Ajouter un lieu",
                "2- Modifier un lieu",
                "3- Supprimer un lieu",
                "0- Retour"
        };

        String displayEvent[] = {
                "1- Ajouter un evenement",
                "2- Modifier un evenement",
                "3- Supprimer un evenement",
                "0- Retour"
        };

        String displayCustomer[] = {
                "1- Ajouter un client",
                "2- Modifier un client",
                "3- Supprimer un client",
                "0- Retour"
        };

        System.out.println("Bienvenue");
        for (String d : display) {
            System.out.println(d);
        }


        int choice = parseInt(scanner.next());

        switch (choice) {
            case 1 -> {
                for (String d : displayPlace) {
                    System.out.println(d);
                }

            }
            case 2 -> {
                for (String d : displayEvent) {
                    System.out.println(d);
                }

            }
            case 3 -> {
                for (String d : displayCustomer) {
                    System.out.println(d);
                }

            }
            case 4 -> {

            }
            case 5 -> {

            }
            case 6 -> {

            }
            case 7 -> {

            }
            case 0 -> {
                break;
            }
            default -> {
                System.out.println("Choix invalide");
                menu();
            }
        }

    }


    private static void addAPlace(){
        System.out.println("Ajout d'un lieu");
        System.out.println("Nom du lieu : ");
        String placeName = scanner.next();
        System.out.println("Adresse du lieu : ");
        String adress = scanner.next();
        System.out.println("Capacite du lieu: ");
        Integer capacity = scanner.nextInt();

        // TODO: 30/11/2023
  //      if (hotel.addClient(placeName, adress, capacity)) {
  //          System.out.println("Client ajouté");
  //      } else {
  //          System.out.println("erreur");
   //     }
    }


    private static void updateAPlace(){
        System.out.println("modification d'un lieu");
        System.out.println("Nom du lieu : ");
        String placeName = scanner.next();
        System.out.println("Adresse du lieu : ");
        String adress = scanner.next();
        System.out.println("Capacite du lieu: ");
        Integer capacity = scanner.nextInt();

        // TODO: 30/11/2023
        //      if (hotel.addClient(placeName, adress, capacity)) {
        //          System.out.println("Client ajouté");
        //      } else {
        //          System.out.println("erreur");
        //     }

    }

    private static void removeAPlace(){
        System.out.println("Suppression d'un lieu");
        System.out.println("Nom du lieu : ");
        String placeName = scanner.next();
        System.out.println("Adresse du lieu : ");

        // TODO: 30/11/2023
        //      if (hotel.addClient(placeName, adress, capacity)) {
        //          System.out.println("Client ajouté");
        //      } else {
        //          System.out.println("erreur");
        //     }

    }

    private static void addAnEvent(){
        System.out.println("Ajout d'un event");
        System.out.println("Nom de l'event : ");
        String eventName = scanner.next();
        System.out.println("Date de l'event (format DD/MM/YYYY) : ");
        String date = scanner.next();
        System.out.println("Heure de l'event (format HH:MM) : ");
        Integer hour = scanner.nextInt();
        System.out.println("Lieu de l'event : ");
        // TODO: 30/11/2023 mettre un systeme de choix selon les lieux en bdd
//        Place place = scanner.next();
        System.out.println("Prix de l'event : ");
        double price = scanner.nextInt();
        System.out.println("Nombre de billets vendu : ");
        int ticketNumber = scanner.nextInt();

// TODO: 30/11/2023 mettre logique


    }


    private static void updateAnEvent(){
        System.out.println("modification d'un event");
        System.out.println("Nom de l'event : ");
        String eventName = scanner.next();
        System.out.println("Date de l'event (format DD/MM/YYYY) : ");
        String date = scanner.next();
        System.out.println("Heure de l'event (format HH:MM) : ");
        Integer hour = scanner.nextInt();
        System.out.println("Lieu de l'event : ");
        // TODO: 30/11/2023 mettre un systeme de choix selon les lieux en bdd
//        Place place = scanner.next();
        System.out.println("Prix de l'event : ");
        double price = scanner.nextInt();
        System.out.println("Nombre de billets vendu : ");
        int ticketNumber = scanner.nextInt();

// TODO: 30/11/2023 mettre logique

    }

    private static void removeAnEvent(){
        System.out.println("Suppression d'un event");
        System.out.println("Nom de l'event : ");


        // TODO: 30/11/2023 mettre logique

    }


    private static void addACustomer(){
        System.out.println("Ajout d'un client");
        System.out.println("Nom du client : ");
        String lastName = scanner.next();
        System.out.println("Prénom du client : ");
        String firstName = scanner.next();
        System.out.println("Email du client : ");
        String eMail = scanner.next();

// TODO: 30/11/2023 mettre logique

    }

    private static void updateACustomer(){
        System.out.println("Ajout d'un client");
        System.out.println("Nom du client : ");
        String lastName = scanner.next();
        System.out.println("Prénom du client : ");
        String firstName = scanner.next();
        System.out.println("Email du client : ");
        String eMail = scanner.next();

    }

    private static void removeACustomer(){
        System.out.println("Ajout d'un client");
        System.out.println("Nom du client : ");
        String lastName = scanner.next();
        System.out.println("Prénom du client : ");
        String firstName = scanner.next();
        System.out.println("Email du client : ");
        String eMail = scanner.next();

    }

}