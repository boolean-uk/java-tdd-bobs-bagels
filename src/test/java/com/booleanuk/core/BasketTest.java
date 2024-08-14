package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    private final Basket basket = new Basket();

    private void addBagelsToBasket(String... bagels) {
        for (String bagel : bagels) {
            basket.addItem(bagel);
        }
    }

    @Test
    void testAddItem() {
        Assertions.assertFalse(basket.addItem(""));
        Assertions.assertTrue(basket.addItem("bagel1"));
        Assertions.assertFalse(basket.addItem("bagelThatNotExists"));
        Assertions.assertTrue(basket.addItem("bagel4"));
        Assertions.assertTrue(basket.getBasket().contains("bagel4"));
    }

    @Test
    void testRemoveItem() {
        Assertions.assertFalse(basket.removeItem(""));
        addBagelsToBasket("bagel1");
        Assertions.assertTrue(basket.removeItem("bagel1"));
        Assertions.assertFalse(basket.removeItem("bagel1"));
        Assertions.assertFalse(basket.getBasket().contains("bagel1"));
    }

    @Test
    void testIsBasketFull() {
        Assertions.assertFalse(basket.isBasketFull());
        addBagelsToBasket("bagel1", "bagel2", "bagel3", "bagel4", "bagel4");
        Assertions.assertTrue(basket.isBasketFull());
    }

    @Test
    void testIncrementBasketCapacity() {
        basket.incrementBasketCapacity();
    }
}