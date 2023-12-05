package org.example;

import org.example.classe.Pizza;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Pizza.Builder()
                .size("Moyenne")
                .pasta("fine")
                .cheese("mozzarella")
              //  .cheese("gorgonzolla")
                .addIngredient("jambon")
                .addIngredient("champignons")
                .saussage("sauce tomate")
                .build();

        System.out.println(pizza.toString());
    }

}