package com.indev.blackfriday;

public  class  Product {

    private String name;
    private int price;
    private float margin = 0.2f;
    private int unitPrice;
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


    public void setMargin(float margin) {
        this.margin = margin;
    }

    public float getMargin() {
        return margin;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
