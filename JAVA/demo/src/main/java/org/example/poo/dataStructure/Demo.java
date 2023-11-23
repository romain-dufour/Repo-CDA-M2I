package org.example.poo.dataStructure;

public class Demo {

    public static void main(String[] args) {


        ElectricCar electricCar = new ElectricCar();
        electricCar.setCouleur("bleu");
        electricCar.setNbreRoue(5);

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.setCouleur("rouge");
        motorCycle.setNbreRoue(2);

        PetrolCar petrolCar = new PetrolCar();
        petrolCar.setCouleur("gris");
        petrolCar.setNbreRoue(4);

        SuperCar superCar = new SuperCar();

        Engine[] engines = {electricCar,motorCycle,petrolCar};
        for (Engine engine: engines) {
            moveVehicule(engine);
        }
        Vehicule[] vehicules = {superCar,electricCar,motorCycle,petrolCar};

    }

    public static void moveVehicule(Engine engine) {
        if(engine instanceof ElectricCar) {
            System.out.println("electrique");
            ((ElectricCar) engine).drive();
        } else if (engine instanceof  MotorCycle) {
            System.out.println("motorCycle");
            ((MotorCycle) engine).drive();
        }else if (engine instanceof  PetrolCar) {
            System.out.println("petrolCar");
            ((PetrolCar) engine).drive();

        }
    }

}

