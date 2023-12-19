package org.example.utils;

import org.example.models.Client;
import org.example.models.CompteBancaire;
import org.example.models.Operation;
import org.example.service.ClientService;
import org.example.service.CompteBancaireService;
import org.example.service.OperationService;

import java.util.Scanner;

public class IHM {

    private static ClientService clientService = new ClientService();
    private static CompteBancaireService compteBancaireService = new CompteBancaireService();
    private static OperationService operationService = new OperationService();

    private static Scanner scanner = new Scanner(System.in);

    public static void start(){
        boolean running = true;
        while (running) {
            System.out.println("1. Enregistrer un nouveau client");
            System.out.println("2. Effectuer un dépot");
            System.out.println("3. Effectuer un retrait");
            System.out.println("4. Afficher le solde et les opérations sur votre compte");
            System.out.println("5. Quitter");
            System.out.print("Choix : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            switch (choice) {
                case 1:
                    createUser();
                    break;
                case 2:
                    makeADeposit();
                    break;
                case 3:
                    makeAWithdrawal();
                    break;
                case 4:
                   // ShowBalanceAndTransactions();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        }
        System.out.println("Au revoir !");
    }

    private static void createUser() {
        System.out.print("Nom  : ");
        String nom = scanner.nextLine();
        System.out.print("Prenom : ");
        String prenom = scanner.nextLine();
        System.out.print("Numero de telephone : ");
        String numeroTelephone = scanner.nextLine();


        clientService.createClient(nom,prenom,numeroTelephone);
    }


    private static void makeADeposit() {

    }

    private static void makeAWithdrawal() {

    }

    private static void ShowBalanceAndTransactions() {

    }


}
