package com.kata.codewars;

import static org.junit.Assert.*;
import org.junit.Test;

public class MoneyTest {

    @Test
    public void should_return_proper_number_of_years() {
        assertEquals(3, Money.calculateYears(1000,0.05,0.18,1100));
        assertEquals(14 , Money.calculateYears(1000,0.01625,0.18,1200));
        assertEquals(0, Money.calculateYears(1000,0.05,0.18,1000));
        assertEquals(0, Money.calculateYears(2000,0.05,0.18,1000));
    }
}
