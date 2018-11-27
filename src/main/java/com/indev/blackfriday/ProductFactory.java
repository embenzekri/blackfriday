package com.indev.blackfriday;

public class ProductFactory {

    private Product product ;

    public  Product getInstanceOfProduct(String nameProduct ,int i1)
    {

        if(nameProduct.equals("capsule"))
        {
            product = new Capsule();
            product.setName("capsule");
            product.setPrice(i1);
            product.setUnitPrice(i1);

        }
        else if(nameProduct.equals("machine"))
        {
            product = new Machine();
            product.setName("machine");
            product.setPrice(i1);
            product.setUnitPrice(i1);

        }
        return product;
    }
}
