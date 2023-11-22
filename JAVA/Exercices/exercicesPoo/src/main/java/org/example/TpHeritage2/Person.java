package org.example.TpHeritage2;

public class Person extends House{
    protected String name;
    protected House house;

    public Person(String name, House house) {
        this.name = name;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public void Display() {
        System.out.println("Je m'appelle " + name + ".");
        house.display();
    }}

