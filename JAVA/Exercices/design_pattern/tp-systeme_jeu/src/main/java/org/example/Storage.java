package org.example;

import java.util.List;

public class Storage {
    private static volatile Storage instance = null;

    private List<Royaume> listeRoyaume;
    public List<Royaume> getListeRoyaume(){return listeRoyaume;}
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
