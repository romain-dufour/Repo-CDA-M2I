package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Restaurant italianRestaurant = new Restaurant(new ItalianCuisineFactory());
        italianRestaurant.preparePlat("pates","egoutoire", "repas etudiant");

        Restaurant japaneseRestaurant = new Restaurant(new JapaneseCuisineFactory());
        japaneseRestaurant.preparePlat("thon", "baguettes","sashimi");

        Restaurant mexicanRestaurant = new Restaurant(new MexicanCuisineFactory());
        mexicanRestaurant.preparePlat("haricot rouge", "marmite", "Chili con carne");
    }
}