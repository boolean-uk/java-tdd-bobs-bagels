package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testCanAddBagelToBasket() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.add(("Plain")));
    }

    @Test
    public void testReturnsTrueCanRemoveBagelFromBasket() {
        Basket basket = new Basket();
        basket.add(("Plain"));

        Assertions.assertTrue(basket.remove("Plain"));
    }

    @Test
    public void testRemoveReturnFalseIfBagelNotInBasket() {
        Basket basket = new Basket();

        Assertions.assertFalse(basket.remove("Plain"));
    }
}
