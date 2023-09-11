package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    void addedCorrectly() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.addBagel("Egg"));

    }

    @Test
    void addedCorrectly2() {
        Basket basket = new Basket();

        basket.addBagel("Rainbow");
        Assertions.assertTrue(basket.addBagel("Rainbow"));
    }

    @Test
    void removedCorrectly() {
        Basket basket = new Basket();

        Assertions.assertEquals("Does not exist", basket.removeBagel("Everything "));

    }

    @Test
    void removedCorrectly2() {
        Basket basket = new Basket();

        basket.addBagel("French Toast");
        Assertions.assertEquals("Removed", basket.removeBagel("French Toast"));
    }

    @Test
    void checkBasketsCapacityCorrectly() {
        Basket basket = new Basket();
        basket.addBagel("Plain");
        basket.addBagel("Chocolate");
        basket.addBagel("Poppy");

        Assertions.assertFalse(basket.isBasketFull());
    }

    @Test
    void checkBasketsCapacityCorrectly2() {
        Basket basket = new Basket();
        basket.addBagel("Plain");
        basket.addBagel("Chocolate");
        basket.addBagel("Poppy");
        basket.addBagel("Sesame");

        Assertions.assertFalse(basket.isBasketFull());
    }

    @Test
    void increasedBasketsCapacityCorrectly() {
        Basket basket = new Basket();

        Assertions.assertEquals("Enter a bigger number", basket.increaseCapacity(7));
    }

    @Test
    void increasedBasketsCapacityCorrectly2() {
        Basket basket = new Basket();

        Assertions.assertEquals("Done", basket.increaseCapacity(20));
    }

}
