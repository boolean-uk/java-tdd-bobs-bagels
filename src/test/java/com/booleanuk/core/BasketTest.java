package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addTest(){
        Basket basket = new Basket(3);
        boolean result1 = basket.add("Plain bagle");
        Assertions.assertTrue(result1);

        basket.add("Blueberry bagle");
        basket.add("Everything bagle");
        boolean result2 = basket.add("Egg bagle");
        Assertions.assertFalse(result2);
    }

    @Test
    public void removeTest(){
        Basket basket = new Basket(3);
        Assertions.assertFalse(basket.remove("Something"));
        boolean result1 = basket.add("Plain bagle");
        Assertions.assertTrue(result1);
    }

}
