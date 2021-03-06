package com.joshua.replaceMethodWithMethodObject;

/**
 * Created by joshua on 2017/8/14.
 */
public class Gamma {
    private final Account account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    public Gamma(Account account, int inputVal, int quantity, int yearToDate) {
        this.account = account;
        this.inputVal = inputVal;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }

    public int compute() {
        importantValue1 = (inputVal * quantity) + account.delta();
        importantValue2 = (inputVal * yearToDate) + 100;
//        if ((yearToDate - importantValue1) > 100) {
//            importantValue2 -= 20;
//        }
        importantThing();
        int importantValue3 = importantValue2 * 7;
        // and so on
        return importantValue3 - 2 * importantValue1;
    }

    private void importantThing(){
        if ((yearToDate - importantValue1) > 100)
            importantValue2 -=20;
    }
}
