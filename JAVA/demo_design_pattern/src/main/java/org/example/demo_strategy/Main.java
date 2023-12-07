package org.example.demo_strategy;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Order order = new Order.OrderBuilder().totalAmount(1000).build();

        String choice;
        do {
            System.out.println("1 -- Card");
            System.out.println("2 -- PayPal");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    order.pay(new CardPaymentStrategy());
                    break;
                case "2":
                    order.pay(new PaypalStrategy());
                    break;
            }
        }while (!choice.equals("0"));
    }
}
