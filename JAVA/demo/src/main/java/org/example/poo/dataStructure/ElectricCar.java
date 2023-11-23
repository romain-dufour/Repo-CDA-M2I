package org.example.poo.dataStructure;

public class ElectricCar extends Engine implements Vehicule{

    public ElectricCar() {
        id = Engine.count;
    }

    @Override
    protected void test() {

    }

    @Override
    public void drive() {
        System.out.println("Je suis une ElectricCar qui roule");

    }

    @Override
    public void startEngine() {
        System.out.println("Je suis une ElectricCar qui démarre");

    }
}
