package controller;

import model.Task;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ihm {

    protected List<Task> taskList = new ArrayList<>();

    private Scanner s = new Scanner(System.in);

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
            System.out.println("entrer le nom de la tache :");
            String taskName = s.next();
            System.out.println("entrer la description de la tache :");
            String taskDescription = s.next();

            this.listLieu.add(new Lieu(nomLieux,adresse,capacite));
            System.out.println("le lieux a bien ete ajouter :");
            System.out.println(listLieu.get(listLieu.size()-1));
            this.menuLieux();
        }
        catch (InputMismatchException e){
            System.out.println("entrer une valeur numerique ");
            this.addLieux();
        }
    }

    public void displayTasks (){
        try{
            try{
                System.out.println("--------modifier lieu----------");
                afficheList(this.listLieu);
                System.out.println("quelle lieux vouler vous modifier : ");
                int entry = s.nextInt();

                System.out.println(this.listLieu.get(entry-1));
                System.out.println("entrer le nouveau nom : ");
                String nom =s.next();
                System.out.println("entrer la nouvelle adresse : ");
                String adresse = s.next();
                int capacite = this.entryCapacity();

                this.listLieu.set(entry-1,new Lieu(nom,adresse,capacite));
                System.out.println(this.listLieu.get(entry-1));
                this.menuLieux();
            }
            catch (IndexOutOfBoundsException e){
                this.menuLieux();
            }
        }
        catch (InputMismatchException e){
            System.out.println("entrer une valeur numerique ");
            this.modifLieu();
        }
    }

    public void markTaskAsFinished (){
        try{
            System.out.println("--------supr lieu----------");
            afficheList(this.listLieu);
            System.out.println("quelle lieux vouler vous supprimer (0 pour retour) : ");
            int entry = s.nextInt();

            if(entry == 0){
                this.menuLieux();
            }
            else{
                this.listLieu.remove(entry-1);
                System.out.println("le lieux a bien ete supprimer");
                this.menuLieux();
            }
        }
        catch( InputMismatchException e){
            System.out.println("entrer une valeur numerique ");
            this.suprLieu();
        }
    }

    public int deleteTask (){
        int entry =0;
        do {
            System.out.println("entrer la capacité du lieu :");
            entry = s.nextInt();
        }
        while (entry<=0);

        return entry;
    }




    public void addEvenement (){
        try {
            System.out.println("--------ajouter Evenement----------");

            System.out.println("entrer le nom de l'evenement:");
            String nom = s.next();

            System.out.println("entrer la date de l'evenement (format dd-MM-yyyy):");
            String date_string = s.next();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            Date date = formatter.parse(date_string);

            System.out.println("entrer l'heure de l'evenement :");
            String heure = s.next();

            System.out.println();
            this.afficheList(listLieu);
            System.out.println("selectionner le lieu de l'evenement :");
            int lieux = s.nextInt();

            System.out.println("entrer le prix du billet");
            float prix = s.nextFloat();


            this.listEvenement.add(new Evenement(nom, date, heure,prix,this.listLieu.get(lieux-1)));
            System.out.println("l'evenement a bien ete ajouter :");
            System.out.println(listEvenement.get(listEvenement.size()-1));
            this.menuEvenement();
        }
        catch (InputMismatchException e){
            System.out.println("entrer une valeur numerique ");
            this.addEvenement();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public void suprEvenement (){
        try{
            System.out.println("--------supr evenement----------");
            afficheList(this.listEvenement);
            System.out.println("quelle evenement vouler vous supprimer (0 pour retour) : ");
            int entry = s.nextInt();

            if(entry == 0){
                this.menuEvenement();
            }
            else{
                this.listEvenement.remove(entry-1);
                System.out.println("l'evenement a bien ete supprimer");
                this.menuEvenement();
            }
        }
        catch( InputMismatchException e){
            System.out.println("entrer une valeur numerique ");
            this.suprEvenement();
        }
    }



}
