package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    // ADD BAGELS TEST
    @Test
    public void testAddBagelToBasketReturnTrue(){
        Basket basket = new Basket();
        boolean result = basket.add("chocolate");
        Assertions.assertTrue(result);
    }

    @Test
    public void testAddBagelToBasketWithTrueAndFalse(){
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("vanilla"));
        Assertions.assertTrue(basket.add("chocolate"));
        Assertions.assertFalse(basket.add(""));
    }

    // REMOVE BAGEL TESTS
    @Test
    public void testRemoveBagelFromBasketReturnsTrue(){
        Basket basket = new Basket();

        basket.add("Cookie Dough");
        basket.add("Vanilla");
        basket.add("Chocolate");
        basket.add("Blueberry");

        Assertions.assertTrue(basket.remove("Chocolate"));
        Assertions.assertFalse(basket.remove("Plain"));
        Assertions.assertTrue(basket.remove("Cookie Dough"));
    }

    @Test
    public void testCheckIfBasketIsAboveCapacity(){
        Basket basket = new Basket();

        basket.add("Cookie Dough");
        basket.add("Vanilla");
        basket.add("Chocolate");
        basket.add("Blueberry");
        basket.add("Strawberry");
        basket.add("Plain");

        Assertions.assertTrue(6, basket.capacity);
        Assertions.assertFalse(4, basket.capacity);
    }

    @Test
    public void testAddBagelIfBasketIsFull(){
        Basket basket = new Basket();

        basket.add("Cookie Dough");
        basket.add("Vanilla");
        basket.add("Chocolate");
        basket.add("Blueberry");
        basket.add("Strawberry");
        basket.add("Plain");

        Assertions.assertFalse(4, basket.size());
        Assertions.assertTrue(5, basket.size());
        Assertions.assertFalse(6, basket.size());
    }

}
