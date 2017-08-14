package com.joshua.selfEncapsulateField;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/14.
 */
public class CappedRangeTest {
    @Test
    public void getHigh() throws Exception {
        assertThat(new CappedRange(3,6,8).getHigh(),is(6));
    }

}