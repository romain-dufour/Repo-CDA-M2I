package org.example.Classes;

public abstract class UnitArticle extends Article{

    private String name;
    private double unitPrice;

    public UnitArticle(String id, String name, double unitPrice) {
        super(id);
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return


                "Article : " + name +
                        " - Prix unitaire : " + unitPrice

                ;
    }
}
