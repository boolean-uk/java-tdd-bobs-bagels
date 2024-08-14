package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addBagelTest() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("Plane"));
    }

    @Test
    public void removeBagelTest() {
        Basket basket = new Basket();
        basket.add("Sesame");
        Assertions.assertFalse(basket.remove("Nutella"));
    }

    @Test
    public void changeCapBasketTest() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.changeCapBasket(0, 6));
        Assertions.assertFalse(basket.changeCapBasket(1, 1));
    }

    @Test
    public void checkBasketTest() {
        Basket basket = new Basket();
        Assertions.assertEquals(0, basket.checkBasket());
        for (int i = 0; i < 7; i++) {
            basket.add("Sesame");
        }
        Assertions.assertEquals(6, basket.checkBasket());
    }

    // Try remove bagel that does not exist
    @Test
    public void tryRemoveBagelThatDoesNotExistTest() {
        Basket basket = new Basket();
        basket.add("Plane");
        basket.add("Sesame");
        Assertions.assertFalse(basket.remove("Nutella"));
    }

    @Test
    public void basketIsFullTest() {
        Basket basket = new Basket();
        for (int i = 0; i < 7; i++) {
            basket.add("Sesame");
        }
        Assertions.assertFalse(basket.add("Plane"));
    }
}
