package com.indev.blackfriday;
import java.util.List ;
import java.util.ArrayList;

public class Company {
    List<Product> products = new ArrayList<Product>();

    public float sells(String capsule) {
        return 0;
    }

    public void stock(int quantete, String capsule, int price) {
        products.add(new Product(quantete,capsule,price));
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        int total =0;
        for (Product product:products){
            total+=product.getPrice()*product.getQuantete();
        }
        return total;
    }

    public Company blackFriday() {
        return this;
    }
}
