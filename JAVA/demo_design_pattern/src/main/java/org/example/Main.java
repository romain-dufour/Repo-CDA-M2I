package org.example;

import org.example.demo_abstractFactory.Application;
import org.example.demo_abstractFactory.MaxFactory;
import org.example.demo_abstractFactory.WinFactory;
import org.example.demo_builder.Voiture;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Builder


        Voiture voiture = new Voiture.Builder()
                .marque("tesla")
                .model("3")
                .build();
        voiture=new Voiture.Builder().marque("m1")
                .build();


        //Abstract Factory


        //Application Mac
        Application application = new Application(new MaxFactory());
        //Application Windows
        Application applicationWindows = new Application(new WinFactory());
    }
}
