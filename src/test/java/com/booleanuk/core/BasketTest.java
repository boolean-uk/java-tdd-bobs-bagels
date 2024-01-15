package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class BasketTest {

    @Test
    public void testAddBagelToBasket() {
        Basket basket = new Basket(5, new HashMap<>() {
            {
                put("Bagel1", 15);
            }
        });

        Assertions.assertTrue(basket.addBagelToBasket("Bagel1"));

    }
}
