package org.example;

public class ItalianCuisineFactory extends CuisineFactory{

    @Override
    public Ingredient createIngredient(String name) {
        return new ItalianIngredient(name);
    }

    @Override
    public CookingUstensil createUtensil(String name) {
        return new ItalianUtensil(name);
    }

    @Override
    public Dish createDish(String name) {
        return new ItalianDish(name);
    }

    @Override
    public String toString() {
        return "Cuisine italienne";
    }
}
