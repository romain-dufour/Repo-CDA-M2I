package org.example.poo.dataStructure;

public class MotorCycle extends Engine implements Vehicule{
    public MotorCycle() {
        id= Engine.count;
    }

    @Override
    protected void test() {

    }

    @Override
    public void drive() {
        System.out.println("Je suis une MotorCycle qui roule");
    }

    @Override
    public void startEngine() {
        System.out.println("Je suis une MotorCycle qui démarre");

    }
}
