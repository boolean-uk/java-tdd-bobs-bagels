package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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





}
