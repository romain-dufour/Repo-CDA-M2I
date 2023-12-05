package org.example.factory.impl;

import org.example.entity.impl.JapaneseDish;
import org.example.entity.impl.JapaneseIngredient;
import org.example.entity.impl.JapaneseUstensil;
import org.example.entity.CookingUstensil;
import org.example.entity.Dish;
import org.example.entity.Ingredient;
import org.example.factory.CuisineFactory;

public class JapaneseCuisineFactory extends CuisineFactory {


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

