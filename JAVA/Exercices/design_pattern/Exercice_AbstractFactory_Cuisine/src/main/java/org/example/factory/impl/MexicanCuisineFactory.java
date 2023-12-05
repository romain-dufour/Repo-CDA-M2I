package org.example.factory.impl;

import org.example.entity.impl.MexicanDish;
import org.example.entity.impl.MexicanIngredient;
import org.example.entity.impl.MexicanUstensil;
import org.example.entity.CookingUstensil;
import org.example.entity.Dish;
import org.example.entity.Ingredient;
import org.example.factory.CuisineFactory;

public class MexicanCuisineFactory extends CuisineFactory {

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
