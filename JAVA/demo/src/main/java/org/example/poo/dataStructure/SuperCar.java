package org.example.poo.dataStructure;

public class SuperCar implements Vehicule{
    @Override
    public void drive() {
        System.out.println("Je suis une supercar qui roule très vite");
    }

    @Override
    public void startEngine() {
        System.out.println("Je suis une supercar qui démarre");
    }
}
