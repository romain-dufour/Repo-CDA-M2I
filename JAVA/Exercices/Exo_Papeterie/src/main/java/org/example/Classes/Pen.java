package org.example.Classes;

public class Pen extends UnitArticle{

    private String color;

    public Pen(String id, String name, double unitPrice, String color) {
        super(id, name, unitPrice);
        this.color = color;
    }
//    public Pen(id,String name, double unitPrice, String color) {
//        super(id, name, unitPrice);
//        this.color = color;
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                super.toString();
    }
}
