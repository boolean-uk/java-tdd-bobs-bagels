package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddBagel(){
        Basket basket = new Basket();
        // Test if valid bagel is added to basket
        Assertions.assertEquals("Bagel added to basket.", basket.addBagel("Sesame"));
        Assertions.assertEquals("Bagel added to basket.", basket.addBagel("Oat"));
        // Test if invalid bagel is not added to basket
        Assertions.assertEquals("This bagel is not on the menu.", basket.addBagel("Totally not a bagel."));
    }

    @Test
    public void testRemoveBagel(){
        Basket basket = new Basket();
        basket.addBagel("Sesame");
        basket.addBagel("Oat");
        // Test if valid bagel is removed from basket
        Assertions.assertEquals("Bagel removed from basket.", basket.removeBagel("Sesame"));
        Assertions.assertEquals("Bagel removed from basket.", basket.removeBagel("Oat"));
    }

    @Test
    public void testSetBasketSize(){
        Basket basket = new Basket();
        // Test if basket size is not changed by non-manager
        Assertions.assertFalse(basket.setBasketSize(3));
        // Test if basket size is not changed by non-manager when value is not positive
        Assertions.assertFalse(basket.setBasketSize(-1));

        basket.isManager=true;
        // Test if basket size is not changed by manager when value is not positive
        Assertions.assertFalse(basket.setBasketSize(-1));
        // Test if basket size is changed by manager
        Assertions.assertTrue(basket.setBasketSize(3));
        Assertions.assertEquals(3, basket.basketSize);

    }

    @Test
    public void testFullBasket(){
        Basket basket = new Basket();
        basket.isManager=true;
        basket.setBasketSize(1);
        basket.addBagel("Sesame");
        // Test if customer is notified when trying to add a bagel in full basket
        Assertions.assertEquals("Basket is full.", basket.addBagel("Oat"));
    }

    @Test
    public void testRemoveBagelInvalid(){
        Basket basket = new Basket();
        basket.addBagel("Sesame");
        // Test if customer is notified when trying to remove bagel not present in basket
        Assertions.assertEquals("This bagel is not in your basket.", basket.removeBagel("Oat"));
    }

}
