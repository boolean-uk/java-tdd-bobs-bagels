package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagelToBasket() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.addBagelToBasket("Bagel1"));
    }
}
