package org.example;

public class SalaryAdjuster implements EmployeeVisitor{

    Integer salaire;

    public SalaryAdjuster(Integer salaire) {
        this.salaire = salaire;
    }

    @Override
    public void visit(Designer designer) {
        System.out.println("Salaire augmenté a " + salaire +" €" );

    }

    @Override
    public void visit(Developer developer) {
        System.out.println("Salaire doublé ");

    }

    @Override
    public void visit(Manager manager) {
        System.out.println("Salaire diminué a " + salaire + " €");

    }
}
