package com.indev.blackfriday;

import java.util.ArrayList;

import java.util.List;

public class Company {

    List<Stock>  companyProducts ;
    public Company (){
        if(companyProducts == null)
        companyProducts = new ArrayList<Stock>() ;
    }


    public void stock(int price, String name, int Quantity) {
        Product p = new Product(price, name) ;
        companyProducts.add(new Stock(p ,Quantity)) ;

    }

    public int totalAssets() {
        int  total = 0 ;
        for (Stock oneProduct:companyProducts )
        {
            int price = oneProduct.getProduct().getPrice() ;
            int contity = oneProduct.getQuantity() ;
          total+= price * contity ;
          System.out.println(total);
        }
        return total;
    }





    public float sells(String capsule) {
        return 0;

    }


    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }



    public Company blackFriday() {
        return this;

    }
}
