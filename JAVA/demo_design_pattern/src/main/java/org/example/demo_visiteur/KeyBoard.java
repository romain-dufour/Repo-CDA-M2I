package org.example.demo_visiteur;

public class KeyBoard implements PartElement {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
