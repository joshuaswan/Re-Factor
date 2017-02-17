package com.joshua.introduceExplainingVariable;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/2/17.
 */
public class SecondTest {
    @Test
    public void price() throws Exception {
        Second second = new Second(600,10);
        Second second1 = new Second(400,10);

        System.out.println(second.price());
        System.out.println(second1.price());
    }

}