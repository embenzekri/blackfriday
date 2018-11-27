package com.indev.blackfriday;

public class Product {

    private int stockLevel = 0;
    private String name;
    private int unitPrice = 0;

    public Product(int stockLevel, String name, int unitPrice) {
        this.stockLevel = stockLevel;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int productAssets() {
        return this.stockLevel * this.unitPrice;
    }
}
