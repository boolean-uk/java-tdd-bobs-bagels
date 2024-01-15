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

        basket.addBagel("Blueberry");
        basket.addBagel("Cinnamon");
        basket.addBagel("Egg");
        basket.addBagel("Everything");
        basket.addBagel("Blueberry");

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

    @Test
    public void testRemoveBagelFromBasketReturnFalse() {
        Basket basket = new Basket();

        basket.addBagel("Blueberry");
        basket.addBagel("Cinnamon");
        basket.addBagel("Egg");

        Assertions.assertFalse(basket.removeBagel("Plain"));
    }

    @Test
    public void testChangeCapacity() {
        Basket basket = new Basket();

        Assertions.assertEquals(10, basket.changeBasketCapacity(10));
    }
}
