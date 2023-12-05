package org.example.entity;

import org.example.entity.CookingUstensil;
import org.example.entity.Dish;
import org.example.entity.Ingredient;
import org.example.factory.CuisineFactory;

public class Restaurant {
    private CuisineFactory cuisineFactory;
    public Restaurant(CuisineFactory cuisineFactory){

        this.cuisineFactory = cuisineFactory;
    }

    public void setCuisineFactory(CuisineFactory cuisineFactory) {
        this.cuisineFactory = cuisineFactory;
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "cuisineFactory=" + cuisineFactory +
                '}';
    }

    public void preparePlat(String nomIngredient, String ustensil , String nomPlat){
        Ingredient ingredient = cuisineFactory.createIngredient(nomIngredient);
        CookingUstensil cookingUstensil = cuisineFactory.createUtensil(ustensil);
        Dish dish = cuisineFactory.createDish(nomPlat);


        System.out.println("Plat préparé selon la " + cuisineFactory.toString());
        ingredient.prepare();
        System.out.println(ingredient.toString());
        cookingUstensil.use();
        System.out.println(cookingUstensil.toString());
        dish.serve();
        System.out.println(dish.toString());
        System.out.println("Meal prepared!\n");
    }
}