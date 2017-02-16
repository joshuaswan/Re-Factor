package com.joshua.extractMethod;

/**
 * Created by joshua on 2017/2/16.
 */
public class First {

    private String name;

    public First(String name) {
        this.name = name;
    }

    public void printOwing(double amount){
        printBanner();
        //print details
//        System.out.println("name: " + name);
//        System.out.println("amount: " + amount);
        printDetails(amount);
    }

    private void printDetails(double amount) {
        System.out.println("name: " + name);
        System.out.println("amount: " + amount);
    }

    private void printBanner() {

    }
}
