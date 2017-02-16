package com.joshua.inlineMethod;

/**
 * Created by joshua on 2017/2/16.
 */
public class First {

    private int _numberOfLateDeliveries;

    public First(int _numberOfLateDeliveries) {
        this._numberOfLateDeliveries = _numberOfLateDeliveries;
    }

    public int getRating(){
//        return (moreThanFiveLateDeliveries()) ? 2:1;
        return (_numberOfLateDeliveries > 5) ? 2 :1;
    }

    private boolean moreThanFiveLateDeliveries() {
        return _numberOfLateDeliveries > 5;
    }
}
