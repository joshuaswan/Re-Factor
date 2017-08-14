package com.joshua.moveField;

/**
 * Created by joshua on 2017/8/14.
 */
public class Account {

    private AccountType type;

    public Account(AccountType type) {
        this.type = type;
    }

    public double interestForAmount_days(double amount, int days){
        return type.getInterestRage() * amount * days /365;
    }
}
