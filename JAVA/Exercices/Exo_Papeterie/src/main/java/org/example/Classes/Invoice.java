package org.example.Classes;

import java.time.LocalDate;
import java.util.HashMap;

public class Invoice {

    private Line[] lines;
    private static int counter = 0;
    private int invoiceNumber;

    private LocalDate purchaseDate;

    private int lineNumber;

    private Customer customer;



    public Invoice(Customer customer) {
        this.lines = new Line[10];
        invoiceNumber = ++counter;
        this.purchaseDate = LocalDate.now();
        this.customer = customer;
    }

    public Invoice(Customer customer,int lineNumber) {
        this.lines = new Line[lineNumber];
        invoiceNumber = ++counter;
        this.purchaseDate = LocalDate.now();
        this.customer = customer;

    }


    public boolean addLine(String articleReference, int quantity){
        Article article = Article.getArticle(articleReference);

        for (int i = 0; i < lines.length; i++){
            if(lines[i] == null){
                lines[i] = new Line(articleReference,quantity);
                break;
            }
        }
        return false;
    };


    public double getTotalPrice(){
        double totalPrice = 0;
        for (Line line: lines
             ) {
            totalPrice += line.totalPrice();
        }
        return totalPrice;
    }

    public void display(){

        System.out.println("Numero de facture = " + invoiceNumber);
        for (Line line: lines
             ) {
            System.out.println(
                    "Article : " + line.getArticle() +
                    " - Quantité : " + line.getPurchaseQuantity()+
                    " - Prix total ligne = " + line.totalPrice() + " €"
            );

        }



    }


    };



