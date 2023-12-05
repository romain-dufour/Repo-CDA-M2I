package org.example;

public class MexicanCuisineFactory extends CuisineFactory{

    @Override
    public Ingredient createIngredient(String name) {
        return new MexicanIngredient(name);
    }

    @Override
    public CookingUstensil createUtensil(String name) {
        return new MexicanUstensil(name);
    }

    @Override
    public Dish createDish(String name) {
        return new MexicanDish(name);
    }

    @Override
    public String toString() {
        return "Cuisine mexicaine";
    }
}
