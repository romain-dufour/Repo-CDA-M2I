package dao;

import model.Produit;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface ProduitDAO {


    public void add(Produit produit);

    public void deleteProduct(Long productId);

    public void updateProduct(Long productId, String newMarque, String newReference, LocalDate newDate, Double newPrice, int newStock);

    public List<Produit> getProductList();

    public List<Produit> getProductByPrice(Double price);

    public List<Produit>getProductByDate(LocalDate A, LocalDate B);





//
//    - Créer cinq produits,
//            - Afficher les informations du produit dont id = 2,
//            - Supprimer le produit dont id = 3,
//            - Modifier les informations du produit dont id = 1,
//
//
//            1. Afficher la totalité des produits
//2. Afficher la liste des produits dont le prix est supérieur à 100 euros
//3. Afficher la liste des produits achetés entre deux dates.
}
