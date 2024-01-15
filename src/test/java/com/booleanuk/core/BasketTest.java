package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    //User story 1 Test 1
    @Test
    public void shouldReturnTrueIfBagelIsAddedToBasket() {
        Basket basket = new Basket();
        Bagel bagel = new Bagel("Sesame", "1234", 10);
        boolean added = basket.addBagel(bagel);
        Assertions.assertTrue(added);
    }

    //User story 1 Test 2
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

    //User story 2 Test 3
    @Test
    public void shouldReturnTrueIfBagelIsRemovedFromBasket() {
        Basket basket = new Basket();
        Bagel bagel = new Bagel("Sesame", "1234", 10);
        basket.addBagel(bagel);
        boolean removed = basket.removeBagel(bagel);
        Assertions.assertTrue(removed);
    }

    //User story 2 Test 4
    @Test
    public void shouldReturnFalseIfBagelIsNotInBasket() {
        Basket basket = new Basket();
        Bagel bagel = new Bagel("Sesame", "1234", 10);
        boolean removed = basket.removeBagel(bagel);
        Assertions.assertFalse(removed);
    }

    //User story 3 is tested in User Story 1

    //User story 4 Test 7
    @Test
    public void newArrayIsCorrectSize() {
        Basket basket = new Basket();
        int originalLength = basket.basket.length;
        int newLength = basket.changeCapacityOfBasket(3);
        Assertions.assertEquals(originalLength+3, newLength);
    }

    //User story 5 is tested in User Story 2
}
