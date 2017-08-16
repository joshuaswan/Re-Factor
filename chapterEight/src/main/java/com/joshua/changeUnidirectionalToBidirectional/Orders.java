package com.joshua.changeUnidirectionalToBidirectional;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by joshua on 2017/8/16.
 */
public class Orders {

    private Set customers = new HashSet();

    public void addCustomer(Customers arg){
        arg.friendOrders().add(this);
        customers.add(arg);
    }

    public void removeCustomer(Customers arg){
        arg.friendOrders().remove(this);
        customers.remove(arg);
    }
}
