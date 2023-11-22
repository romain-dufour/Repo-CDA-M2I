package org.example.poo;

public class Product {
    protected int id;
    protected  String name;
    public Product(){

    };

    public Product(int NewID, String name) {
        this.id = NewID;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void getBonjour(){
        System.out.println("Bonjour");
    }

    public void  quiSuisJe(){
        System.out.println("Je suis un produit");    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
