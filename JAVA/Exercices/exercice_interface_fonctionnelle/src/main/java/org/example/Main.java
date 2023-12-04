package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Product produit1 = new Product("Produit1",10,"liste1");
        Product produit2 = new Product("Produit2",20,"liste2");
        Product produit3 = new Product("Produit3",30,"liste3");
        Product produit4 = new Product("Produit4",40,"liste1");
        Product produit5 = new Product("Produit5",50,"liste2");


        List<Product> productList = new ArrayList<>();
        productList.add(produit1);
        productList.add(produit2);
        productList.add(produit3);
        productList.add(produit4);
        productList.add(produit5);


        // filtre par prix
        List<Product> FilterdByPrice = Service.filterProducts(productList,produit -> produit.getPrice()> 10);

        for (Product product : FilterdByPrice) {
            System.out.println(product.toString());
        }
        System.out.println("***************************");

        //filtre par catégorie
        List<Product> FilterdByCategorie = Service.filterProducts(productList,categorie -> Objects.equals(categorie.getCategorie(), "liste2"));

        for (Product product : FilterdByCategorie) {
            System.out.println(product.toString());
        }
        System.out.println("***************************");


    }
}