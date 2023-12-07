package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // mauvaise comprehension de l'utilisation du pattern

        NavigationSystem navigationSystem = new NavigationSystem(new RoadStrategy());
        navigationSystem.navigate("Tourcoing");
        navigationSystem.setNavigationStrategy(new OffroadStrategy());
        navigationSystem.navigate("Tourcoing");
        navigationSystem.setNavigationStrategy(new EconomicStrategy());
        navigationSystem.navigate("Tourcoing");

//        String choice;
//        do {
//            System.out.println("1 -- Road");
//            System.out.println("2 -- Offroad");
//            System.out.println("3 -- Economic");
//
//            choice = scanner.nextLine();
//            switch (choice) {
//                case "1":
//                    navigationSystem.navigate(new RoadStrategy());
//                    break;
//                case "2":
//                    navigationSystem.navigate(new OffroadStrategy());
//                    break;
//                case "3":
//                    navigationSystem.navigate(new EconomicStrategy());
//                    break;
//            }
//        }while (!choice.equals("0"));
   }

}
