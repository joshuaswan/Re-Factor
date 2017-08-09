package com.joshua.removeAssignmentsToParameters;

import java.util.Date;

/**
 * Created by joshua on 2017/8/9.
 */
public class ParamObject {
    public static void main(String... args){
        Date date1 = new Date("1 Apr 98");
        nextDateUpdate(date1);
        System.out.println("date1 after nextDay: " + date1);

        Date data2 = new Date("1 Apr 98");
        nextDataReplace(data2);
        System.out.println("date2 after nextDay: " + data2);
    }

    private static void nextDataReplace(Date arg) {
        arg = new Date(arg.getYear(),arg.getMonth(),arg.getDate() + 1);
        System.out.println("arg in nextDay: " + arg);
    }

    private static void nextDateUpdate(Date arg) {
        arg.setDate(arg.getDay() + 1);
        System.out.println("arg in nextDay: " + arg);
    }
}
