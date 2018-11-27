package com.indev.blackfriday;

public class Sale {

    private int quantity = 5;
    private int price = 2;
    private Float profitPercentage = 0.20F;

    public Sale(int quantity, int price, Float profitPercentage) {
        this.quantity = quantity;
        this.price = price;
        this.profitPercentage = profitPercentage;
    }

    public Float sell() {
        Float sell = 0.0F;
        sell = Float.valueOf(quantity * price);
        sell = sell + sell * profitPercentage;
        return sell;
    }
}
