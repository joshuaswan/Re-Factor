package com.joshua.duplicateObservedData;

import java.util.Observable;

/**
 * Created by joshua on 2017/8/15.
 */
public class Interval extends Observable {
    private String end = "0";

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
        setChanged();
        notifyObservers();
    }
}
