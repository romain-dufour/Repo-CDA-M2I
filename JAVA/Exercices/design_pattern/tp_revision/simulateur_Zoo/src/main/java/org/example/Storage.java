package org.example;

import org.example.entity.Animal;

import java.util.ArrayList;
import java.util.List;


public class Storage {

    private static volatile Storage instance = null;
    private static final Object lock = new Object();
    private List<Animal> animalList;
    public List<Animal> getAnimalList(){return animalList;}

    private Storage(){ animalList = new ArrayList<>();}

    public static Storage getInstance(){
        if(instance==null){
            synchronized (lock){
                instance=new Storage();
            }
        }
        return instance;
    }

}
