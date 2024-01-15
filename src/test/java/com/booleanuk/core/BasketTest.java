package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void addingBagelToBasketReturnsTrue() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.add("Plain bagel"));
    }

    @Test
    public void removingBagelToBasketReturnsTrue() {
        Basket basket = new Basket();

        basket.add("Plain bagel");

        Assertions.assertTrue(basket.remove("Plain bagel"));
    }
}
