package com.joshua.replaceTempWithQuery;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/2/17.
 */
public class FirstTest {
    @Test
    public void testPrice(){
        First first = new First(100,30);
        First first1 = new First(30,30);

        System.out.println(first.getPrice());
        System.out.println(first1.getPrice());
    }
}