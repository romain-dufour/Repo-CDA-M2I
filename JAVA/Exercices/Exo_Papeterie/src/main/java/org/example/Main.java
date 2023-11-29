package org.example;

import org.example.Classes.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Pen monStylo1 = new Pen("s1","stylo1",4,"bleu");
        Pen monStylo2 = new Pen("s2","stylo2",2.5,"rouge");
        Pen monStylo3 = new Pen("s3","stylo3",1.3,"transparent");

        PaperReam maRamette1 = new PaperReam("r1","ramette1",0.9,1.3);
        PaperReam maRamette2 = new PaperReam("r1","ramette2",2,2.5);
        PaperReam maRamette3 = new PaperReam("r1","ramette3",1,1);

        System.out.println(maRamette1);

        Batch lotstylo = new Batch("l1", monStylo2, 55,10);

        System.out.println();
        System.out.println("Affiche un stylo : ");
        System.out.println(Article.getArticle("s1"));
        System.out.println();
        System.out.println("Affiche un lot : ");
        System.out.println(Article.getArticle("l1"));
        System.out.println();

        Customer client1 = new Customer("Client 1");

        Invoice invoice = new Invoice(client1,2);

        //todo
        // modifier la classe Line pour pouvoir rechercher les articles par la reference
        invoice.addLine(maRamette2,3);
        invoice.addLine(monStylo3,15);

        System.out.println();
        System.out.println("Affiche une facture de 2 lignes : ");
        invoice.display();


    }
}