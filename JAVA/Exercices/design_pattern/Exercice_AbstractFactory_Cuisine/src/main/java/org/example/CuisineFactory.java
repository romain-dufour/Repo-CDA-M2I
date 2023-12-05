package org.example;

public abstract class CuisineFactory {

        public abstract Ingredient createIngredient(String name);
        public abstract CookingUstensil createUtensil(String name);
        public abstract Dish createDish(String name);


}
