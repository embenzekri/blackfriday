package com.indev.blackfriday;

import java.util.LinkedList;
import java.util.List;

public class Company {

    List<Product> products = new LinkedList<Product>();
    public float sells(String capsule) {
        return 0;
    }

    public void stock(int i, String capsule, int i1) {
        Product product = new Product(i, capsule, i1);
        products.add(product);

    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        int total = 0;
        for(Product product : products){
            total = total + product.productAssets();
        }
        return total;
    }

    public Company blackFriday() {
        return this;
    }
}
