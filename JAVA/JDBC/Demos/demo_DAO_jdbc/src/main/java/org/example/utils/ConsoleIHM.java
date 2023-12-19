package org.example.utils;

import org.example.models.Person;
import org.example.service.PersonService;

import java.util.Scanner;

public class ConsoleIHM {

    private static Scanner scanner = new Scanner(System.in);
    private static PersonService personService = new PersonService();

    public void start(){
        String choix;
        do {
            menu();
            choix = scanner.nextLine();
            switch (choix){
                case "1":
                    addPersonIHM();
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
            }

        }while (!choix.equals("0"));
    }
    private void menu(){
        System.out.println("1- Ajouter une personne");
        System.out.println("2- Mettre a jour une personne");
        System.out.println("3- Afficher toutes les personnes");
        System.out.println("4- Supprimer une personne");
        System.out.println("0- Quitter");
    }

    private void addPersonIHM(){
        System.out.println("Saisir le prénom : ");
        String firstName = scanner.nextLine();
        System.out.println("Saisir le nom : ");
        String lastName = scanner.nextLine();

        personService.createPerson(firstName,lastName);

    }
    /*
    private void updatePersonIHM(){
        System.out.println("Saisir l'id de la personne :");
        int idPerson = scanner.nextInt();
        scanner.nextLine();


       Person person = personService.getPerson(idPerson);
        if(person == null){
            System.out.println( "utilisateur non trouvé");
            return;
        }




    }
    private void getAllPersonIHM(){
        System.out.println("Saisir l'id de la personne :");
        int idPerson = scanner.nextInt();
        scanner.nextLine();


    }
    private void deletePersonIHM(){
        System.out.println("Saisir l'id de la personne:");
        int idPerson = scanner.nextInt();
        scanner.nextLine();

        personService.deletePerson(idPerson);
        System.out.println("personne supprimée avec succés");
    }

     */
}
