package com.joshua.introduceExplainingVariable;

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
    public double price(){
        //price is base price - quantity discount + shipping
//        return _quantity * _itemPrice -
//                Math.max(0,_quantity -500) * _itemPrice * 0.05 +
//                Math.min(_quantity * _itemPrice * 0.1, 100.0);

//        final double basePrice = _quantity * _itemPrice;
//        return basePrice - Math.max(0,_quantity - 500) * _itemPrice * 0.05 +
//                Math.min(basePrice * 0.1, 100.0);

//        final double basePrice = _quantity * _itemPrice;
//        final double quantityDiscount = Math.max(0,_quantity - 500) * _itemPrice * 0.05;
//        return basePrice - quantityDiscount + Math.min(basePrice * 0.1,100.0);

//        final double basePrice = _quantity * _itemPrice;
//        final double quantityDiscount = Math.max(0,_quantity - 500) * _itemPrice * 0.05;
//        final double shipping = Math.min(basePrice *0.1,100);
//        return basePrice - quantityDiscount + shipping;

//        return basePrice() - Math.max(0,_quantity - 500) * _itemPrice * 0.05 +
//                Math.min(basePrice() * 0.1, 100.0);

//        return basePrice() - quantityDiscount() + Math.min(basePrice() * 0.1 ,100.0);

        return basePrice() - quantityDiscount() + shipping();
    }

    private double basePrice(){
        return _quantity * _itemPrice;
    }

    private double quantityDiscount(){
        return Math.max(0,_quantity - 500) * _itemPrice * 0.05;
    }

    private double shipping(){
        return Math.min(basePrice() * 0.1 ,100.0);
    }
}
