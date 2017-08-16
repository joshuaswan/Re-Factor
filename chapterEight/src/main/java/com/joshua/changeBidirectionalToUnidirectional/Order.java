package com.joshua.changeBidirectionalToUnidirectional;

/**
 * Created by joshua on 2017/8/16.
 */
public class Order {

    public Order(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer arg) {
        if (customer != null)
            customer.friendOrders().remove(this);
        this.customer = arg;
        if (customer != null) {
            customer.friendOrders().add(this);
        }
    }

    private Customer customer;
}
