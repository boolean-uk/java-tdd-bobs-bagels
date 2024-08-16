// BasketTest.java
package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BasketTest {

    ArrayList<String> baskets;

    @Test
    public void testAddBagel() {

        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("bagel1"));

    }

    @Test
    public void testRemoveBagel() {

        Basket basket = new Basket();
        basket.add("bagel1");

        Assertions.assertTrue(basket.remove("bagel1"));

    }

    @Test
    public void testIsFull() {

        Basket basket = new Basket();

        Assertions.assertTrue(basket.add("bagel1"));
        Assertions.assertTrue(basket.add("bagel2"));

        Assertions.assertTrue(basket.IsFull());

    }

    @Test
    public void testSetCapacity() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.add("bagel1"));
        Assertions.assertTrue(basket.add("bagel2"));
        Assertions.assertFalse(basket.add("bagel3"));

        basket.setCapacity(3);

        Assertions.assertTrue(basket.add("bagel3"));

    }

    @Test
    public void removeBagel() {
        Basket basket = new Basket();

        basket.add("bagel1");

        Assertions.assertEquals(1, basket.removeBagel("bagel1"));
        Assertions.assertEquals(-1, basket.removeBagel("bagel2"));
    }
}