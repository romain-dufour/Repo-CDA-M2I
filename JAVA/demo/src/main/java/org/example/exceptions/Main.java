package org.example.exceptions;

public class Main {
    public static void main(String[] args) {
//        SimpleExemple.main();

        Cards cards = new Cards();

        cards.trade(1);
        try {
            cards.draw(5);
        }catch (MyException e){
            System.out.println(e.getMessage());
        }


    }
}
