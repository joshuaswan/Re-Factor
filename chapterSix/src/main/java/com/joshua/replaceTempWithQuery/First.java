package com.joshua.replaceTempWithQuery;

/**
 * Created by joshua on 2017/2/17.
 */
public class First {
    private double _quantity;
    private double _itemPrice;

    public First(double _quantity, double _itemPrice) {
        this._quantity = _quantity;
        this._itemPrice = _itemPrice;
    }

    public double getPrice(){
//        double basePrice = _quantity * _itemPrice;
//        if (basePrice > 1000)
//            return basePrice * 0.95;
//        else
//            return basePrice * 0.98;
        if (basePrice() > 1000)
            return basePrice() * 0.95;
        else
            return basePrice() * 0.98;
    }

    private double basePrice(){
        return _itemPrice * _quantity;
    }
}
