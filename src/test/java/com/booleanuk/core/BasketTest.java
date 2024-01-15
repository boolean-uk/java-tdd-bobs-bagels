package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagel(){
        Basket basket = new Basket();
        Assertions.assertTrue(basket.addBagel("Sjoko"));
        Assertions.assertFalse(basket.addBagel("Sjoko"));
    }

}
