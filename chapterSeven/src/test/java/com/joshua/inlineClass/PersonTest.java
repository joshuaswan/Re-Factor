package com.joshua.inlineClass;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/14.
 */
public class PersonTest {
    @Test
    public void getAreaNumber() throws Exception {
        Person person = new Person();

        person.setAreaNumber("010");

        assertThat(person.getAreaNumber(),is("010"));
    }

}