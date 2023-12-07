package org.example;

import lombok.Data;

@Data
public class Designer implements  PartElement {

    private int salaire;
    private String nom;

    @Override
    public void accept(EmployeeVisitor visitor){visitor.visit(this);}
}
