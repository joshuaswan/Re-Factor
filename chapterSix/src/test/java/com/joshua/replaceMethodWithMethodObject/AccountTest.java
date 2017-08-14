package com.joshua.replaceMethodWithMethodObject;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/14.
 */
public class AccountTest {

    private Account account;

    @Before
    public void before(){
        account = new Account();
    }

    @Test
    public void gamma() throws Exception {
        int result = account.gamma(3,4,5);
        System.out.println(result);
        assertThat(result,is(781));
    }

    @Test
    public void reGamma() throws Exception {
        assertThat(account.reGamma(3,4,5),is(781));

    }

}