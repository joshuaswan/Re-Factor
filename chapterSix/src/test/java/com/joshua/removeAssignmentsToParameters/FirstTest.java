package com.joshua.removeAssignmentsToParameters;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/9.
 */
public class FirstTest {
    @Test
    public void discount() throws Exception {
        System.out.println(First.discount(60,90,2039));
    }

    @Test
    public void reDiscount() throws Exception {
        System.out.println(First.reDiscount(60,90,2039));
    }

}