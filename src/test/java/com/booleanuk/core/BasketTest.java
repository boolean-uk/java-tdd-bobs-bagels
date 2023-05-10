package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testBasketConstructor(){
        Basket basket = new Basket();
        Assertions.assertEquals(0, basket.bagels.size());
    }

    @Test
    public void testAddBagel(){
        Basket basket = new Basket();
        basket.add("Chocolate");
        Assertions.assertEquals("Chocolate", basket.bagels.get(0));
    }

    @Test
    public void testRemoveFromBasket(){
        Basket basket = new Basket();
        basket.add("Chocolate");
        basket.add("Vanilla");
        Assertions.assertEquals(2, basket.bagels.size());
        Assertions.assertTrue(basket.remove("Chocolate"));
        Assertions.assertEquals(1, basket.bagels.size());
        Assertions.assertFalse(basket.remove("Chocolate"));

    }
}
