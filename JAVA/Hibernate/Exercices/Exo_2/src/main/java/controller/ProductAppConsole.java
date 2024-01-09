package controller;

import dao.ProduitDAO;
import impl.ProduitDAOImpl;
import model.Produit;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProductAppConsole {

    private static SessionFactory sessionFactory;

    private static ProduitDAOImpl produitDAO;



    public static void main() {



        produitDAO = new ProduitDAOImpl();

        Scanner scanner = new Scanner(System.in);


        int choice;
        do {
            System.out.println("#### Liste de produit - hibernate ####");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Afficher un produit selon son id");
            System.out.println("3. Supprimer un produit selon son id");
            System.out.println("4. Modifier un produit selon son id");
            System.out.println("5. Afficher la liste de produits");
            System.out.println("6. Afficher la liste de produits selon le prix");
            System.out.println("7. Afficher la liste de produits achetés entre deux dates");
            System.out.println("8. Afficher la valeur du stock des produits d'une marque choisie.");
            System.out.println("9. Calculer le prix moyen des produits");
            System.out.println("10. Récupérer la liste des produits d'une marque choisie");
            System.out.println("11. Supprimer les produits d'une marque choisie de la table produit");
            System.out.println("0. Quitter l'application");
            System.out.println("Choix : ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne

            switch (choice){
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    displayProductById(scanner);
                    break;
                case 3:
                    deleteProductById(scanner);
                    break;
                case 4:
                    updateProductById(scanner);
                    break;
                case 5:
                    displayProductList(scanner);
                    break;
                case 6:
                    displayProductListByPrice(scanner);
                    break;
                case 7:
                    displayProductListBySellDate(scanner);
                    break;
                case 8:
                    displayStockValueByMarque(scanner);
                    break;
                case 9:
                    displayAveragePrice(scanner);
                    break;
                case 10:
                    DisplayProductListByMarque(scanner);
                    break;
                case 11:
                    DeleteProductsByMarque(scanner);
                    break;
                case 0:
                    System.out.println("Bye");
                    sessionFactory.close();
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");

            }

        }while (choice != 0);
    }

    private static void addProduct(Scanner scanner){
        System.out.println("Entrer la marque du produit : ");
        String marque = scanner.nextLine();

        System.out.println("Entrer la reference du produit : ");
        String reference = scanner.nextLine();

        System.out.println("Date d'achat du produit : (dd.MM.yyyy)");
        String dateSell = scanner.nextLine();

        LocalDate dueDate = LocalDate.parse(dateSell, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        System.out.println("Prix du produit: ");
        Double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Quantité en stock: ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        // Creation du produit
        Produit produit = new Produit();
        produit.setMarque(marque);
        produit.setReference(reference);
        produit.setDateAchat(dueDate);
        produit.setPrix(price);
        produit.setStock(stock);

        produitDAO.add(produit);

    }

    private static void displayProductById(Scanner scanner) {
        System.out.println("Entrez l'ID du produit : ");
        Long personId  = scanner.nextLong();
        scanner.nextLine();
        List<Produit>produitList = produitDAO.getProductList();

        for (Produit p : produitList
             ) {
            if (p.getId() == personId){
                System.out.println("Produit : " + p);
            }
        }


    }
    private static void deleteProductById(Scanner scanner) {
        System.out.println("Entrez l'ID du produit : ");
        Long productId  = scanner.nextLong();
        scanner.nextLine();
        produitDAO.deleteProduct(productId);
    }
    private static void updateProductById(Scanner scanner) {
        System.out.println("Entrez l'ID du produit : ");
        Long productId  = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Entrer la nouvelle marque du produit : ");
        String nouvelleMarque = scanner.nextLine();

        System.out.println("Entrer la nouvelle reference du produit : ");
        String nouvelleReference = scanner.nextLine();

        System.out.println("Nouvelle date d'achat du produit : (dd.MM.yyyy)");
        String dateSell = scanner.nextLine();

        LocalDate nouvelledueDate = LocalDate.parse(dateSell, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        System.out.println("Nouveau prix du produit: ");
        Double nouveauPrice = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Nouvelle quantité en stock: ");
        int nouveauStock = scanner.nextInt();
        scanner.nextLine();

    }

    private static void displayProductList(Scanner scanner) {

        List<Produit> produitList = produitDAO.getProductList();
        for (Produit p : produitList
        ) {
            System.out.println("Le produit : " + p);
        }
    }
    private static void displayProductListByPrice(Scanner scanner) {
        System.out.println("Entrer le prix : ");
        Double prix = scanner.nextDouble();
        List<Produit> produitList = produitDAO.getProductByPrice(prix);
        for (Produit p : produitList
        ) {
            System.out.println("Le produit : " + p);
        }

    }
    private static void displayProductListBySellDate(Scanner scanner) {
        System.out.println("Entrer la date A : (dd.MM.yyyy)");
        String date1 = scanner.nextLine();
        System.out.println("Entrer la date B : (dd.MM.yyyy)");
        String date2 = scanner.nextLine();

        String dueDateStrA = scanner.nextLine();
        LocalDate dueDateA = LocalDate.parse(dueDateStrA, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        String dueDateStrB = scanner.nextLine();
        LocalDate dueDateB = LocalDate.parse(dueDateStrB, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        List<Produit> produitList = produitDAO.getProductByDate(dueDateA,dueDateB);
        for (Produit p : produitList
        ) {
            System.out.println("Les produit ayant été achetés entre " + dueDateStrA + " et " + dueDateB + " sont : " + p);
        }
    }

    private static void displayStockValueByMarque(Scanner scanner) {
        System.out.println("Entrer la marque : ");
        String marque = scanner.nextLine();

        double value = produitDAO.DisplayStockValueByMark(marque);
        System.out.println("La valeur du stock de la marque est de : " + value + " €");

    }

    private static void displayAveragePrice(Scanner scanner) {
        double prixMoyen = produitDAO.averagePrice();
        System.out.println(prixMoyen);
    }

    private static void DisplayProductListByMarque(Scanner scanner) {
        System.out.println("Entrer la marque des produits a afficher : ");
        String marque = scanner.nextLine();
        List<Produit> produitList = produitDAO.listProductByMark(marque);
        for (Produit p : produitList
        ) {
            System.out.println("Le produit de la marque " + marque + " : " + p);
        }
    }

    private static void DeleteProductsByMarque(Scanner scanner) {
        System.out.println("Entrer la marque des produits a supprimer : ");
        String marque = scanner.nextLine();

        produitDAO.deleteByMark(marque);
    }
}


