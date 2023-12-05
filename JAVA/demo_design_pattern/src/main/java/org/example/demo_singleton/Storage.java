package org.example.demo_singleton;

import org.example.demo_builder.Person;

import java.util.List;

public class Storage {
    private static volatile Storage instance = null;

    private List<Person>personList;
    public List<Person> getPersonList(){
        return personList;
    }
    private Storage(){

    }

    public static Storage getInstance(){
        if(instance == null){
            synchronized (Storage.class){
                instance = new Storage();
            }
        }
        return instance;
    }
}
