package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testBasketIsEmpty(){
        Basket basket = new Basket();
        boolean isEmpty = basket.addBagel("");
        Assertions.assertTrue(isEmpty);
    }
}
