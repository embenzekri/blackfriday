package com.indev.blackfriday;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Product> products;
    private ProductFactory productFactory= new ProductFactory();

    public Company(){

        products = new ArrayList<Product>();
    }


    public float sells(String productName)
    {
        float price=0;
        Product product = getProduct(productName);
        if(product.getQuantity()>=5)
        {
            price = product.getPrice()*5+(product.getPrice()*5*product.getMargin());
            product.setQuantity((int) (product.getQuantity()-5));
        }
        return 0;
    }

    public void stock(int i, String nameProduct, int i1) {

            Product product = productFactory.getInstanceOfProduct(i,nameProduct,i1);
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
        for(int i=0;i<products.size();i++)
        {
            totalAssets+=products.get(i).getPrice()*products.get(i).getQuantity();

        }
        return totalAssets;
    }

    public Company blackFriday() {
        return this;
    }


    public Product getProduct(String productName)
    {
        for(int i=0;i<products.size();i++)
            if (products.get(i).getName().equals(productName)) return products.get(i);
        return null;
    }
}
