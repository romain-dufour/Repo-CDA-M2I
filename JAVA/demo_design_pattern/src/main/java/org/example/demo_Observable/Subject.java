package org.example.demo_Observable;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Observer observer);

    void notifyObservers(Weather weather);
}
