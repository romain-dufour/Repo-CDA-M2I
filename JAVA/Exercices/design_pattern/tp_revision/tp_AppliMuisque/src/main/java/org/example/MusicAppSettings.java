package org.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


public class MusicAppSettings {

    @Getter
    private int volume;
    @Getter
    private int basseLevel;

    private static volatile MusicAppSettings instance = null;
    private static final Object lock = new Object();

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume réglé sur : " + volume);
    }

    public void setBasseLevel(int basseLevel) {
        this.basseLevel = basseLevel;
        System.out.println("Niveau de basse réglé sur : " + basseLevel);
    }
    public static MusicAppSettings getInstance(){
        if(instance==null){
            synchronized (lock){
                instance=new MusicAppSettings();
            }
        }
        return instance;
    }

}
