package controller;

import impl.AccountDAOImpl;
import impl.AgencyDAOImpl;
import impl.PersonDAOImpl;
import models.Account;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ihm {
    private static EntityManagerFactory entityManagerFactory;
    private static AccountDAOImpl accountDAO;
    private static AgencyDAOImpl agencyDAO;
    private static PersonDAOImpl personDAO;

    public static void start(){
        entityManagerFactory = Persistence.createEntityManagerFactory("banque_bdd");
        accountDAO = new AccountDAOImpl(entityManagerFactory);
        agencyDAO = new AgencyDAOImpl(entityManagerFactory);
        personDAO = new PersonDAOImpl(entityManagerFactory);

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("#### Compte bancaire ####");
            System.out.println("1. Ajouter un compte");
            System.out.println("2. Supprimer un compte");
            System.out.println("3. Ajouter une agence");
            System.out.println("4. Supprimer une agence");
            System.out.println("5. Ajouter une personne");
            System.out.println("6. Supprimer une personne");
            System.out.println("0. Quitter l'application");
            System.out.println("Choix : ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne

            switch (choice){
                case 1:
                    addAccount(scanner);
                    break;
                case 2:
                    deleteAccount(scanner);
                    break;
                case 3:
                    addAgency(scanner);
                    break;
                case 4:
                    deleteAgency(scanner);
                    break;
                case 5:
                    addPerson(scanner);
                    break;
                case 6:
                    deletePerson(scanner);
                    break;
                case 0:
                    System.out.println("Bye");
                    entityManagerFactory.close();
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");

            }

        }while (choice != 0);
    }

    private static void addAccount(Scanner scanner){
        System.out.println("Entrer le libelle du compte : ");
        String libelle = scanner.nextLine();

        System.out.println("Entrer l'IBAN du compte' : ");
        Long iban = scanner.nextLong();

        System.out.println("Entrer le solde du compte' : ");
        Double solde = scanner.nextDouble();

        System.out.println("Entrer l'ID de l'agence rattachée au compte' : ");
        int agenceId = scanner.nextInt();

        Account account = new Account();
        account.setLibelle(libelle);
        account.setIban(iban);
        account.setSolde(solde);

        if(a.addTask(task,personId)){
            System.out.println("Tâche ajoutée avec succès !");
        }else {
            System.out.println("Erreur");
        }

        // Creation de la tache
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);

        //Creation de la taskinfo
        TaskInfo taskInfo = new TaskInfo(description,dueDate,priority);

        // Mise en relation
        task.setTaskInfo(taskInfo);
        taskInfo.setTask(task);

        if(taskDAO.addTask(task,personId)){
            System.out.println("Tâche ajoutée avec succès !");
        }else {
            System.out.println("Erreur");
        }
    }

    private static void deleteAccount(Scanner scanner){

    }

    private static void addAgency(Scanner scanner){

    }

    private static void deleteAgency(Scanner scanner){

    }

    private static void addPerson(Scanner scanner){

    }
    private static void deletePerson(Scanner scanner){

    }

}

