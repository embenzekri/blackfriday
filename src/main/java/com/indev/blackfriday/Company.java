package com.indev.blackfriday;

import java.util.ArrayList;

import java.util.List;

public class Company {

    List<Product>  companyProducts ;
    public Company (){
        if(companyProducts == null)
        companyProducts = new ArrayList<Product>() ;
    }


    public void stock(int price, String capsule, int contity) {
        companyProducts.add(new Product(price,capsule,contity)) ;

    }

    public int totalAssets() {
        int  total = 0 ;
        for (Product oneProduct:companyProducts )
        {
            int price = oneProduct.getPrice() ;
            int contity = oneProduct.getContity() ;
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
