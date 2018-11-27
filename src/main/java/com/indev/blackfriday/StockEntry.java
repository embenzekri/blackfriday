package com.indev.blackfriday;

public class StockEntry {
    Product product;
    int quantity;
    private boolean isBlackFriday=false;


    public StockEntry(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public int calculatePrice()
    {
        return product.getUnitPrice()*quantity;
    }

    public float priceFor5Sells()
    {
        return this.getProduct().getPrice()*5*(1+product.getMargin());

    }

    public boolean isBlackFriday() {
        return isBlackFriday;
    }

    public void setBlackFriday(boolean blackFriday) {
        isBlackFriday = blackFriday;
    }

    public float sellsPrice()
    {
        if(!isBlackFriday && quantity>=5) {

            this.setQuantity(this.getQuantity()-5);
            return this.getProduct().getPrice()*5*(1+product.getMargin());
        }
        if (isBlackFriday && quantity>=10) {
            this.setQuantity(this.getQuantity()-10);
            isBlackFriday = false;
            return this.getProduct().getPrice()*10*(1+product.getMargin());

        }
         return -1;
    }


}
