package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        NavigationSystem navigationSystem = new NavigationSystem.NavigationSystemBuilder().destination("en balade").build();

        String choice;
        do {
            System.out.println("1 -- Road");
            System.out.println("2 -- Offroad");
            System.out.println("3 -- Economic");

            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    navigationSystem.navigate(new RoadStrategy());
                    break;
                case "2":
                    navigationSystem.navigate(new OffroadStrategy());
                    break;
                case "3":
                    navigationSystem.navigate(new EconomicStrategy());
                    break;
            }
        }while (!choice.equals("0"));
    }

}
