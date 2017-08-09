package com.joshua.splitTemporayVariable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/9.
 */
public class PuddingTest {

    private Pudding pudding;
    @Before
    public void setUp() throws Exception {
        pudding = new Pudding(10,20,10,5);
    }

    @Test
    public void getDistanceTravelled() throws Exception {
        double distance = pudding.getDistanceTravelled(20);
        System.out.println(distance);
    }

    @Test
    public void reGetDistanceTravelled() throws Exception {
        System.out.println(pudding.reGetDistanceTravelled(20));
    }

}