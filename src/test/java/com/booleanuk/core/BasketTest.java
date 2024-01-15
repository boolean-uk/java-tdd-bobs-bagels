package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagel() {
        Basket basket = new Basket(10);
        Assertions.assertTrue(basket.addBagel());

        Basket full_basket = new Basket(0);
        Assertions.assertFalse(full_basket.addBagel());
    }
    @Test
    public void testRemoveBagel() {
        Basket basket = new Basket(10);
        Assertions.assertTrue(basket.removeBagel());
    }

}
