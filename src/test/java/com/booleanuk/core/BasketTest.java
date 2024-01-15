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
    public void testRemoveBagelTrue(){
        Basket basket = new Basket();
        basket.addBagel("Chocolate");
        Assertions.assertEquals("Bagel removed", basket.removeBagel("Chocolate"));
    }
    @Test
    public void testRemoveBagelFalse(){
        Basket basket = new Basket();
        basket.addBagel("Chocolate");
        Assertions.assertEquals("Bagel not in basket", basket.removeBagel("Strawberry"));
    }

    @Test
    public void testCheckBasketSize(){
        Basket basket = new Basket();
        Assertions.assertEquals("Basket is not full", basket.checkBasketSize());
    }

}
