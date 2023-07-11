package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddBagel() {
        Basket basket = new Basket();
        Bagel plainBagel = new Bagel("plain");

        basket.addBagel(plainBagel);

        assertEquals(1, basket.getSize());
        assertTrue(basket.containsBagel(plainBagel));
    }



}
