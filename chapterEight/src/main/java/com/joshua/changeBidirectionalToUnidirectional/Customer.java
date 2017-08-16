package com.joshua.changeBidirectionalToUnidirectional;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by joshua on 2017/8/16.
 */
public class Customer {
    private Set orders = new HashSet();

    public Set friendOrders(){
        return orders;
    }

    public void addOrder(Order arg){
        arg.setCustomer(this);
    }
}
