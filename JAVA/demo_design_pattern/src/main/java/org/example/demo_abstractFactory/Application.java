package org.example.demo_abstractFactory;

public class Application {
    private Button button;

    private Checkbox checkbox;

    public Application(GUIFactory factory) {

        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

}
