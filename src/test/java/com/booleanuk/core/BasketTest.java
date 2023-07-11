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



}
