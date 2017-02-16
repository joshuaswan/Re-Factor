package com.joshua.extractMethod;

import java.util.Enumeration;

/**
 * Created by joshua on 2017/2/16.
 */
public class Orders implements Enumeration {
    int count;
    int length;
    Order[] dataArray;

    public Orders(int count, int length, Order[] dataArray) {
        this.count = count;
        this.length = length;
        this.dataArray = dataArray;
    }

    @Override
    public boolean hasMoreElements() {
        return count<length;
    }

    @Override
    public java.lang.Object nextElement() {
        return dataArray[count++];
    }

    public Enumeration elements() {
        return new Orders(0,dataArray.length,dataArray);
    }

    public Order getAmount() {
        return dataArray[count];
    }
}
