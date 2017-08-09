package com.joshua.splitTemporayVariable;

/**
 * Created by joshua on 2017/8/9.
 */
public class Pudding {

    private double _primaryForce;
    private double _secondaryForce;
    private double _mass;
    private int _delay;

    public double getDistanceTravelled(int time) {
        double result;
        double acc = _primaryForce / _mass;
        int primaryTime = Math.min(time, _delay);
        result = 0.5 * acc * primaryTime * primaryTime;
        int secondaryTime = time - _delay;
        if (secondaryTime > 0) {
            double primaryVel = acc * _delay;
            acc = (_primaryForce + _secondaryForce) / _mass;
            result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
        }
        return result;
    }

    public double reGetDistanceTravelled(int time) {
        double result;
        result = 0.5 * getPrimaryAcc() * getPrimaryTime(time) * getPrimaryTime(time);
        if (getSecondaryTime(time) > 0) {
            result += getPrimaryVel() * getSecondaryTime(time) + 0.5 * getSecondaryAcc() *
                    getSecondaryTime(time) * getSecondaryTime(time);
        }
        return result;
    }

    public double getSecondaryAcc(){
        return (_primaryForce + _secondaryForce) / _mass;
    }

    public double getPrimaryVel(){
        return getPrimaryAcc() * _delay;
    }

    public double getPrimaryAcc(){
        return _primaryForce/_mass;
    }

    public int getPrimaryTime(int time) {
        return Math.min(time, _delay);
    }

    public int getSecondaryTime(int time) {
        return time - _delay;
    }


    public Pudding(double _primaryForce, double _secondaryForce, double _mass, int _delay) {
        this._primaryForce = _primaryForce;
        this._secondaryForce = _secondaryForce;
        this._mass = _mass;
        this._delay = _delay;
    }
}
