package com.joshua.replaceDataValueWithObject;

import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by joshua on 2017/8/15.
 */
public class OrderTest {

    @Test
    public void orderTest(){}

    public int numberOfOrdersFor(Collection orders,Customer customer){
        int result =0;
        Iterator iterator = orders.iterator();
        while (iterator.hasNext()){
            Order each = (Order) iterator.next();
            if (each.getCustomer().equals(customer))
                result++;
        }
        return result;
    }
}