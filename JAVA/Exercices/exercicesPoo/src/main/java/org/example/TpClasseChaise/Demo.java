package org.example.TpClasseChaise;
import org.example.TpClasseChaise.Chaise;

public class Demo {
    public static void main(String[] args) {


        Chaise chaiseBleu = new Chaise(4,"Bleu","bois");
        System.out.println(chaiseBleu);
        Chaise chaiseBlanche = new Chaise(4,"Blanche","métal");
        System.out.println(chaiseBlanche);
        Chaise chaiseTransparente = new Chaise(1,"Transparente","Plexiglass");
        System.out.println(chaiseTransparente);
    }

}
