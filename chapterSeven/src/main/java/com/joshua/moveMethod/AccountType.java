package com.joshua.moveMethod;

/**
 * Created by joshua on 2017/8/14.
 */
public class AccountType {
    public boolean isPremium() {
        return false;
    }

    public double overdraftCharge(int dayOverdrawn){
        if (isPremium()){
            double result = 10;
            if (dayOverdrawn > 7)
                result += (dayOverdrawn -7)*0.85;
            return result;
        }
        else
            return dayOverdrawn*1.75;
    }
}
