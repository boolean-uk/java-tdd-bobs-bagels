package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BasketTest {

    @Test
    void testIsInBasket() {
        Basket basket = new Basket();
        basket.basket.add("cornBagel");
        Assertions.assertTrue(basket.basket.contains("cornBagel"));
        Assertions.assertFalse(basket.basket.contains("notCornBagel"));

    }

    @Test
    void testSetCapacity() {
        Basket basket = new Basket();
        basket.basket.add("cornBagel");
        basket.basket.add("corn1Bagel");
        basket.basket.add("corn2Bagel"); //size=3
        basket.setCapacity(4);
        Assertions.assertEquals(basket.capacity, 4);
        basket.setCapacity(5);
        Assertions.assertEquals(basket.capacity, 5);
        Assertions.assertFalse(basket.setCapacity(2));
        Assertions.assertFalse(basket.setCapacity(-1));
    }

    @Test
    void testGetCapacity() {
        Basket basket = new Basket();
        Assertions.assertEquals(basket.getCapacity(), basket.capacity);
    }

    @Test
    void testRemove() {
        Basket basket = new Basket();
        basket.basket.add("cornBagel");
        basket.basket.add("corn1Bagel");
        basket.basket.add("corn2Bagel"); //size=3
        ArrayList<String> expectedArray = new ArrayList<>();
        expectedArray.add("cornBagel");
        expectedArray.add("corn1Bagel");
        Assertions.assertTrue(basket.remove("corn2Bagel"));
        Assertions.assertIterableEquals(basket.basket, expectedArray);
        Assertions.assertFalse(basket.remove("corn2Bagel"));

    }

    @Test
    void testAdd() {
        Basket basket = new Basket();
        ArrayList<String> expectedArray = new ArrayList<>();
        //basket.capacity.setCapacity(2);
        Assertions.assertIterableEquals(basket.basket, expectedArray);
        basket.add("cornBagel");
        basket.add("corn1Bagel");
        expectedArray.add("cornBagel");
        expectedArray.add("corn1Bagel");
        Assertions.assertIterableEquals(basket.basket, expectedArray);
        Assertions.assertFalse(basket.add("corn1Bagel"));
    }
}
