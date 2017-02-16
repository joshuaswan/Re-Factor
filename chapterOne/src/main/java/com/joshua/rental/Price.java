package com.joshua.rental;

/**
 * Created by joshua on 2016/7/23.
 */
public abstract class Price {
    abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
