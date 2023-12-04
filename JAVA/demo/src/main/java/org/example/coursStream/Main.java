package org.example.coursStream;

import org.example.exceptions.Cards;

public class Main {
    public static void main(String[] args) {
        Calculatrice calculatrice = new Calculatrice();
        double totalAddition = calculatrice.calcule(10,30,(a,b) -> a + b);
        double totalSoustraction = calculatrice.calcule(10,30, Calculatrice::soustraction);
    }
}
