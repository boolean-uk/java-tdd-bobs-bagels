package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    public void testCreateBasket() {
        // Test so that you can only initiate a basket with a positive number.
        Basket basket1 = new Basket(1);
        Basket basketM1 = new Basket(-1);
        Basket basket5 = new Basket(5);

        assertEquals(1, basket1.capacity);
        assertEquals(1, basketM1.capacity);
        assertEquals(5, basket5.capacity);
    }

    @Test
    public void testAddToBasket() {
        // Test if you can add more bagels to basket than the capacity
        Basket basket = new Basket(2);

        boolean b1 = basket.addBagel("1");
        boolean b2 = basket.addBagel("2");
        boolean b3 = basket.addBagel("3");

        assertTrue(b1);
        assertTrue(b2);
        assertFalse(b3);
    }


    @Test
    public void testRemoveFromBasket() {
        Basket basket = new Basket(2);

        // Test removal from empty basket
        boolean b1 = basket.removeBagel("1");
        assertFalse(b1);

        // Test removal of the same bagel twice
        basket.addBagel("1");
        boolean b2 = basket.removeBagel("1");
        boolean b3 = basket.removeBagel("1");

        assertTrue(b2);
        assertFalse(b3);

        // Test removal of non-existent bagel
        basket.addBagel("1");
        boolean b4 = basket.removeBagel("2");
        assertFalse(b4);

        // Test that only one bagel is removed at a time
        basket.addBagel("1");
        basket.addBagel("1");
        boolean b5 = basket.removeBagel("1");
        boolean b6 = basket.removeBagel("1");
        assertTrue(b5);
        assertTrue(b6);
    }

    @Test
    public void testSetCapacity() {
        // Test that capacity changes
        Basket basket = new Basket(2);
        basket.setCapacity(3, true);
        assertEquals(3, basket.capacity);

        // Test that capacity needs to be positive
        boolean b1 = basket.setCapacity(-1, true);
        assertFalse(b1);

        // Test that capacity cant be lower than the current amount of bagels in basket
        basket.addBagel("1");
        basket.addBagel("2");
        boolean b2 = basket.setCapacity(1, true);
        assertFalse(b2);

        // Test that you need to be Bob
        boolean b3 = basket.setCapacity(5, false);
        assertFalse(b3);
    }
}
