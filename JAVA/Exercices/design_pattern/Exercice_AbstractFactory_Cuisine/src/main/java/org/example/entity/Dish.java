package org.example.entity;

public abstract class Dish {
    String name;

    public Dish(String name) {
        this.name = name;
    }

    public abstract void serve();

    @Override
    public String toString() {
        return "Plat : " + name;
    }
}
