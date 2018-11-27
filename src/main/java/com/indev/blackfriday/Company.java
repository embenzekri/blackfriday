package com.indev.blackfriday;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Company {

    private List<StockEntry> stockEntries;
    private ProductFactory productFactory= new ProductFactory();
    private int totalAssets =0;
    private boolean isBlackFriday=false;

    public Company(){
       stockEntries = new ArrayList<StockEntry>();
    }


    public float sells(String productName)
    {
        float price=0;
        StockEntry stockEntry = getStockEntry(productName);
        if(stockEntry!=null && stockEntry.getQuantity()>=5&&!isBlackFriday)
        {
               price = stockEntry.priceFor5Sells();
               stockEntry.setQuantity((int) (stockEntry.getQuantity()-5));
               totalAssets+=price;
        }
        else if(stockEntry!=null && stockEntry.getQuantity()>=10&&isBlackFriday)
        {
            price = stockEntry.priceFor5Sells()*2;
            stockEntry.setQuantity((int) (stockEntry.getQuantity()-10));
            totalAssets+=price;
            isBlackFriday = false;
        }
        else
        {
            throw new RuntimeException("not enough products ins stock");
        }
        return price;
    }

    public void stock(int i, String nameProduct, int i1) {

            Product product = productFactory.getInstanceOfProduct(nameProduct,i1);
            StockEntry stockEntry = new StockEntry(product,i);
            stockEntries.add(stockEntry);

    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {

        for(int i=0;i<stockEntries.size();i++)
        {
            totalAssets+=stockEntries.get(i).calculatePrice();

        }
        return totalAssets;
    }

    public Company blackFriday() {
        isBlackFriday =true;
        for(int i=0;i<stockEntries.size();i++)
        {
            Product product = stockEntries.get(i).getProduct();
            product.setMargin(0.1f);
            stockEntries.get(i).setBlackFriday(true);
        }
        return this;
    }


    public StockEntry getStockEntry(String productName)
    {
        for(int i=0;i<stockEntries.size();i++)
            if (stockEntries.get(i).getProduct().getName().equals(productName)) return stockEntries.get(i);
        return null;
    }


}
