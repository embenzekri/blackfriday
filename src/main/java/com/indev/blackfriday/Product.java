package com.indev.blackfriday;

public  class  Product {

    private String name;
    private int price;
    private int quantity;
    private float margin = 0.2f;

    public  String getName(){
        return name;
    };

    public  void setName(String name){
        this.name = name;
    };

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setMargin(float margin) {
        this.margin = margin;
    }

    public float getMargin() {
        return margin;
    }
}
