package com.joshua.extractMethod;

import java.util.Enumeration;

/**
 * Created by joshua on 2017/2/16.
 */
public class Second {
    private Orders _orders;
    private String name;

    public Second(Orders _orders, String name) {
        this._orders = _orders;
        this.name = name;
    }

    public void printOwing(double previousAmount){
//        Enumeration enumeration = _orders.elements();
//        double outstanding = 0.0;
        double outstanding = getOutstanding(previousAmount * 1.2);

        //print banner
//        System.out.println("***********************************");
//        System.out.println("********** Customer Owes **********");
//        System.out.println("***********************************");
        printBanner();

        //calculate outstanding
//        while (enumeration.hasMoreElements()){
//            Order each = (Order) enumeration.nextElement();
//            outstanding += each.getAmount();
//        }

        //print details
//        System.out.println("name: " + name);
//        System.out.println("amount: " + outstanding);
        printDetails(outstanding);
    }

    //no temp
    private void printBanner(){
        System.out.println("***********************************");
        System.out.println("********** Customer Owes **********");
        System.out.println("***********************************");
    }

    //with temp
    private void printDetails(Double outstanding){
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    //对局部变量再赋值
    private double getOutstanding(double initialValue){
        Enumeration enumeration = _orders.elements();
        double result = initialValue;

        while (enumeration.hasMoreElements()){
            Order each = (Order) enumeration.nextElement();
            result += each.getAmount();
        }
        return result;
    }
}
