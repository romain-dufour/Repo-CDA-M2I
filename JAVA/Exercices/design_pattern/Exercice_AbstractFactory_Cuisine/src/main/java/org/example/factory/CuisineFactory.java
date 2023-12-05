package org.example.factory;

import org.example.entity.CookingUstensil;
import org.example.entity.Dish;
import org.example.entity.Ingredient;

public abstract class CuisineFactory {

        public abstract Ingredient createIngredient(String name);
        public abstract CookingUstensil createUtensil(String name);
        public abstract Dish createDish(String name);


}
