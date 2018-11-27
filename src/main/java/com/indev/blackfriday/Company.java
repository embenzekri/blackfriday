package com.indev.blackfriday;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Product> products = new ArrayList<Product>();

    public float sells(String capsule) {
        return 0;
    }

    public void stock(int i, String capsule, int i1) {
        Product product = new Product(capsule, i1, i);
        products.add(product);
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        int totalAssets = 0;
        for (Product product: products
             ) {
            totalAssets += product.getPrice()*product.getQunatity();
        }
        return totalAssets;
    }

    public Company blackFriday() {
        return this;
    }
}
