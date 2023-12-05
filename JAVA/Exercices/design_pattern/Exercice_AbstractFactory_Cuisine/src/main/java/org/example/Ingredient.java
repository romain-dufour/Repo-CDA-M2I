package org.example;

public abstract class Ingredient {

    String name;

    public Ingredient(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ingredient principal : " + name;
    }

    public abstract void prepare();

}
