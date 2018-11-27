package com.indev.blackfriday;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Product> products;

    public Company(){

        products = new ArrayList<Product>();
    }


    public float sells(String capsule) {
        return 0;
    }

    public void stock(int i, String nameProduct, int i1) {
        Product product ;
        if(nameProduct.equals("capsule"))
        {
            product = new Capsule();
            product.setName("capsule");
            product.setQuantity(i);
            product.setPrice(i1);

            products.add(product);
        }
        if(nameProduct.equals("machine"))
        {
            product = new Machine();
            product.setName("machine");
            product.setQuantity(i);
            product.setPrice(i1);
            products.add(product);
        }
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        int totalAssets = 0;
        for(int i=0;i<products.size();i++)
        {
            totalAssets+=products.get(i).getPrice()*products.get(i).getQuantity();

        }
        return totalAssets;
    }

    public Company blackFriday() {
        return this;
    }
}
