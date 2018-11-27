package com.indev.blackfriday;

public class Capsule extends Product {

    public String getName() {
       return super.getName();
    }

    public void setName(String name) {
            super.setName(name);
    }

    public int getPrix() {
        return super.getPrice();
    }

    public void setPrice(int price) {
            super.setPrice(price);
    }

    public void setQuantity(int quantity) {
        super.setQuantity(quantity);
    }


    public double getQuantity() {
        return super.getQuantity();
    }
}
