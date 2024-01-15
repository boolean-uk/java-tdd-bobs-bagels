package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagel() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.addBagel("Cream Cheese"));
        Assertions.assertTrue(basket.addBagel("With Everything"));
        Assertions.assertTrue(basket.addBagel("Sesame"));
    }

    @Test
    public void testRemoveBagelInBasket() {
        Basket basket = new Basket();

        basket.addBagel("Cream Cheese");
        Assertions.assertTrue(basket.removeBagel("Cream Cheese"));
    }

    @Test
    public void testRemoveBagelNotInBasket() {
        Basket basket = new Basket();

        Assertions.assertFalse(basket.removeBagel("Cream Cheese"));
    }
}

