package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagelToEmptyBasket() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("Brown"));
    }

    @Test
    public void testAddBagelToEmptyBasketAndCheckIfAdded() {
        Basket basket = new Basket();
        basket.add("Brown");
        Assertions.assertTrue(basket.basketContents.containsKey("Brown"));
    }

    @Test
    public void testAddBagelWithoutNameBasket() {
        Basket basket = new Basket();
        Assertions.assertFalse(basket.add(""));
    }

    @Test
    public void testRemoveBagelFromBasket() {
        Basket basket = new Basket();
        basket.add("Brown");
        Assertions.assertTrue(basket.remove("Brown"));
    }

    @Test
    public void testRemoveBagelFromBasketAndCheckIfGone() {
        Basket basket = new Basket();
        basket.basketContents.put("Brown", 1);
        basket.remove("Brown");
        Assertions.assertTrue(basket.basketContents.isEmpty());
    }
}
