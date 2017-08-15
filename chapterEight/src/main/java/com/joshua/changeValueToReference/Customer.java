package com.joshua.changeValueToReference;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by joshua on 2017/8/15.
 */
public class Customer {
    private final String name;

    private Customer(String name) {
        this.name = name;
    }

    //factory method
    public static Customer getNamed(String name){
        return (Customer) instance.get(name);
    }

    public String getName() {
        return name;
    }

    private static Dictionary instance = new Hashtable();

    static void loadCustomers(){
        new Customer("Lemon Car Hire").store();
        new Customer("Associated Coffee Machines").store();
        new Customer("Bilston Gasworks").store();
    }

    private void store() {
        instance.put(this.getName(),this);
    }
}
