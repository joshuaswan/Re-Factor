package com.joshua.changeUnidirectionalToBidirectional;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by joshua on 2017/8/16.
 */
public class Customers {
    private Set orders = new HashSet();

    public Set friendOrders(){
        return orders;
    }

    public void addOrder(Orders arg){
        arg.addCustomer(this);
    }

    public void removeOrder(Orders arg){
        arg.removeCustomer(this);
    }
}
