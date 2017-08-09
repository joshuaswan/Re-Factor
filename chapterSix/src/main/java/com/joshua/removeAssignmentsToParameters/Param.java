package com.joshua.removeAssignmentsToParameters;

/**
 * Created by joshua on 2017/8/9.
 */
public class Param {
    public static void main(String... args){
        int x = 5;
        triple(x);
    }

    private static void triple(int arg) {
        arg = arg * 3;
        System.out.println("arg in triple: " + arg);
    }
}
