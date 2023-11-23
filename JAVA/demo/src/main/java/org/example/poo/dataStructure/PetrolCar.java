package org.example.poo.dataStructure;

public class PetrolCar extends Engine implements Vehicule{

    public PetrolCar() {
        id = Engine.count;
    }

    @Override
    public void drive() {
        System.out.println("Je suis une PetrolCar qui roule");

    }

    @Override
    public void startEngine() {
        System.out.println("Je suis une PetrolCar qui démarre");

    }

    @Override
    protected void test() {

    }

    @Override
    public String toString() {
        return "PetrolCar{" +
                "id=" + id +
                ", nbreRoue=" + nbreRoue +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
