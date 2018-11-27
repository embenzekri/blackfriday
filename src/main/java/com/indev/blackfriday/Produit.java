package com.indev.blackfriday;

public class Produit{

    private int quantity;
    private int price;
    private String type;

    public Produit(int quantity, String type, int price) {

        this.quantity=quantity;
        this.price=price;
        this.type=type;

    }

    public int totalAssetsOfProduct() {
        return quantity*price ;
    }
}
