package com.joshua.rental;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/2/16.
 */
public class CustomerTest {
    @Test
    public void statementTest() {
        Customer customer = new Customer("Joshua");

        Movie iron = new Movie("Iron", 1);
        Movie death = new Movie("Death", 2);
        Movie eatPrayLove = new Movie("Eat Pray Love", 0);
        Rental rental01 = new Rental(iron, 3);
        Rental rental02 = new Rental(death, 2);
        Rental rental03 = new Rental(eatPrayLove, 1);
        customer.addRental(rental01);
        customer.addRental(rental02);
        customer.addRental(rental03);

        System.out.println(customer.statement());
        System.out.println(customer.htmlStatement());
    }
}