package com.joshua.extractClass;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/14.
 */
public class PersonTest {
    @Test
    public void getTelephoneNumber() throws Exception {
        assertThat(new Person("Joshua",new TelephoneNumber("010","90890876")).getTelephoneNumber(),
                is("(010) 90890876"));
    }

}