package com.joshua.extractMethod;

/**
 * Created by joshua on 2017/2/16.
 */
public class Order {

    private double basePrice;

    public Double getAmount() {
        return amount;
    }

    public Order() {
    }

    public Order(Double amount) {
        this.amount = amount;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    private Double amount;

    public double basePrice() {
        return basePrice;
    }
}
