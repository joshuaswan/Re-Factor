package com.joshua.inlineMethod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/2/16.
 */
public class FirstTest {
    @Test
    public void getRating() throws Exception {
        First first = new First(6);
        First first1 = new First(4);
        System.out.println("6:" + first.getRating());
        System.out.println("4:" + first1.getRating());
    }

}