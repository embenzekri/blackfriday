package com.indev.blackfriday;

public class Stock {
    private Product product;
    private int Quantity ;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public Stock(Product p, int quantity) {
        this.product = p;
        Quantity = quantity;
    }
}
