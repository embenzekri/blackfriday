package com.indev.blackfriday;

public class Product {

    private String name;
    private int price;
    private int quantity;
    private int maringOfSale;
    private int saleQuantity;


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

    public int getMaringOfSale() {
        return maringOfSale;
    }

    public void setMaringOfSale(int maringOfSale) {
        this.maringOfSale = maringOfSale;
    }

    public int getSaleQuantity() {
        return saleQuantity;
    }

    public void setSaleQuantity(int saleQuantity) {
        this.saleQuantity = saleQuantity;
    }
}
