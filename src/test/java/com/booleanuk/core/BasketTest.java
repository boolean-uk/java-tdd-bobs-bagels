package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagelToBasketReturnTrue(){
        Basket basket = new Basket();
        boolean result = basket.add("chocolate");
        Assertions.assertTrue(result);
    }

    @Test
    public void testAddBagelToBasketReturnFalse(){
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("vanilla"));
        Assertions.assertTrue(basket.add("chocolate"));
        Assertions.assertFalse(basket.add(""));
    }

}
