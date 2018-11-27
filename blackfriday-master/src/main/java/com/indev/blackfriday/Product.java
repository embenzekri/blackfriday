package com.indev.blackfriday;

public class Product {
    private String name;
    private int price;
    private int quantete;

    public Product(int quantete , String name , int price ) {
        this.name = name;
        this.price = price;
        this.quantete = quantete;
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

    public int getQuantete() {
        return quantete;
    }

    public void setQuantete(int quantete) {
        this.quantete = quantete;
    }
}
