package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddTypeNotInBasketReturnsTrue()
    {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.addToBasket("Whole wheat"));
    }

    @Test
    public void testAddTypeInBasketReturnsFalse()
    {
        Basket basket = new Basket();

        basket.addToBasket("Whole wheat");
        Assertions.assertFalse(basket.addToBasket("Whole wheat"));
    }
}
