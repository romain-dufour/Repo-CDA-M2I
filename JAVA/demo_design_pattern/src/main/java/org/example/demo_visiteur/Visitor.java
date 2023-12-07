package org.example.demo_visiteur;

public interface Visitor {
    void visit(KeyBoard keyBoard);
    void visit(Monitor monitor);
}
