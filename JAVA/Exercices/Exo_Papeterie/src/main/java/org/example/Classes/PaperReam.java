package org.example.Classes;

public class PaperReam extends UnitArticle{

    private double weight;

    public PaperReam(String id, String name, double unitPrice, double weight) {
        super(id, name, unitPrice);
        this.weight = weight;
    }

    //    public PaperReam(String id, String name, double unitPrice, double weight) {
//        super(id, name, unitPrice);
//        this.weight = weight;
//    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString();

    }
}
