package org.example.demo_abstractFactory;

public class WinFactory extends GUIFactory{

    @Override
    Button createButton() {
        return new WinButton();
    }

    @Override
    Checkbox createCheckbox() {
        return new  WinCheckbox();
    }
}
