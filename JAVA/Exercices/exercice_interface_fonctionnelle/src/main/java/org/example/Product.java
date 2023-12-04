package org.example;

import java.util.Date;

public class Product {
    private String name;



    private double price;
    private String categorie;

    public Product(String name, double price, String categorie) {
        this.name = name;
        this.price = price;
        this.categorie = categorie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categorie='" + categorie + '\'' +
                '}';
    }
}
