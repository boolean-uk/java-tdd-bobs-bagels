package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddTypeNotInBasketReturnsTrue()
    {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.add("Whole wheat"));
    }
}
