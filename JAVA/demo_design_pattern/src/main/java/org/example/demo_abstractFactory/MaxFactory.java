package org.example.demo_abstractFactory;

public class MaxFactory extends GUIFactory{
    @Override
    Button createButton() {
        return new MacButton();
    }

    @Override
    Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
