package org.example;

public class SalaryAdjuster implements EmployeeVisitor{

    Integer salaire;

    public SalaryAdjuster(Integer salaire) {
        this.salaire = salaire;
    }

    @Override
    public void visit(Designer designer) {
        designer.getSalaire();
        salaire = 4000;
        designer.setSalaire(salaire);
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
