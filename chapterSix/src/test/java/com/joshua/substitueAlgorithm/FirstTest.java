package com.joshua.substitueAlgorithm;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/14.
 */
public class FirstTest {

    private First first;

    @Before
    public void before(){
        first = new First();
    }
    @Test
    public void foundPerson() throws Exception {
        assertThat(first.foundPerson(new String[] {"Kent"}),is("Kent"));
    }

    @Test
    public void refoundPerson() throws Exception {
        assertThat(first.reFoundPerson(new String[] {"Kent"}),is("Kent"));
    }

}