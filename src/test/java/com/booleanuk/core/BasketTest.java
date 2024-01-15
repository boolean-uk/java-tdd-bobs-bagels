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

    @Test
    public void testIsBasketFull() {
        Basket basket = new Basket();

        // Should probably dynamically change how many bagels are added so we don't rely on changing to a set amount before testing
        basket.basketCapacity = 3;

        basket.addBagel("Cream Cheese");
        basket.addBagel("With Everything");
        basket.addBagel("Sesame");
        Assertions.assertFalse(basket.addBagel("The Best Bagel"));

    }

    @Test
    public void testCanSetBasketCapacity() {
        Basket basket = new Basket();
        basket.setBasketCapacity(500);
        Assertions.assertEquals(500, basket.basketCapacity);
        basket.setBasketCapacity(20);
        Assertions.assertEquals(20, basket.basketCapacity);

    }

    @Test
    public void testIsItemInBasket() {
        Basket basket = new Basket();

        basket.addBagel("Ham & Cheese");
        basket.addBagel("Cream Cheese");
        Assertions.assertFalse(basket.removeBagel("Sesame"));
    }

}

