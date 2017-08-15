package com.joshua.replaceDataValueWithObject;

/**
 * Created by joshua on 2017/8/15.
 */
public class Order {
    private Customer customer;

    public Order(String customer) {
        this.customer = new Customer(customer);
    }

    public String getCustomer() {
        return customer.getName();
    }

    public void setCustomer(String customer) {
        this.customer = new Customer(customer);
    }
}
