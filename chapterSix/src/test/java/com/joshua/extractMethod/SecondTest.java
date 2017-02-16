package com.joshua.extractMethod;

import org.junit.Test;

/**
 * Created by joshua on 2017/2/16.
 */
public class SecondTest {
    @Test
    public void printOwing() throws Exception {
        Order order1 = new Order(12.0);
        Order order2 = new Order(12.0);
        Order order3 = new Order(12.0);
        Order order4 = new Order(12.0);

        Order[] amount = {order1,order2,order3,order4};
        Orders orders = new Orders(0,4,amount);
        Second second = new Second(orders,"Joshua");
        second.printOwing(10);
    }

}