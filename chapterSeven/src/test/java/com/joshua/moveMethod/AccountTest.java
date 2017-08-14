package com.joshua.moveMethod;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/14.
 */
public class AccountTest {
    @Test
    public void bankCharge() throws Exception {
        assertThat(new Account(new AccountType(),1).bankCharge(),is(6.25));
    }

}