package org.example;

public class JapaneseCuisineFactory extends CuisineFactory{


    @Override
    public Ingredient createIngredient(String name) {
        return new JapaneseIngredient(name);
    }

    @Override
    public CookingUstensil createUtensil(String name) {
        return new JapaneseUstensil(name);
    }

    @Override
    public Dish createDish(String name) {
        return new JapaneseDish(name);
    }

    @Override
    public String toString() {
        return "Cuisine japonaise";
    }
}

