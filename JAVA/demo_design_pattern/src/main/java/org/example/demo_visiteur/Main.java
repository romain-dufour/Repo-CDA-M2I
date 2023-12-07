package org.example.demo_visiteur;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        monitor.accept(new UpdateVisitor());
    }
}
