package com.indev.blackfriday;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Product> pList = new ArrayList<Product>();

    public float sells(String capsule) {
        return 0;
    }

    public void stock(int i, String capsule, int i1) {
        Product p = new Product(i,capsule,i1);
        pList.add(p);
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        int totalA=0;
        for(Product p: pList){
            totalA+= p.getPrice() * p.getQuantity();
        }
        return totalA;
    }

    public Company blackFriday() {
        return this;
    }
}
