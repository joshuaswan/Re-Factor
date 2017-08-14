package com.joshua.selfEncapsulateField;

/**
 * Created by joshua on 2017/8/14.
 */
public class CappedRange extends IntRange{

    private int cap;

    public CappedRange(int low, int high,int cap) {
        super(low, high);
        this.cap = cap;
    }

    public int getCap() {
        return cap;
    }

    public int getHigh(){
        return Math.min(super.getHigh(),getCap());
    }
}
