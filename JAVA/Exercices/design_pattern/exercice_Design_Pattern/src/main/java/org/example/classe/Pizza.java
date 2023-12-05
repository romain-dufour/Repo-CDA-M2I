package org.example.classe;

import org.example.Exception.IngredientException;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Pizza {
    private String size;
    private String pasta;
    private String cheese;
    private List<String> ingredient = new ArrayList<>();
    private String saussage;

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", pasta='" + pasta + '\'' +
                ", cheese='" + cheese + '\'' +
                ", ingredient=" + ingredient +
                ", saussage='" + saussage + '\'' +
                '}';
    }

    private Pizza(Builder builder){
        this.size= builder.size;
        this.pasta = builder.pasta;
        this.cheese = builder.cheese;
        this.ingredient = builder.ingredient;
        this.saussage = builder.saussage;
    }

    public static class Builder {
        private String size;
        private String pasta;
        private String cheese;
        private List<String> ingredient = new ArrayList<>();
        private String saussage;


        public Builder size (String size){
            this.size = size;
            return this ;
        }
        public Builder pasta (String pasta){
            this.pasta = pasta;
            return this ;
        }
        public Builder cheese (String cheese) throws IngredientException {
            if (this.cheese == null){
                this.cheese = cheese;
            }
          else {
              throw new IngredientException("Vous ne pouvez pas selectionner plusieurs fromages");
            }
          return this;
        }
        public Builder addIngredient (String ingredient){
            this.ingredient.add(ingredient);
            return this ;
        }
        public Builder saussage (String saussage){
            this.saussage = saussage;
            return this ;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }
}

