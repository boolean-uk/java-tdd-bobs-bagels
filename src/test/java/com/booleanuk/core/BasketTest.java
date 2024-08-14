package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagelAddsBagelToBasket() {
        Basket basket = new Basket();
        basket.addBagel("normal", 1);

        Assertions.assertFalse(basket.items.isEmpty());
    }

    @Test
    public void testRemoveBagelRemovesBagelFromBasket() {
        Basket basket = new Basket();
        basket.addBagel("normal", 1);

        // Then we remove the bagel.
        basket.removeBagel("normal");

        Assertions.assertTrue(basket.items.isEmpty());
    }

    @Test
    public void testHasCapacity() {
        Basket basket = new Basket();
        basket.addBagel("normal", 1);
        basket.addBagel("special", 2);

        // Check if it returns true when not full.
        boolean hasMoreSpace = basket.hasCapacity();
        Assertions.assertTrue(hasMoreSpace);

        // Check if it returns false when full.
        basket.addBagel("tasteless", 3);
        Assertions.assertFalse(basket.hasCapacity());
    }

    @Test
    public void changeBasketCapacity() {
        Basket basket = new Basket();
        basket.changeBasketCapacity(10);

        Assertions.assertEquals(10, basket.max);
    }

    @Test
    public void testRemoveBagelFromBasketIndicatesIfItemExists() {
        Basket basket = new Basket();
        basket.addBagel("normal", 1);
        boolean itemDoesNotExists = basket.removeBagel("special");

        Assertions.assertFalse(itemDoesNotExists);
    }
}
