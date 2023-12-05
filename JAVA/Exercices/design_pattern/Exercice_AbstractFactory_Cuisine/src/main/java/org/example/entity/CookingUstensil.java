package org.example.entity;

public abstract class CookingUstensil {
    String name;

    public CookingUstensil(String name) {
        this.name = name;
    }

    public abstract void use();

    @Override
    public String toString() {
        return "Ustensil : " + name;
    }
}
