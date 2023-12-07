package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Designer designer = new Designer();
        Developer developer = new Developer();
        Manager manager = new Manager();

        designer.accept(new PerformanceEvaluator("Votre performance est en baisse","you're fired"));
        designer.accept(new SalaryAdjuster(1500));

        developer.accept(new PerformanceEvaluator("excellente performance, vous etes notre meilleur élément"));
        developer.accept(new SalaryAdjuster(4000));

        manager.accept(new PerformanceEvaluator("Arretez de glander mon vieux","evaluation négative"));
        manager.accept(new SalaryAdjuster(1900));

    }
}