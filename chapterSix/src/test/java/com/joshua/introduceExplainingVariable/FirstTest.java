package com.joshua.introduceExplainingVariable;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/2/17.
 */
public class FirstTest {
    @Test
    public void isOperation() throws Exception {

        First first = new First("mac1.0","ie11",10);
        First first1 = new First("mac1.0","ie11",10);
        first.initialized();
        System.out.println(first.isOperation());
        System.out.println(first1.isOperation());
    }

}