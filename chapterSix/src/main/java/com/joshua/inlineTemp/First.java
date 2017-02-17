package com.joshua.inlineTemp;

import com.joshua.extractMethod.Order;

/**
 * Created by joshua on 2017/2/16.
 */
public class First {

    Order anOrder;

    public First(Order anOrder) {
        this.anOrder = anOrder;
    }

    public boolean isBasePrice(){
        double basePrice = anOrder.basePrice();
        return basePrice > 1000;
    }
}
