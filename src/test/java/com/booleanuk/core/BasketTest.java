package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    void addedCorrectly() {
        Basket basket = new Basket();

        Assertions.assertEquals("Added",basket.addBagel("Egg"));

    }

    @Test
    void addedCorrectly2() {
        Basket basket = new Basket();

        basket.addBagel("Rainbow");
        Assertions.assertEquals("This type already exists in the basket",basket.addBagel("Rainbow"));
    }


    @Test
    void removedCorrectly() {
        Basket basket = new Basket();

        Assertions.assertEquals("This type does not exist", basket.removeBagel("Everything "));

    }

    @Test
    void removedCorrectly2() {
        Basket basket = new Basket();

        basket.addBagel("French Toast");
        Assertions.assertEquals("Removed", basket.removeBagel("French Toast"));
    }

    @Test
    void checkIfBasketIsFull() {
        Basket basket = new Basket();
        basket.addBagel("Plain");
        basket.addBagel("Chocolate");
        basket.addBagel("Poppy");

        Assertions.assertFalse(basket.isBasketFull());
    }

    @Test
    void checkIfBasketIsFull2() {
        Basket basket = new Basket();
        basket.addBagel("Plain");
        basket.addBagel("Chocolate");
        basket.addBagel("Poppy");
        basket.addBagel("Sesame");

        Assertions.assertTrue(basket.isBasketFull());
    }

    @Test
    void increasedBasketsCapacityCorrectly() {
        Basket basket = new Basket();

        Assertions.assertEquals("Enter a bigger number", basket.increaseCapacity(2));
    }

    @Test
    void increasedBasketsCapacityCorrectly2() {
        Basket basket = new Basket();

        Assertions.assertEquals("Done", basket.increaseCapacity(10));
    }

}
