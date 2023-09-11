package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddExistingProductToBasket() {
        Basket basket = new Basket(5);
        Assertions.assertTrue(basket.add("Apple"));
        Assertions.assertEquals(1, basket.basket.size());
        Assertions.assertTrue(basket.basket.contains("Apple"));
    }
    @Test
    public void testAddNonExistentProductToBasket() {
        Basket basket = new Basket(5);
        Assertions.assertTrue(basket.add("Garlic"));
        Assertions.assertEquals(0, basket.basket.size());
    }

    @Test
    public void testAddProductThatIsAlreadyInBasket() {
        Basket basket = new Basket(5);
        Assertions.assertTrue(basket.add("Apple"));
        Assertions.assertEquals(1, basket.basket.size());
        Assertions.assertFalse(basket.add("Apple"));
        Assertions.assertEquals(1, basket.basket.size());
    }
}
