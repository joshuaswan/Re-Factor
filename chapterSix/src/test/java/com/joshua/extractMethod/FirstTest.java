package com.joshua.extractMethod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/2/16.
 */
public class FirstTest {
    @Test
    public void printOwing() throws Exception {
        First first = new First("Joshua");
        first.printOwing(78.9);
    }
}