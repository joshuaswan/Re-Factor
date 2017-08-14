package com.joshua.moveMethod;

/**
 * Created by joshua on 2017/8/14.
 */
public class Account {
    private AccountType _type;
    private int _daysOverdrawn;

//    public double overdraftCharte(){
//        if (_type.isPremium()){
//            double result = 10;
//            if (_daysOverdrawn > 7 )
//                result += (_daysOverdrawn -7) *0.85;
//            return result;
//        }
//        else
//            return _daysOverdrawn * 1.75;
//    }


    public Account(AccountType _type, int _daysOverdrawn) {
        this._type = _type;
        this._daysOverdrawn = _daysOverdrawn;
    }

    public double bankCharge(){
        double result = 4.5;
        if (_daysOverdrawn > 0){
            result += _type.overdraftCharge(_daysOverdrawn);
        }
        return result;
    }
}
