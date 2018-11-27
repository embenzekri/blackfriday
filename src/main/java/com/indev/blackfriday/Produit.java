package com.indev.blackfriday;

public abstract class Produit{

    private int quantity;
    private int price;


    public Produit(int quantity, int price) {

        this.quantity=quantity;
        this.price=price;

    }

    public int totalAssetsOfProduct() {
        return quantity*price ;
    }
}
