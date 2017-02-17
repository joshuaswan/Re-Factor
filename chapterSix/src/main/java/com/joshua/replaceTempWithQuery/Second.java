package com.joshua.replaceTempWithQuery;

/**
 * Created by joshua on 2017/2/17.
 */
public class Second {

    private double _quantity;
    private double _itemPrice;

    public Second(double _quantity, double _itemPrice) {
        this._quantity = _quantity;
        this._itemPrice = _itemPrice;
    }


    public double getPrice(){
//        final double basePrice = basePrice();
//        final double discountFactor;
//        if (basePrice() > 1000)
//            discountFactor = 0.95;
//        else
//            discountFactor = 0.98;
        return basePrice() * discountFactor();
    }

    private double discountFactor(){
        if (basePrice() > 1000)
            return 0.95;
        else
            return 0.98;
    }

    private double basePrice(){
        return _quantity * _itemPrice;
    }

    public double getPrice1(){
        double basePrice = _quantity * _itemPrice;
        double discountFactor;
        if (basePrice > 1000)
            discountFactor = 0.95;
        else
            discountFactor = 0.98;
        return basePrice * discountFactor;
    }
}
