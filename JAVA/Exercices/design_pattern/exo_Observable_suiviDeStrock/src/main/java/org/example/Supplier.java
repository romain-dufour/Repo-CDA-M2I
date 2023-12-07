package org.example;

public class Supplier implements Observer{

    @Override
    public void update(int stock) {
        System.out.println("Le niveau de stock pour le produit " + stock);

    }
}
