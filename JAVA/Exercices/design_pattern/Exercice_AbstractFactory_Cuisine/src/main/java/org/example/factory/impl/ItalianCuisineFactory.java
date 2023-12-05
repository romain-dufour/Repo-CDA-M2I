package org.example.factory.impl;

import org.example.entity.impl.ItalianDish;
import org.example.entity.impl.ItalianIngredient;
import org.example.entity.impl.ItalianUtensil;
import org.example.entity.CookingUstensil;
import org.example.entity.Dish;
import org.example.entity.Ingredient;
import org.example.factory.CuisineFactory;

public class ItalianCuisineFactory extends CuisineFactory {

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
