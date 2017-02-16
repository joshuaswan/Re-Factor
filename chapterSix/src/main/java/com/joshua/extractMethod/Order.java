package com.joshua.extractMethod;

/**
 * Created by joshua on 2017/2/16.
 */
public class Order {

    public Double getAmount() {
        return amount;
    }

    public Order(Double amount) {
        this.amount = amount;
    }

    private Double amount;
}
