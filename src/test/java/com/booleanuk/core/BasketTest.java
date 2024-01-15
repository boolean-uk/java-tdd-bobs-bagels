package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    //Test 1
    @Test
    public void shouldReturnTrueIfBagelIsAddedToBasket() {
        Basket basket = new Basket();
        Bagel bagel = new Bagel("Sesame", "1234", 10);
        boolean added = basket.addBagel(bagel);
        Assertions.assertTrue(added);
    }

    //Test 2
    @Test
    public void shouldReturnFalseIfBagelIsNotAddedToBasket() {
        Basket basket = new Basket();
        Bagel bagel = new Bagel("Sesame", "1234", 10);
        basket.addBagel(bagel);
        basket.addBagel(bagel);
        basket.addBagel(bagel);
        basket.addBagel(bagel);
        boolean added = basket.addBagel(bagel);
        Assertions.assertFalse(added);
    }

    //Test 3
    @Test
    public void shouldReturnTrueIfBagelIsRemovedFromBasket() {
        Basket basket = new Basket();
        Bagel bagel = new Bagel("Sesame", "1234", 10);
        basket.addBagel(bagel);
        boolean removed = basket.removeBagel(bagel);
        Assertions.assertTrue(removed);
    }

    //Test 4
    @Test
    public void shouldReturnFalseIfBagelIsNotInBasket() {
        Basket basket = new Basket();
        Bagel bagel = new Bagel("Sesame", "1234", 10);
        boolean removed = basket.removeBagel(bagel);
        Assertions.assertFalse(removed);
    }
}
