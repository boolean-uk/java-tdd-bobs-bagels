package com.booleanuk.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test

    public void testAddToBasketSuccessful() {
        Basket basket = new Basket(5); //object

        assertTrue(basket.addToBasket("plain"));
        assertEquals(1, basket.bagelBasket.size()); // check if it's added successfully
        assertTrue(basket.bagelBasket.contains("plain")); // check if the correct bagel is in the basket

    }

    @Test

    public void testAddToBasketFails() {
        Basket basket = new Basket(1); //object

        assertTrue(basket.addToBasket("plain"));
        assertEquals(1, basket.bagelBasket.size()); // check if it's added successfully
        assertTrue(basket.bagelBasket.contains("plain")); // check if the correct bagel is in the basket
        assertFalse(basket.addToBasket("sourDough"));
        assertEquals(1, basket.bagelBasket.size()); // check if it's still 1
    }

    @Test

    public void testRemoveFromBasketSuccessful() {
        Basket basket = new Basket(1); //object

        assertTrue(basket.addToBasket("plain"));
        assertEquals(1, basket.bagelBasket.size()); // check if it's added successfully
        assertTrue(basket.removeFromBasket("plain"));
        assertEquals(0, basket.bagelBasket.size()); // check if it's removed successfully
    }

    @Test

    public void testRemoveFromBasketFailed() {
        Basket basket = new Basket(1); //object

        assertTrue(basket.addToBasket("plain"));
        assertEquals(1, basket.bagelBasket.size()); // check if it's added successfully
        assertFalse(basket.removeFromBasket("sourDough"));
        assertEquals(1, basket.bagelBasket.size()); // check if removing was unsuccessful
    }

    @Test

    public void testChangeBasketSize() {
        Basket basket = new Basket(1);

        assertTrue(basket.addToBasketSize(1)); //increase by 1
        assertEquals(2, basket.basketSize); //Verify the new Basket Size

        assertFalse(basket.addToBasketSize(-2)); // Decrease size by 2, which is not allowed
        assertEquals(2, basket.basketSize); // Verify that size remains unchanged
    }
}


