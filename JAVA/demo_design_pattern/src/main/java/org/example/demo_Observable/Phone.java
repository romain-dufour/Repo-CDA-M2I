package org.example.demo_Observable;

public class Phone implements Observer {
    @Override
    public void update(Weather weather) {
        System.out.println("Phone with weather information "+weather.getTemperature());
    }
}
