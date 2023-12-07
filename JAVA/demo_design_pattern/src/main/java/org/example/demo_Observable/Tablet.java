package org.example.demo_Observable;

public class Tablet implements Observer {
    @Override
    public void update(Weather weather) {
        System.out.println("Tablet with weather information "+weather.getTemperature());
    }
}
