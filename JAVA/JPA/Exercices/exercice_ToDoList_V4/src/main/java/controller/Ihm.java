package controller;

import impl.CategorieDAOimpl;
import impl.TaskDAO;
import impl.UserDAO;
import model.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EnumType;
import javax.persistence.Persistence;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ihm {

    protected List<Task> taskList = new ArrayList<>();
    protected List<Task> taskByUserList = new ArrayList<>();
    protected TaskDAO taskDAO = new TaskDAO();
    protected UserDAO userDAO = new UserDAO();



    private static CategorieDAOimpl categorieDAOimpl ;
   // private static CategorieDAOimpl categorieDAO;

    private Scanner s = new Scanner(System.in);

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercice_ToDoList");
    public Ihm() {
    }

    public void start() {
        this.menuGenerale();
    }

    public void menuGenerale (){

        categorieDAOimpl = new CategorieDAOimpl(emf);

        try{
            System.out.println("----------menu---------");
            System.out.println("1/ Ajouter une tache");
            System.out.println("2/ Afficher les taches");
            System.out.println("3/ Marquer une tache comme terminée");
            System.out.println("4/ Supprimer une tâche de la liste");
            System.out.println("5/ Ajouter un utilisateur");
            System.out.println("6/ Afficher toutes les taches d'un utilisateur");
            System.out.println("7/ Supprimer un utilisateur et toutes ses tâches");
            System.out.println("8. Ajouter une catégorie");
            System.out.println("9. Supprimer une catégorie");
            System.out.println("10. Afficher les tâches d'une catégorie");
            System.out.println("11. Ajouter une taches à une catégorie");
            System.out.println("12. Supprimer une taches à une catégorie");
            System.out.println("0/ quitter");
            System.out.println("entrer votre choix :");
            int entry = s.nextInt();
            switch (entry){
                case 1:
                    this.addTask();
                    break;
                case 2 :
                    this.displayTasks();
                    break;
                case 3:
                    this.markTaskAsFinished();
                    break;
                case 4:
                    this.deleteTask();
                    break;
                case 5:
                    this.addUser();
                    break;
                case 6:
                    this.displayAllUserTasks();
                    break;
                case 7:
                    this.deleteUser();
                    break;
                case 8:
                    this.addCategorie(s);
                    break;
                case 9:
                    this.deleteCategorie(s);
                    break;
                case 10:
                    this.DisplayAllTasksFromOneCategorie(s);
                    break;
                case 11:
                    this.AddOneTaskFromOneCategorie(s);
                    break;
                case 12:
                    this.deleteOneTaskFromOneCategorie(s);
                    break;
                case 0 :
                    emf.close();
                    break;
                default:
                    System.out.println("entrer une valeur correspondant a un choix");
                    this.menuGenerale();
                    break;
            }

        }
        catch (InputMismatchException e){
            System.out.println("entrer une valeur numerique ");
            this.menuGenerale();
        }

    }


    public void  addTask (){
        try {
            System.out.println("--------ajouter une tache----------");

            s.nextLine();
            System.out.println("entrer l'id de l'utilisateur :");
            Long user = s.nextLong();
            s.nextLine();
            System.out.println("entrer le nom de la tache :");
            String taskName = s.nextLine();
            System.out.println("entrer la description de la tache :");
            String taskDescription = s.nextLine();
            System.out.println("entrer la date de fin :");
            String taskDate = s.nextLine();
            System.out.println("entrer la priorité (1,2,3):");
            int ordinal = s.nextInt();
            Priority priority = Priority.values()[ordinal-1];



            User user1 = new User();
            user1.setId(user);

            TaskInfos taskInfos = new TaskInfos(taskDescription,taskDate,priority);

            Task task = new Task();

            task.setTitle(taskName);
            task.setTaskInfos(taskInfos);
            task.setCompleted(false);
            task.setUser(user1);


            /*
            TaskInfos taskInfos = new TaskInfos(taskDescription,taskDate,priority);
            Task task = new Task(taskName,taskInfos,user1,task.getCategorieList().add(categorie));
            taskInfos.setTask(task);

            this.taskList.add(task);
            System.out.println("la tache a bien été ajoutée :");
            System.out.println(taskList.get(taskList.size()-1));
*/
          //  Task task = new Task(taskName,taskDescription);
            taskDAO.add(task);
            this.menuGenerale();
        }
        catch (InputMismatchException e){
            System.out.println("entrer une valeur numerique ");
            this.addTask();
        }
    }



    public void displayTasks (){
        try{
            System.out.println("--------Liste des taches----------");
            taskList = taskDAO.get();
        this.menuGenerale();
        }
        catch (InputMismatchException e){
            System.out.println("entrer une valeur numerique ");
            this.displayTasks();
        }
    }



    public void markTaskAsFinished (){
        //try{
            System.out.println("--------Marquer une tache comme complétée----------");
            System.out.print("ID de la tache complété : ");
            Long id = s.nextLong();
            s.nextLine();

            boolean success = taskDAO.markAsCompleted(id);
            if(success){
                System.out.println("Tache complétée !");
                this.menuGenerale();
            } else {
                System.out.println("La tâche avec l'ID " + id + " n'existe pas en base de données. Veuillez saisir un ID valide.");
                this.markTaskAsFinished();
            }
/*
        }
        catch( InputMismatchException e){
            s.nextLine();
            System.out.println("entrer une valeur numerique ");
            this.markTaskAsFinished();
        }*/
    }

    public void deleteTask (){
        try{
            System.out.println("--------supr tache----------");
            System.out.print("ID de la tache à supprimer : ");
            Long id = s.nextLong();
            s.nextLine();

            taskDAO.delete(id);
            System.out.println("Tache supprimée avec succès !");
            this.menuGenerale();
        }
        catch( InputMismatchException e){
            s.nextLine();
            System.out.println("entrer une valeur numerique ");
            this.deleteTask();
        }
    }

    public void addUser(){
        try {
            System.out.println("--------ajouter un utilisateur----------");

            s.nextLine();
            System.out.println("entrer le nom de l'utilisateur :");
            String userName = s.nextLine();

            User user = new User(userName);
;            userDAO.add(user);

            this.menuGenerale();
        }
        catch (InputMismatchException e){
            System.out.println("entrer une valeur numerique ");
            this.addTask();
        }
    }

    public void displayAllUserTasks(){
        try{
            System.out.println("--------Liste des taches pour un utilisateur----------");
            System.out.print("ID de l'utilisateur : ");
            Long id = s.nextLong();
            s.nextLine();

            taskByUserList =  userDAO.getTasksByUser(id);
            for (Task t: taskByUserList
                 ) {
                System.out.println(t);
            }

            this.menuGenerale();
        }
        catch (InputMismatchException e){
            System.out.println("entrer une valeur numerique ");
            this.displayTasks();
        }
    }

    public void deleteUser(){
        try{
            System.out.println("--------supr utilisateur----------");
            System.out.print("ID de l'utilisateur à supprimer : ");
            Long id = s.nextLong();
            s.nextLine();

            userDAO.delete(id);
            System.out.println("utilisateur et ses taches supprimés avec succès !");
            this.menuGenerale();
        }
        catch( InputMismatchException e){
            s.nextLine();
            System.out.println("entrer une valeur numerique ");
            this.deleteTask();
        }
    }


    private void addCategorie(Scanner scanner){
        scanner.nextLine();
        System.out.println("Entrer le nom de la categorie : ");
        String categorieName = scanner.nextLine();
        Categorie categorie = new Categorie(categorieName);
        categorieDAOimpl.addCategorie(categorie);
        System.out.println("Categorie ajoutée");
        this.menuGenerale();
    }

    private void deleteCategorie(Scanner scanner){
        System.out.println("Entrez l'ID de la categorie à supprimer : ");
        Long categorieId  = scanner.nextLong();
        scanner.nextLine();
        categorieDAOimpl.deleteCategorie(categorieId);
        System.out.println("Categorie supprimée");
        this.menuGenerale();

    }

    private static void DisplayAllTasksFromOneCategorie(Scanner scanner){
        System.out.println("Entrez l'ID de la categorie à afficher : ");
        Long categorieId  = scanner.nextLong();
        scanner.nextLine();
    }

    private static void AddOneTaskFromOneCategorie(Scanner scanner){
        System.out.println("Entrez l'ID de la tache à ajouter : ");
        Long taskId  = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Entrez l'ID de la categorie à relier a la tache : ");
        Long categorieId  = scanner.nextLong();
        scanner.nextLine();
        categorieDAOimpl.addTaskToCategorie(taskId,categorieId);
    }
    private static void deleteOneTaskFromOneCategorie(Scanner scanner){
        System.out.println("Entrez l'ID de la tache à supprimer : ");
        Long taskId  = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Entrez l'ID de la categorie à relier a la tache : ");
        Long categorieId  = scanner.nextLong();
        scanner.nextLine();

        categorieDAOimpl.deleteTaskToCategorie(taskId,categorieId);
    }

}
