package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testCanAddBagelToBasket() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.add(("Plain")));
    }
}
