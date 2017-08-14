package com.joshua.selfEncapsulateField;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/14.
 */
public class IntRangeTest {
    @Test
    public void includes() throws Exception {
        assertThat(new IntRange(4,10).includes(6),is(true));
    }

}