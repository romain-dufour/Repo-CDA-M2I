package org.example.Classes;

public class Batch extends Article{

    private Article article;

    private Integer quantity;
    private float discount;


    public Batch(String id, String referenceArticle, Integer quantity, float discount) {
        super(id);
        this.article = Article.getArticle(referenceArticle);
        this.quantity = quantity;
        this.discount = discount;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "article=" + article +
                ", quantity=" + quantity +
                ", discount=" + discount +
                '}';
    }
}
