package com.indev.blackfriday;

public class Product {
    private int price ;
    private String capsule ;
    private int contity ;

    public Product(int price, String capsule, int contity) {
        this.price = price;
        this.capsule = capsule;
        this.contity = contity ;
    }



    public void setPrice(int price) {
        this.price = price;
    }

    public void setContity(int contity) {
        this.contity = contity;
    }

    public void setCapsule(String capsule) {
        this.capsule = capsule;
    }



    public int getPrice() {
        return price;
    }
    public int getContity() {
        return contity;
    }

    public String getCapsule() {
        return capsule;
    }
}
