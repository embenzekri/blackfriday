package com.indev.blackfriday;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Product> productList = new ArrayList<Product>();

    public int sells(String capsule) {
        int sum = 0;
        int total = 0;
        for(int i = 0; i<productList.size(); i++) {
            Product product = productList.get(i);
            if(product.getName().equals(capsule)){
                product.setMaringOfSale(20);
                total =product.getPrice() * 5;
                sum =  total + (total*product.getMaringOfSale())/100 ;
                product.setQuantity(product.getQuantity()-5);
                product.setSaleQuantity(5);
                break;
            }
        }
        return sum;
    }

    public void stock(int i, String capsule, int i1) {
        Product product = new Product();
        product.setName(capsule);
        product.setPrice(i1);
        product.setQuantity(i);
        productList.add(product);
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        int totalSale = 0;
        int totalNoSale = 0;
        int sum;
        for(int i = 0; i<productList.size(); i++){
            Product product = productList.get(i);
            totalNoSale += product.getPrice() * product.getQuantity();
            totalSale+= product.getPrice()*product.getSaleQuantity() + product.getPrice()*product.getSaleQuantity()*product.getMaringOfSale()/100;
        }
        return totalSale+totalNoSale;
    }

    public Company blackFriday() {
        return this;
    }
}
