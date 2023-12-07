package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Product implements Subject{

    private int stockLevel;

    private List<Observer>observers = new ArrayList<>();

    public Product(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public void stockLevelModification(int stockLevel){
        setStockLevel(getStockLevel()-stockLevel);
        notifyObservers(getStockLevel());
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int stock) {
        observers.forEach(o -> {
            o.update(stockLevel);
        });
    }


//    void notifyObservers() {
//        for (Observer observer : observers) {
//            observer.update(this);
//        }
//    }



}
