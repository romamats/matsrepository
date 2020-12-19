package service;

import bean.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductDemoTest {
    ProductDemo productDemo;
    Product product;
    @Before
    public void setUp(){
        product = new Product();
        productDemo = new ProductDemo();
    }
    @Test
    public void actualPrice() {
        double expected = 240.0;
        double actual = productDemo.actualPrice();
        assertEquals(expected, actual, 0.0);


    }
}