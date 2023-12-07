package org.example;

public interface EmployeeVisitor {

void visit(Designer designer);
void visit(Developer developer);
void visit(Manager manager);
}
