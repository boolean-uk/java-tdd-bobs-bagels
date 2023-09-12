package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test

    public void testAddToBasketSuccessfull() {
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
}


