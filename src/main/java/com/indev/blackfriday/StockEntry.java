package com.indev.blackfriday;

import java.util.ArrayList;
import java.util.List;

public class StockEntry {
    private String name;
    private int price;
    private int quantity;

    public StockEntry(){}

    public StockEntry(int quantity, String name, int price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
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

    public int calculatePrice(){
        return price*quantity ;
    }
    public float calculateIncomes(){
        float incomes = 0f;
        incomes = (float) ((5*getPrice()) + (5*getPrice())*0.2);
        return incomes;
    }

}
