package controller;

import dao.ProduitDAO;
import impl.*;
import model.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductAppConsole {

    private static SessionFactory sessionFactory;

    private static ProduitDAOImpl produitDAO;
    private static ImageDAOImpl imageDAO;
    private static CommentaireDAOImpl commentaireDAO;
    private static CommandeDAOImpl commandeDAO;
    private static AdresseDAOImpl adresseDAO;

    public static void main() throws Exception {



        produitDAO = new ProduitDAOImpl();
        imageDAO = new ImageDAOImpl();
        commentaireDAO = new CommentaireDAOImpl();
        commandeDAO = new CommandeDAOImpl();
        adresseDAO = new AdresseDAOImpl();

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
            System.out.println("8. retourner les numéros et reference des articles dont le stock est inférieur à une valeur lue au clavier");
            System.out.println("9. Afficher la valeur du stock des produits d'une marque choisie.");
            System.out.println("10. Calculer le prix moyen des produits");
            System.out.println("11. Récupérer la liste des produits d'une marque choisie");
            System.out.println("12. Supprimer les produits d'une marque choisie de la table produit");
            System.out.println("13. ajouter une image à un produit");
            System.out.println("14. ajouter un commentaire à un produit");
            System.out.println("15. Afficher les produits avec une note de 4 ou plus");
            System.out.println("16. Créer une nouvelle commande");
            System.out.println("17. Afficher la totalité des commandes");
            System.out.println("18. Afficher les commandes du jour");
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
                    displayIdAndRefByStockValue(scanner);
                    break;
                case 9:
                    displayStockValueByMarque(scanner);
                    break;
                case 10:
                    displayAveragePrice(scanner);
                    break;
                case 11:
                    DisplayProductListByMarque(scanner);
                    break;
                case 12:
                    DeleteProductsByMarque(scanner);
                    break;
                case 13:
                    addImage(scanner);
                    break;
                case 14:
                    addComment(scanner);
                    break;
                case 15:
                    displayProductWithNoteOver4();
                    break;
                case 16:
                    createNewOrder(scanner);
                    break;
                case 17:
                    displayAllOrders();
                    break;
                case 18:
                    displayDailyOrders();
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

        System.out.println("Entrer l'id d'une nouvelle image du produit: ");
        Long nouvelleimageId = scanner.nextLong();

        System.out.println("Entrer un nouveau commentaire du produit : ");
        Long nouveauCommentaireId = scanner.nextLong();

        Produit produit = produitDAO.getProductById(productId);
        List<Image>imageList = produit.getImageList();
        Image newImage = imageDAO.getImageById(nouvelleimageId);
        imageList.add(newImage);

        Commentaire newCommentaire = commentaireDAO.getCommentaireById(nouveauCommentaireId);
        List<Commentaire>commentaireList = produit.getCommentaireList();
        commentaireList.add(newCommentaire);
        Produit newProduit = new Produit(productId,nouvelleMarque,nouvelleReference,nouvelledueDate,nouveauPrice,nouveauStock,commentaireList,imageList);

        produitDAO.updateProduct(newProduit);


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
    private static void displayProductListBySellDate(Scanner scanner) throws Exception {
        System.out.println("Entrer la date A : (dd.MM.yyyy)");
        String dueDateStrA = scanner.nextLine();
        LocalDate dueDateA = LocalDate.parse(dueDateStrA, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println("Entrer la date B : (dd.MM.yyyy)");
        String dueDateStrB = scanner.nextLine();
        LocalDate dueDateB = LocalDate.parse(dueDateStrB, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        List<Produit> produitList = produitDAO.getProductByDate(dueDateA,dueDateB);
        for (Produit p : produitList
        ) {
            System.out.println("Les produit ayant été achetés entre " + dueDateStrA + " et " + dueDateB + " sont : " + p);
        }
    }

    private static void displayIdAndRefByStockValue(Scanner scanner){
        System.out.println("Entrer la valeur du stock :");
        int stockValue = scanner.nextInt();

        List<Produit> produitList = produitDAO.getProductByStockValue(stockValue);
        System.out.println("Les produits dont le stock est inférieur à " + stockValue + " sont :");
        for (Produit p : produitList
        ) {
            System.out.println("Produit numéro : " + p.getId() + " avec la reference : " + p.getReference() + ". La valeur du stock est de : " + p.getStock());
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


    private static void addImage (Scanner scanner){
        System.out.println("Entrer l'URL de l'image : ");
        String Url = scanner.nextLine();

        System.out.println("Entrez l'ID du produit : ");
        Long productId  = scanner.nextLong();
        scanner.nextLine();

        Image image = new Image();
        image.setUrl(Url);

        Produit produit = produitDAO.getProductById(productId);
        image.setProduit(produit);
        imageDAO.add(image);

        List<Image>imageList = produit.getImageList();
        imageList.add(image);

        produitDAO.updateProduct(produit);

    }
    private static void addComment (Scanner scanner){
        System.out.println("Entrer le contenu du commentaire : ");
        String contenu = scanner.nextLine();

        System.out.println("Date de création du commentaire : (dd.MM.yyyy)");
        String dateComment = scanner.nextLine();

        LocalDate dueDate = LocalDate.parse(dateComment, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        System.out.println("Entrer la note du produit : ");
        Double note = scanner.nextDouble();

        System.out.println("Entrez l'ID du produit : ");
        Long productId  = scanner.nextLong();
        scanner.nextLine();


        Commentaire commentaire = new Commentaire();
        commentaire.setContenu(contenu);
        commentaire.setDate(dueDate);
        commentaire.setNote(note);

        Produit produit = produitDAO.getProductById(productId);
        commentaire.setProduit(produit);

        commentaireDAO.add(commentaire);

        List<Commentaire>commentaireList = produit.getCommentaireList();
        commentaireList.add(commentaire);

        produitDAO.updateProduct(produit);
    }

    private static void displayProductWithNoteOver4 (){

        List<Produit> produitList = produitDAO.getProductByNote();
        System.out.println("La liste des produits avec une note moyenne au dessus de 4 est :");

        for (Produit p: produitList
             ) {
            System.out.println("Produit : " + p);
        }
    }

    private static void createNewOrder(Scanner scanner){

        System.out.println("Date de création de la commande : (dd.MM.yyyy)");
        String dateOrder = scanner.nextLine();

        LocalDate dueDate = LocalDate.parse(dateOrder, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        List<Produit>listeCommande= new ArrayList<>();
        Double totalCommande = 0.0;

        while (true) {
            System.out.println("---------Liste des produits ------------");
            List<Produit> produitList = produitDAO.getProductList();

            for (Produit produit : produitList) {
                System.out.println("ID: " + produit.getId() + " | Nom: " + produit.getReference() + " | Prix: " + produit.getPrix() + " | Stock: " + produit.getStock());
            }

            System.out.println("Veuillez saisir l'ID du produit à ajouter à la commande (ou 0 pour terminer) : ");

            Long productId = scanner.nextLong();
            Produit produit = produitDAO.getProductById(productId);
            listeCommande.add(produit);
            if (productId != 0){
                totalCommande += produit.getPrix();
            }else {
                break;
            }
        }
        scanner.nextLine();
        System.out.println("************ Creation de l'adresse de commande **************");
        System.out.println("Nom de la rue: ");
        String rue = scanner.nextLine();
        System.out.println("Nom de la ville : ");
        String ville = scanner.nextLine();
        System.out.println("Code postal : ");
        int codePostal = scanner.nextInt();

        Commande commande = new Commande();
        commande.setDateCommande(dueDate);
        commande.setProduitList(listeCommande);
        commande.setTotal(totalCommande);


        commandeDAO.add(commande);

        Adresse adresse = new Adresse();
        adresse.setRue(rue);
        adresse.setVille(ville);
        adresse.setCodePostal(codePostal);
        adresse.setCommande(commande);
        adresseDAO.add(adresse);
    }


    private static void displayAllOrders(){
        System.out.println("Ci dessous la liste des commandes :");
        List<Commande> commandeList = commandeDAO.getCommandeList();

        for (Commande c: commandeList
             ) {
            System.out.println("ID: " + c.getId() + " | Date de commande : " + c.getDateCommande() + " | Montant de la commande: " + c.getTotal() + " €");
        }

    }


    private static void displayDailyOrders(){
        System.out.println("Ci dessous la liste des commandes du jour:");
        List<Commande> commandeList = commandeDAO.getCommandeListByDailyDate();
        for (Commande c: commandeList
        ) {
            System.out.println("ID: " + c.getId() + " | Date de commande : " + c.getDateCommande() + " | Montant de la commande: " + c.getTotal() + " €");
        }
    }

}


