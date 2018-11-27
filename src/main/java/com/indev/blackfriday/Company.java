package com.indev.blackfriday;

import java.util.List;

public class Company {

    private Product product;

    public float sells(String capsule) {
        return 0;
    }

    public void stock(int i, String capsule, int i1) {
        product = new Product(capsule, i1, i);
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        return product.getPrice()*product.getQunatity();
    }

    public Company blackFriday() {
        return this;
    }
}
