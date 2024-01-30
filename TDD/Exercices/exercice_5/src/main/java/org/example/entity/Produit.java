package org.example.entity;

public class Produit {
    private int quality;
    private int sellIn;
    private String name;

    private int coeffOfDecrease;

    public int getQuality() {
        return quality;
    }


    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }



    public int update(int sellIn, int quality,int coeffOfDecrease,String name){
        int updateQuality = quality;
        if (name == "brie vieilli"){
            updateQuality = quality + coeffOfDecrease;
        }
        else if(quality == 0){
            updateQuality = 0;
        }
        else if(sellIn == 0){
         updateQuality = quality - coeffOfDecrease * 2;
        } else {
            updateQuality = quality - coeffOfDecrease;
        }
    return updateQuality;
    }
}
