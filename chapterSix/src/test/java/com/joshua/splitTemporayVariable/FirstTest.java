package com.joshua.splitTemporayVariable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/9.
 */
public class FirstTest {
    public First first;
    @Before
    public void setUp() throws Exception {
        first = new First(10.6,5.8);
    }

    @Test
    public void printPerimeterArea() throws Exception {
        first.printPerimeterArea();
    }

    @Test
    public void rePrintPerimeterArea() throws Exception {
        first.rePrintPerimeterArea();
    }

}