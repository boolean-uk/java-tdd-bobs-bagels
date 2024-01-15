package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testIfAddAddsBagelsProperly(){
        Basket basket = new Basket();

        basket.add("Plain", 1);
        Assertions.assertTrue(basket.basket.contains("Plain"));
    }
}
