package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagelInEmptyBasket() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.addBagel("Blueberry"));
    }

    @Test
    public void testAddBagelToFullBasket() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.addBagel("Blueberry"));
        Assertions.assertTrue(basket.addBagel("Cinnamon"));
        Assertions.assertTrue(basket.addBagel("Egg"));
        Assertions.assertTrue(basket.addBagel("Everything"));
        Assertions.assertTrue(basket.addBagel("Blueberry"));

        Assertions.assertFalse(basket.addBagel("Plain"));
    }

    @Test
    public void testRemoveBagelFromEmptyBasket() {
        Basket basket = new Basket();

        Assertions.assertFalse(basket.removeBagel("Cinnamon"));
    }

    @Test
    public void testRemoveBagelFromBasketReturnTrue() {
        Basket basket = new Basket();

        basket.addBagel("Blueberry");
        basket.addBagel("Cinnamon");
        basket.addBagel("Egg");

        Assertions.assertTrue(basket.removeBagel("Blueberry"));
    }
}
