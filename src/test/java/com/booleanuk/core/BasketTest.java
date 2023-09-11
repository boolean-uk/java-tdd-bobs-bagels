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
        Assertions.assertTrue(basket.remove("Apple"));
        Assertions.assertEquals(0, basket.bagelsBasket.size());
    }

    @Test
    public void testRemoveNonExistingProductToBasket() {
        Basket basket = new Basket(5);
        Assertions.assertTrue(basket.add("Apple"));
        Assertions.assertEquals(1, basket.bagelsBasket.size());
        Assertions.assertFalse(basket.remove("Onion"));
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

    @Test
    public void testSetCapacityToExpand() {
        Basket basket = new Basket(3);
        Assertions.assertEquals(3, basket.capacity);
        basket.setCapacity(5);
        Assertions.assertEquals(5, basket.capacity);
    }
    @Test
    public void testSetCapacityToShrinkWithFullBasket() {
        Basket basket = new Basket(4);
        Assertions.assertEquals(4, basket.capacity);
        Assertions.assertTrue(basket.add("Apple"));
        Assertions.assertTrue(basket.add("Onion"));
        Assertions.assertTrue(basket.add("Blueberry"));
        Assertions.assertTrue(basket.add("Sourdough"));
        Assertions.assertEquals(4, basket.bagelsBasket.size());
        Assertions.assertTrue(basket.setCapacity(3));
        Assertions.assertEquals(3, basket.capacity);
        Assertions.assertEquals(3, basket.bagelsBasket.size());
    }
    @Test
    public void testSetCapacityToZeroOrNegative() {
        Basket basket = new Basket(4);
        Assertions.assertEquals(4, basket.capacity);
        Assertions.assertFalse(basket.setCapacity(0));
        Assertions.assertEquals(4, basket.capacity);
        Assertions.assertFalse(basket.setCapacity(-1));
        Assertions.assertEquals(4, basket.capacity);
    }


    @Test
    public void testCheckForNonExistingProductInBasket() {
        Basket basket = new Basket(5);
        Assertions.assertTrue(basket.add("Apple"));
        Assertions.assertEquals(1, basket.bagelsBasket.size());
        Assertions.assertTrue(basket.bagelsBasket.contains("Onion"));
    }
    @Test
    public void testCheckForExistingProductInBasket() {
        Basket basket = new Basket(5);
        Assertions.assertTrue(basket.add("Apple"));
        Assertions.assertEquals(1, basket.bagelsBasket.size());
        Assertions.assertTrue(basket.bagelsBasket.contains("Apple"));
    }

}
