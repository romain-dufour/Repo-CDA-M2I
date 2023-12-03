package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
                int placeChoice = parseInt(scanner.next());
                handlePlaceMenu(placeChoice);

            }
            case 2 -> {
                for (String d : displayEvent) {
                    System.out.println(d);
                }
                int eventChoice = parseInt(scanner.next());
                handleEventMenu(eventChoice);

            }
            case 3 -> {
                for (String d : displayCustomer) {
                    System.out.println(d);
                }
                int customerChoice = parseInt(scanner.next());
                handleCustomerMenu(customerChoice);

            }
            case 4 -> {

            }
            case 5 -> {

            }
            case 6 -> {
                displayEventList();
                System.out.println("Liste des événements disponibles:");
                for (Event event : Customer.getEventList()) {
                    System.out.println("Nom : " + event.getName());
                    System.out.println("Date : " + event.getLocalDate());
                    System.out.println("Heure : " + event.getLocalTime());
                    System.out.println("Lieu : " + event.getPlace().getName()); // Assurez-vous que la classe Event a une méthode getPlace()
                    System.out.println("Prix : " + event.getPrice());
                    System.out.println("--------------------");
                }
                menu();


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

    private static void handleEventMenu(int choice) {
        switch (choice) {
            case 1 -> addAnEvent();
            case 2 -> updateAnEvent();
            case 3 -> removeAnEvent();
            case 0 -> menu();
            default -> {
                System.out.println("Choix invalide");
                handleEventMenu(choice);
            }
        }
    }

    private static void handlePlaceMenu(int choice) {
        switch (choice) {
            case 1 -> addAPlace();
            case 2 -> updateAPlace();
            case 3 -> removeAPlace();
            case 0 -> menu();
            default -> {
                System.out.println("Choix invalide");
                handlePlaceMenu(choice);
            }
        }
    }

    private static void handleCustomerMenu(int choice) {
        switch (choice) {
            case 1 -> addACustomer();
            case 2 -> updateACustomer();
            case 3 -> removeACustomer();
            case 0 -> menu();
            default -> {
                System.out.println("Choix invalide");
                handleCustomerMenu(choice);
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
        if (Customer.addPlace(placeName, adress, capacity)) {
            System.out.println("Lieu ajouté");
        } else {
           System.out.println("erreur");
        }

        menu();
    }


    private static void updateAPlace(){
        System.out.println("Modification d'un lieu");
        System.out.println("Nom du lieu : ");
        String placeName = scanner.next();
        System.out.println("Adresse du lieu : ");
        String adress = scanner.next();
        System.out.println("Capacite du lieu: ");
        Integer capacity = scanner.nextInt();

        if (Customer.updatePlace(placeName, adress, capacity)) {
            System.out.println("Lieu modifié");
        } else {
            System.out.println("erreur");
        }
        menu();

    }

    private static void removeAPlace(){
        System.out.println("Suppression d'un lieu");
        System.out.println("Nom du lieu : ");
        String placeName = scanner.next();

        if (Customer.removePlace(placeName)) {
            System.out.println("Lieu supprimé");
        } else {
            System.out.println("erreur");
        }
        menu();
    }

    private static void addAnEvent(){
        System.out.println("Ajout d'un event");
        System.out.println("Nom de l'event : ");
        String eventName = scanner.next();
        System.out.println("Date de l'event (format DD/MM/YYYY) : ");
        String dateString = scanner.next();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateString,formatDate);

        System.out.println("Heure de l'event (format HH:MM) : ");
        String hourString = scanner.next();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime hour = LocalTime.parse(hourString,formatTime);

        System.out.println("Lieu de l'event : ");
        // TODO: 30/11/2023 mettre un systeme de choix selon les lieux en bdd
        Place placeChoice = new Place("test","testAdress",100);
        // String place = scanner.next();

        System.out.println("Prix de l'event : ");
        double price = scanner.nextDouble();

        if (Customer.addEvent(eventName, date, hour,placeChoice,price)) {
            System.out.println("Evenement ajouté");
        } else {
            System.out.println("erreur");
        }
        menu();
    }


    private static void updateAnEvent(){
        System.out.println("Modification d'un event");
        System.out.println("Id du client : ");
        Integer id = scanner.nextInt();
        System.out.println("Nom de l'event : ");
        String eventName = scanner.next();
        System.out.println("Date de l'event (format DD/MM/YYYY) : ");
        String dateString = scanner.next();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateString,formatDate);

        System.out.println("Heure de l'event (format HH:MM) : ");
        String hourString = scanner.next();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime hour = LocalTime.parse(hourString,formatTime);
        System.out.println("Lieu de l'event : ");
        // TODO: 30/11/2023 mettre un systeme de choix selon les lieux en bdd
//        Place place = scanner.next();
        Place placeChoice = new Place("newTest","testNewAdress",200);

        System.out.println("Prix de l'event : ");
        double price = scanner.nextDouble();

        if (Customer.updateEvent(eventName,date,hour,placeChoice,price)) {
            System.out.println("Client modifié");
        } else {
            System.out.println("erreur");
        }
        menu();
    }

    private static void removeAnEvent(){
        System.out.println("Suppression d'un event");
        System.out.println("Nom de l'event : ");
        String nameToRemove = scanner.nextLine();

        if (Customer.removeEvent(nameToRemove)) {
            System.out.println("Client modifié");
        } else {
            System.out.println("erreur");
        }
        menu();
    }


    private static void addACustomer(){
        System.out.println("Ajout d'un client");
        System.out.println("Nom du client : ");
        String lastName = scanner.next();
        System.out.println("Prénom du client : ");
        String firstName = scanner.next();
        System.out.println("Email du client : ");
        String eMail = scanner.next();

        if (Customer.addCustomer(firstName,lastName,eMail)) {
            System.out.println("Client ajouté");
        } else {
            System.out.println("erreur");
        }
        menu();
    }

    private static void updateACustomer(){
        System.out.println("Modification d'un client");
        System.out.println("Id du client : ");
        Integer id = scanner.nextInt();
        System.out.println("Nom du client : ");
        String lastName = scanner.next();
        System.out.println("Prénom du client : ");
        String firstName = scanner.next();
        System.out.println("Email du client : ");
        String eMail = scanner.next();

        if (Customer.updateCustomer(id,firstName,lastName,eMail)) {
            System.out.println("Client modifié");
        } else {
            System.out.println("erreur");
        }
        menu();
    }

    private static void removeACustomer(){
        System.out.println("Suppression d'un client");

        System.out.println("Email du client : ");
        String eMail = scanner.next();

        if (Customer.removeCustomer(eMail)) {
            System.out.println("Client supprimé");
        } else {
            System.out.println("erreur");
        }
        menu();
    }

    public static void displayEventList() {
        System.out.println("Liste des événements disponibles:");
        for (Event event : Customer.getEventList()) {
            System.out.println("Nom : " + event.getName());
            System.out.println("Date : " + event.getLocalDate());
            System.out.println("Heure : " + event.getLocalTime());
            System.out.println("Lieu : " + event.getPlace().getName());
            System.out.println("Prix : " + event.getPrice());
            System.out.println("--------------------");
        }
        menu();
    }
}