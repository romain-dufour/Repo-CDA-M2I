package org.example.Compositions;

import org.example.proxy.Instruments;

import java.util.ArrayList;
import java.util.List;

public class Composition{
    private String titre;
    private String compositeur;
    private List<Instruments> instruments ;

private Composition(Builder builder){
    titre = builder.titre;
    compositeur = builder.compositeur;
    instruments = builder.instruments;
}

    @Override
    public String toString() {
        return "Composition{" +
                "titre='" + titre + '\'' +
                ", compositeur='" + compositeur + '\'' +
                ", instruments=" + instruments +
                '}';
    }

    public static class Builder{
        private String titre;
        private String compositeur;
        private List<Instruments> instruments =new ArrayList<>();

        public Builder titre(String titre){
            this.titre = titre;
            return this;
        }
        public Builder compositeur(String compositeur){
            this.compositeur=compositeur;
            return this;
        }

        public Builder instruments(Instruments instrument){
            this.instruments.add(instrument);
            return this;
        }
        public Composition build(){return new Composition(this);}

    }




}
