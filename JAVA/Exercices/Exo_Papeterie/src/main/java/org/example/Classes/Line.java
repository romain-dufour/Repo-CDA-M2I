package org.example.Classes;

public class Line {
    private Article article;
    private int purchaseQuantity;

    public Line(Article article, int purchaseQuantity) {
        this.article = article;
        this.purchaseQuantity = purchaseQuantity;
    }


public double totalPrice(){
        double totalPrice = article.getUnitPrice() + purchaseQuantity;

        return  totalPrice;
}

    public Article getArticle() {
        return article;
    }

    public int getPurchaseQuantity() {
        return purchaseQuantity;
    }

    @Override
    public String toString() {
        return
                "Line{" +
                 "Quantite = " + purchaseQuantity +
                " - reference de l'article = " + article.getId() +
                " - nom de l'article = " + article.getName() +
                        " - prix unitaire = " + article.getUnitPrice() +
                        " - prix total = " + (totalPrice()) +
                '}';
    }
}
