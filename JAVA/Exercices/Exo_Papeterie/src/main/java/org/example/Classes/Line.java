package org.example.Classes;

public class Line {
    private UnitArticle article;
    private int purchaseQuantity;

    public Line(UnitArticle article, int purchaseQuantity) {
        this.article = article;
        this.purchaseQuantity = purchaseQuantity;
    }


public double totalPrice(){
        double totalPrice = article.getUnitPrice() * purchaseQuantity;

        return  totalPrice;
}


    public Article getArticle() {
        return article;
    }

    public void setArticle(UnitArticle article) {
        this.article = article;
    }

    public int getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(int purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
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
