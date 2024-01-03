package controller;

import impl.TaskDAO;
import model.Priority;
import model.Task;
import model.TaskInfos;

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
    protected TaskDAO taskDAO = new TaskDAO();

    private Scanner s = new Scanner(System.in);

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercice_ToDoList");
    public Ihm() {
    }

    public void start() {
        this.menuGenerale();
    }

    public void menuGenerale (){
        try{
            System.out.println("----------menu---------");
            System.out.println("1/ Ajouter une tache");
            System.out.println("2/ Afficher les taches");
            System.out.println("3/ Marquer une tache comme terminée");
            System.out.println("4/ Supprimer une tâche de la liste");
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
            System.out.println("entrer le nom de la tache :");
            String taskName = s.nextLine();
            System.out.println("entrer la description de la tache :");
            String taskDescription = s.nextLine();
            System.out.println("entrer la date de fin :");
            String taskDate = s.nextLine();
            System.out.println("entrer la priorité (1,2,3):");
            int ordinal = s.nextInt();
            Priority priority = Priority.values()[ordinal-1];

            TaskInfos taskInfos = new TaskInfos(taskDescription,taskDate,priority);
            Task task = new Task(taskName,taskInfos);
            taskInfos.setTask(task);

            this.taskList.add(task);
            System.out.println("la tache a bien été ajoutée :");
            System.out.println(taskList.get(taskList.size()-1));

          //  Task task = new Task(taskName,taskDescription);
            taskDAO.addTask(task);
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
            taskList = taskDAO.getAllTasks();
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

            boolean success = taskDAO.markTaskAsCompleted(id);
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

            taskDAO.deleteTask(id);
            System.out.println("Tache supprimée avec succès !");
            this.menuGenerale();
        }
        catch( InputMismatchException e){
            s.nextLine();
            System.out.println("entrer une valeur numerique ");
            this.deleteTask();
        }
    }



}
