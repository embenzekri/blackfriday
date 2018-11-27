package com.indev.blackfriday;

public class Product {

    private String productName;
    private int price;
    private int qunatity;

    public Product(String productName, int price, int qunatity) {
        this.productName = productName;
        this.price = price;
        this.qunatity = qunatity;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQunatity() {
        return qunatity;
    }

    public void setQunatity(int qunatity) {
        this.qunatity = qunatity;
    }
}
