package com.indev.blackfriday;
import java.util.List ;
import java.util.ArrayList;

public class Company {
    List<StockEntry> stockEntries = new ArrayList<StockEntry>();
    private int totalassets = 0;
    private int productBySell = 5;
    private float margin = (float) 0.2;
    private boolean isInBlackFriday = false;

    public float sells(String capsule) throws stockException{
        float salePrice =0 ;
        StockEntry stockEntry = getStockEntryByname(capsule);
        checkIfStillInStock(stockEntry);
        if (stockEntry!= null)  salePrice = getPricePerSell(stockEntry);
        deleteFromStok(capsule,productBySell);
        totalassets+=salePrice;
        return salePrice;
    }

    public void stock(int quantete, String capsule, int price) {
        stockEntries.add(new StockEntry(quantete,capsule,price));
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        for (StockEntry stoxkEntry:stockEntries){
            totalassets+=stoxkEntry.computePrice();
        }
        return totalassets;
    }

    public Company blackFriday() {
        if (!isInBlackFriday) {
            setMargin((float) 0.1);
            setProductBySell(getProductBySell() * 2);
            isInBlackFriday = true;
        }
        return this;
    }

    public StockEntry getStockEntryByname(String name){
        for (StockEntry stockEntry:stockEntries){
            if (stockEntry.getName().equals(name)) return stockEntry;
        }
        return null;
    }

    public void deleteFromStok(String name , int number){
        getStockEntryByname(name).setQuantity(getStockEntryByname(name).getQuantity()-number);
    }
    public void checkIfStillInStock(StockEntry stockEntry){
        if( stockEntry.getQuantity()< productBySell ) throw new stockException("out of stok" );
    }

    public float getPricePerSell(StockEntry stockEntry){
        int saleprice = stockEntry.getPrice()* productBySell;
        return (float) (saleprice + saleprice * margin);
    }


    public int getProductBySell() {
        return productBySell;
    }

    public void setProductBySell(int productBySell) {
        this.productBySell = productBySell;
    }

    public float getMargin() {
        return margin;
    }

    public void setMargin(float margin) {
        this.margin = margin;
    }
}
