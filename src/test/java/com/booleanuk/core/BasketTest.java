package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddExistingProductToBasket() {
        Basket basket = new Basket(5);
        Assertions.assertTrue(basket.add("Apple"));
        Assertions.assertEquals(1, basket.bagelsBasket.size());
        Assertions.assertTrue(basket.bagelsBasket.contains("Apple"));
    }
    @Test
    public void testAddNonExistentProductToBasket() {
        Basket basket = new Basket(5);
        Assertions.assertTrue(basket.add("Garlic"));
        Assertions.assertEquals(0, basket.bagelsBasket.size());
    }

    @Test
    public void testAddProductThatIsAlreadyInBasket() {
        Basket basket = new Basket(5);
        Assertions.assertTrue(basket.add("Apple"));
        Assertions.assertEquals(1, basket.bagelsBasket.size());
        Assertions.assertFalse(basket.add("Apple"));
        Assertions.assertEquals(1, basket.bagelsBasket.size());
    }

    @Test
    public void testRemoveExistingProductToBasket() {
        Basket basket = new Basket(5);
        Assertions.assertTrue(basket.add("Apple"));
        Assertions.assertEquals(1, basket.bagelsBasket.size());
        Assertions.assertTrue(basket.bagelsBasket.remove("Apple"));
        Assertions.assertEquals(0, basket.bagelsBasket.size());
    }

    @Test
    public void testRemoveNonExistingProductToBasket() {
        Basket basket = new Basket(5);
        Assertions.assertTrue(basket.add("Apple"));
        Assertions.assertEquals(1, basket.bagelsBasket.size());
        Assertions.assertFalse(basket.bagelsBasket.remove("Onion"));
    }
    @Test
    public void testIsFullWhenCapacityIsAtMax() {
        Basket basket = new Basket(3);
        Assertions.assertTrue(basket.add("Apple"));
        Assertions.assertTrue(basket.add("Onion"));
        Assertions.assertFalse(basket.isFull());
        Assertions.assertTrue(basket.add("Blueberry"));
        Assertions.assertFalse(basket.isFull());
        Assertions.assertEquals(3, basket.bagelsBasket.size());
        Assertions.assertTrue(basket.isFull());
    }

}
