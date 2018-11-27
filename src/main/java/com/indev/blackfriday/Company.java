package com.indev.blackfriday;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<StockEntry> entryList = new ArrayList<StockEntry>();
    private int totalassets = 0;

    public float sells(String capsule) throws RuntimeException {
        float totalincomes = 0f;
        StockEntry stockentry = findProductByName(capsule);
        if(stockentry.getQuantity()<5)
            throw new RuntimeException();

        totalincomes = stockentry.calculateIncomes();
        removeStockQuantity(capsule,5);
        totalassets += totalincomes;
        return totalincomes;
    }

    public void stock(int i, String capsule, int i1) {
        StockEntry entries = new StockEntry(i,capsule,i1);
        entryList.add(entries);
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        for(StockEntry p: entryList){
            totalassets+= p.calculatePrice();
        }
        return totalassets;
    }

    public Company blackFriday() {
        return this;
    }

    public StockEntry findProductByName(String entryName){
        StockEntry resultset = null ;
        for (StockEntry stockentry : entryList) {
            if(stockentry.getName().equals(entryName)) resultset = stockentry;
        }
        return resultset;
    }

    public void removeStockQuantity(String name, int numberOfProductSelled){
        findProductByName(name).setQuantity(findProductByName(name).getQuantity()-numberOfProductSelled);
    }
}


