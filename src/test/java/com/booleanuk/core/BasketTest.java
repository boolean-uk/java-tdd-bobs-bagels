package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class BasketTest {

    Basket basket;

    @BeforeEach
    void setUp(){
        basket = new Basket();
    }

    @Test
    public void testAdd(){
        basket.add("First bagel");
        Assertions.assertEquals(1, basket.getBagels().size());
        Assertions.assertTrue(basket.getBagels().contains("First bagel"));
    }

    @Test
    public void testRemove() {
        basket.add("First bagel");
        basket.add("Second bagel");
        basket.add("Third bagel");
        basket.remove("Second bagel");

        Assertions.assertEquals(2, basket.getBagels().size());
        Assertions.assertFalse(basket.getBagels().contains("Second bagel"));
        Assertions.assertEquals(List.of("First bagel", "Third bagel"), basket.getBagels());
    }

    @Test
    public void testIsFull(){
        basket.add("First bagel");
        basket.add("Second bagel");
        Assertions.assertFalse(basket.isFull());
        basket.add("Third bagel");
        Assertions.assertTrue(basket.isFull());
    }

    @Test
    public void testAddingWhenFull() {
        basket.add("First bagel");
        basket.add("Second bagel");
        basket.add("Third bagel");

        Assertions.assertEquals(3, basket.getBagels().size());

        basket.add("Fourth bagel");

        Assertions.assertEquals(3, basket.getBagels().size());
        Assertions.assertFalse(basket.getBagels().contains("Fourth bagel"));
    }

    @Test
    public void testSetCapacity(){
        basket.add("First bagel");
        basket.add("Second bagel");
        basket.add("Third bagel");
        basket.setCapacity(4);
        basket.add("Fourth bagel");
        Assertions.assertEquals(4, basket.getBagels().size());
        Assertions.assertTrue(basket.getBagels().contains("Fourth bagel"));

    }

    @Test
    public void testIfBagelExist() {
        basket.add("First bagel");
        basket.add("Second bagel");
        basket.add("Third bagel");

        Assertions.assertTrue(basket.doesBagelExist("Second bagel"));
        Assertions.assertFalse(basket.doesBagelExist("Fourth bagel"));
    }

}
