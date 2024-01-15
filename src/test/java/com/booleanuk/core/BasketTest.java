package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testBasketIsEmpty(){
        Basket basket = new Basket();
        boolean isEmpty = basket.isEmpty();
        Assertions.assertTrue(isEmpty);
    }

    @Test
    public void testAddBagel(){
        Basket basket = new Basket();
        String bagel = "Plain bagel";
        Assertions.assertEquals("Plain bagel added to basket",basket.addBagel(bagel));
    }

    @Test
    public void testRemoveBagel(){
        Basket basket = new Basket();
        String bagel = "Plain bagel";
        basket.addBagel(bagel);
        Assertions.assertEquals("Plain bagel removed from basket", basket.removeBagel(bagel));
    }

}
