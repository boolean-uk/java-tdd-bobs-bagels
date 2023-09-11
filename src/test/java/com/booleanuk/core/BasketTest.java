package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddExistingProductToBasket() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("Apple", 2));
        Assertions.assertEquals(1, basket.items.size());
        Assertions.assertTrue(basket.items.containsKey("Apple"));
        Assertions.assertEquals(2, basket.items.get("Apple").intValue());
    }
    @Test
    public void testAddNonExistentProductToBasket() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("Garlic", 1));
        Assertions.assertEquals(0, basket.items.size());
    }

}
