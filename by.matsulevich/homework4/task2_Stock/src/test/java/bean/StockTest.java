package bean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockTest {
Stock stock = new Stock("Dod", 1,10,5);

    @Test
    public void updatePrice() {
        int expected = (10);
        int actual = stock.updatePrice(10);
       assertEquals(expected,actual);

    }
}