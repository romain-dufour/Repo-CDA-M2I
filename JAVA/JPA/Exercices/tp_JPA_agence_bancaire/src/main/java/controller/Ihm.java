package controller;

import com.sun.xml.bind.v2.TODO;
import impl.AccountDAOImpl;
import impl.AgencyDAOImpl;
import impl.PersonDAOImpl;
import models.Account;
import models.Agency;
import models.Person;

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

        // TODO: 08/01/2024 modifier via une boucle do while une liste de personnes au compte

        System.out.println("Entrer l'ID de la personne rattachée au compte' : ");
        int personId = scanner.nextInt();

        System.out.println("Entrer l'ID de l'agence rattachée au compte' : ");
        int agenceId = scanner.nextInt();

        Account account = new Account();
        account.setLibelle(libelle);
        account.setIban(iban);
        account.setSolde(solde);

        Person person = personDAO.getPersonById(personId);
        if (person != null) {
//            account.setPerson(person);
            account.getPersonList().add(person);
            person.getAccountList().add(account);

        } else {
            System.out.println("La personne avec l'ID saisi n'existe pas.");
        }

        Agency agency = agencyDAO.getAgencyById(agenceId);

        if (agency != null) {
            account.setAgency(agency);
            agency.getAccountList().add(account);
        } else {
            System.out.println("L'agence avec l'ID saisi n'existe pas.");
        }

        if(accountDAO.addAccount(account)){
            System.out.println("Compte ajouté avec succès !");
        }else {
            System.out.println("Erreur");
        }
    }

    private static void deleteAccount(Scanner scanner){
        System.out.println("Entrez l'ID du compte à supprimer : ");
        Long accountId  = scanner.nextLong();
        scanner.nextLine();

        if (accountDAO.deleteAccount(accountId)){
            System.out.println("Suppression OK");
        }else {
            System.out.println("Erreur");
        }
    }

    private static void addAgency(Scanner scanner){
       System.out.println("Entrer l'adresse de l'agence' : ");
        String adress = scanner.nextLine();

        Agency agency = new Agency(adress);

        agencyDAO.addAgency(agency);

    }

    private static void deleteAgency(Scanner scanner){
        System.out.println("Entrez l'ID de l'agence à supprimer : ");
        Long agencyId  = scanner.nextLong();
        scanner.nextLine();

        if (agencyDAO.deleteAgency(agencyId)){
            System.out.println("Suppression OK");
        }else {
            System.out.println("Erreur");
        }
    }

    private static void addPerson(Scanner scanner){
        System.out.println("Entrer le nom de la personne : ");
        String lastname = scanner.nextLine();

        System.out.println("Entrer le prénom de la personne : ");
        String firstName = scanner.nextLine();

        System.out.println("Entrer la date de naissance : (dd.MM.yyyy) ");
        String birthDay = scanner.nextLine();

        LocalDate birthDayDate = LocalDate.parse(birthDay, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        Person person = new Person(lastname,firstName,birthDayDate);

        personDAO.addPerson(person);
    }
    private static void deletePerson(Scanner scanner){
        System.out.println("Entrez l'ID de la personne à supprimer : ");
        Long personId  = scanner.nextLong();
        scanner.nextLine();

        if (personDAO.deletePerson(personId)){
            System.out.println("Suppression OK");
        }else {
            System.out.println("Erreur");
        }
    }

}

