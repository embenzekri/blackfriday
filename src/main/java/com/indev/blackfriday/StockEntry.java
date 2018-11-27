package com.indev.blackfriday;

public class StockEntry {
    private String name;
    private int price;
    private int quantity;

    public StockEntry(int quantete , String name , int price ) {
        this.name = name;
        this.price = price;
        this.quantity = quantete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int computePrice() {
        return price*quantity;
    }
}
