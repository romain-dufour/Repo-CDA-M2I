package org.example.model;

import java.time.Year;

public class Car {
    private int id;
    private String name;
    private int year;
    private int horsePower;
    private Double price;

    public Car() {
    }

    public Car(int id, String name, int year, int horsePower, Double price) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.horsePower = horsePower;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", horsePower=" + horsePower +
                ", price=" + price +
                '}';
    }
}
