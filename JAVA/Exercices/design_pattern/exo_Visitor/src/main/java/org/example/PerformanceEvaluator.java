package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class PerformanceEvaluator implements EmployeeVisitor{
    String discours;
    String evaluation ;

    public PerformanceEvaluator(String discours) {
        this.discours = discours;
    }

    public PerformanceEvaluator(String discours, String evaluation) {
        this.discours = discours;
        this.evaluation = evaluation;
    }

    @Override
    public void visit(Designer designer) {
        System.out.println(discours +" "+evaluation);

    }

    @Override
    public void visit(Developer developer) {
        System.out.println(discours +" "+evaluation);

        System.out.println("Excellentes performances !! bravo <3 ");

    }

    @Override
    public void visit(Manager manager) {
        System.out.println(discours +" "+evaluation);

    }
}
