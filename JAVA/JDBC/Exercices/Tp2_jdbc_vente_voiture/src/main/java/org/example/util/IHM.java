package org.example.util;

import com.mysql.cj.protocol.a.LocalDateTimeValueEncoder;
import org.example.model.Car;
import org.example.model.Person;
import org.example.model.Sales;
import org.example.service.VenteVoitureService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class IHM {

    protected List<Car> listCar = new ArrayList<>();
    protected List<Person> listPerson = new ArrayList<>();
    protected List<Sales> listSales = new ArrayList<>();

    protected VenteVoitureService venteVoitureService = new VenteVoitureService();
    private Scanner scanner = new Scanner(System.in);
    public IHM(){}

    public void start() {
        this.menuGenerale();
    }

    public void menuGenerale (){
        try{
            System.out.println("----------menu---------");
            System.out.println("1/ action voitures");
            System.out.println("2/ action personnes");
            System.out.println("3/ action ventes");
            System.out.println("0/ quitter");
            System.out.println("entrer votre choix :");
            int entry = scanner.nextInt();
            switch (entry){
                case 1:
                    this.menuVoitures();
                    break;
                case 2 :
                    this.menuPersonnes();
                    break;
                case 3:
                    this.menuVentes();
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

    public void menuVoitures(){
        try{
            System.out.println("----------menu Voiture---------");
            System.out.println("1/ Enregistrer une voiture");
            System.out.println("2/ Lister toutes les voitures");
            System.out.println("3/ Supprimer une voiture");
            System.out.println("4/ Changer de voiture");
            System.out.println("0/ retourner au menu generale");
            System.out.println("entrer votre choix :");
            int entry = scanner.nextInt();
            switch (entry){
                case 1:
                    this.addCar();
                    break;
                case 2:
                    this.listAllCars();
                    break;
                case 3 :
                    this.deleteCar();
                    break;
                case 4 :
                    this.updateACar();
                    break;
                case 0:
                    this.menuGenerale();
                    break;
                default :
                    System.out.println("entrer une valeur correspondant a un choix");
                    this.menuVoitures();
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("entrer une valeur numerique ");
            this.menuVoitures();
        }
    }
    public void menuPersonnes(){
        try{
            System.out.println("----------menu Personnes---------");
            System.out.println("1/ Inscrire une personne");
            System.out.println("2/ Lister toutes les personnes");
            System.out.println("3/ Supprimer une personne");
            System.out.println("0/ Changer une personne");
            System.out.println("entrer votre choix :");
            int entry = scanner.nextInt();
            switch (entry){
                case 1:
                    this.addPerson();
                    break;
                case 2:
                    this.listAllPerson();
                    break;
                case 3 :
                    this.deletePerson();
                    break;
                case 0:
                    this.menuGenerale();
                    break;
                default :
                    System.out.println("entrer une valeur correspondant a un choix");
                    this.menuPersonnes();
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("entrer une valeur numerique ");
            this.menuPersonnes();
        }
    }
    public void menuVentes(){
        try{
            System.out.println("----------menu Vente---------");
            System.out.println("1/ Faire la vente");
            System.out.println("2/ Afficher les ventes de voitures");
            System.out.println("3/ Afficher la liste des ventes d'un véhicule pour une personne");
            System.out.println("0/ retourner au menu generale");
            System.out.println("entrer votre choix :");
            int entry = scanner.nextInt();
            switch (entry){
                case 1:
                    this.makeADeal();
                    break;
                case 2:
                    this.listAllDeals();
                    break;
                case 3 :
                    this.listDealForAPerson();
                    break;
                case 0:
                    this.menuGenerale();
                    break;
                default :
                    System.out.println("entrer une valeur correspondant a un choix");
                    this.menuVentes();
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("entrer une valeur numerique ");
            this.menuVentes();
        }
    }


    private void addCar() {
        scanner.nextLine();
        System.out.print("Nom de la voiture  : ");
        String name = scanner.nextLine();
        System.out.print("Année de la voiture : ");
        int year = scanner.nextInt();
        System.out.print("Puissance de la voiture : ");
        int horsePower = scanner.nextInt();
        System.out.print("Prix de la voiture : ");
        Double price = scanner.nextDouble();

        venteVoitureService.registerCar(name,year,horsePower,price);
        this.menuVoitures();
    }

    public void listAllCars(){
    listCar = venteVoitureService.listAllCar();
    for (Car car : listCar){
        System.out.println(car);
    }
        this.menuVoitures();
    }

    private void deleteCar() {
        System.out.print("ID de la voiture à supprimer : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        venteVoitureService.deleteCar(id);
        System.out.println("Voiture supprimée avec succès !");
        this.menuVoitures();
    }
    private void updateACar() {
        System.out.print("ID de la voiture à modifier : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Car car = venteVoitureService.getCar(id);
        if (car == null) {
            System.out.println("Voiture non trouvée !");
            return;
        }
        System.out.print("Nouveau nom de la voiture : ");
        String newName = scanner.nextLine();
        System.out.print("Nouvelle année de la voiture : ");
        int newYear = scanner.nextInt();
        System.out.print("Nouvelle puissance de la voiture : ");
        int newHorsePower = scanner.nextInt();
        System.out.print("Nouveau prix de la voiture : ");
        Double newPrice = scanner.nextDouble();

        car.setName(newName);
        car.setYear(newYear);
        car.setHorsePower(newHorsePower);
        car.setPrice(newPrice);

        venteVoitureService.updateCar(car);
        System.out.println("Voiture mise à jour avec succès !");
        this.menuVoitures();
    }


    private void addPerson() {
        scanner.nextLine();
        System.out.print("Nom de la personne  : ");
        String lastName = scanner.nextLine();
        System.out.print("Prénom de la personne  : ");
        String firstName = scanner.nextLine();
        System.out.print("Age de la personne : ");
        int age = scanner.nextInt();
        System.out.print("Prix de la personne : ");
        double price = scanner.nextInt();

        venteVoitureService.createPerson(lastName,firstName,age,price);
        this.menuPersonnes();

    }

    public void listAllPerson(){
        listPerson = venteVoitureService.listAllPersons();
        for (Person person : listPerson){
            System.out.println(person);
        }
        this.menuPersonnes();

    }

    private void deletePerson() {
        System.out.print("ID de la personne à supprimer : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        venteVoitureService.deletePerson(id);
        System.out.println("personne supprimée avec succès !");
        this.menuPersonnes();

    }


    private void makeADeal() {
        System.out.print("id de la voiture  : ");
        int carId = scanner.nextInt();
        System.out.print("id de la personne : ");
        int personId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("entrer la date de la vente (format yyyy-MM-dd):");
        String date_string = scanner.nextLine();

        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate = null;
        try {
            parsedDate = inputFormat.parse(date_string);

            // Afficher la date au format Date
            System.out.println("Date au format Date : " + parsedDate);

            // Vous pouvez maintenant utiliser parsedDate pour l'insérer dans la base de données
        } catch (ParseException e) {
            System.out.println("Erreur de format de date. Assurez-vous d'utiliser le format correct (YYYY-MM-DD).");

            venteVoitureService.makeASale(carId, personId, parsedDate);
        }
        this.menuVentes();

    }

            public void listAllDeals () {
                listSales = venteVoitureService.listAllSales();
                for (Sales sales  : listSales) {
                    System.out.println(sales);
                }
                this.menuVentes();

            }

    // TODO: 23/12/2023
            public void listDealForAPerson () {
                System.out.print("id de la voiture  : ");
                int carId = scanner.nextInt();
                System.out.print("id de la personne : ");
                int personId = scanner.nextInt();

                listSales = venteVoitureService.listSalesFromAPerson(carId,personId);
                for (Sales sales  : listSales) {
                    System.out.println(sales);
                }
                this.menuVentes();

            }


        }
