package com.indev.blackfriday;

import java.util.LinkedList;
import java.util.List;

public class Company {

    private List<Produit> stock;

    public Company() {
        stock=new LinkedList<Produit>();
    }

    public float sells(String capsule) {
        return 0;
    }

    public void stock(int quantity, String type, int price) {

        stock.add(new Produit(quantity, type, price));


    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {

        int total=0;

        for (Produit stock: this.stock) {
            total+=stock.totalAssetsOfProduct();
        }

        return total;
    }

    public Company blackFriday() {
        return this;
    }
}
