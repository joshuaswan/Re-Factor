package com.joshua.moveField;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/14.
 */
public class AccountTest {
    @Test
    public void interestForAmount_days() throws Exception {
        assertThat(new Account(new AccountType(0.06)).interestForAmount_days(100,200),is(3.287671232876712));
    }

}