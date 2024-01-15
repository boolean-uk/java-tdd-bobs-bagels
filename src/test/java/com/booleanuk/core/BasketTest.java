package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagelTrue(){
        Basket basket = new Basket();
        Assertions.assertTrue(basket.addBagel("Chocolate"));
    }
    @Test
    public void testAddBagelFalse(){
        Basket basket = new Basket();
        basket.addBagel("Chocolate");
        Assertions.assertFalse(basket.addBagel("Chocolate"));
    }

    @Test
    public void testRemoveBagel(){
        Basket basket = new Basket();
        basket.addBagel("Chocolate");
        basket.addBagel("Strawberry");
        Assertions.assertEquals("Bagel removed", basket.removeBagel);
    }

}
