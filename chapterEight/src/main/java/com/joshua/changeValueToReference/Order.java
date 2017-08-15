package com.joshua.changeValueToReference;

/**
 * Created by joshua on 2017/8/15.
 */
public class Order {
    private Customer customer;

    public Order(String customer) {
        this.customer =  Customer.getNamed(customer);
    }

    public String getCustomer() {
        return customer.getName();
    }

}
