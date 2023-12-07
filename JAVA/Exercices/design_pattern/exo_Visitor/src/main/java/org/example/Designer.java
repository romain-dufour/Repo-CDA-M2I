package org.example;

public class Designer implements  PartElement {

    @Override
    public void accept(EmployeeVisitor visitor){visitor.visit(this);}
}
