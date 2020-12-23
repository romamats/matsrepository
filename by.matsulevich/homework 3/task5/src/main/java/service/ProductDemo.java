package service;

import bean.Product;

public class ProductDemo {
    Product product = new Product();

    public double actualPrice(){
        product.setRegularPrice(300);
        product.setDiscount(20);
        return -product.getDiscount()/100* product.getRegularPrice()+ product.getRegularPrice();

            }

}
