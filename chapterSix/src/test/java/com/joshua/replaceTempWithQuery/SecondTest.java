package com.joshua.replaceTempWithQuery;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/2/17.
 */
public class SecondTest {

    @Test
    public void testPrice(){
        Second second = new Second(100,30);
        Second second1 = new Second(30,30);

        System.out.println(second.getPrice());
        System.out.println(second1.getPrice());
    }
}