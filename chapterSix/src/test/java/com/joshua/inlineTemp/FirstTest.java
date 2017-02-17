package com.joshua.inlineTemp;

import com.joshua.extractMethod.Order;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/2/17.
 */
public class FirstTest {
    @Test
    public void isBasePrice() throws Exception {
        Order order = new Order();
        order.setBasePrice(1200);
        First first = new First(order);
        System.out.println("order = 1200 " + first.isBasePrice());
        order.setBasePrice(900);
        System.out.println("order = 900 " + first.isBasePrice());
    }

}