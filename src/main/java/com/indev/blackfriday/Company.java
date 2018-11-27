package com.indev.blackfriday;

import java.util.ArrayList;
import java.util.Collection;

public class Company {
    public float sells(String capsule) {
        return 0;
    }

    private Collection<Product> products ;

    public void stock(int i, String capsule, int i1) {

        products.add(new Product(i , i1 , capsule));
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {

       return  turnover() ;
    }

    public Company blackFriday() {
        return this;
    }

    public Company() {
        this.products =new ArrayList<Product>();
    }

    private int turnover()
    {
        int turnover = 0 ;
        for(Product product: products)
            turnover += product.getPrice() * product.getQuantity();
        return turnover ;

    }
}
