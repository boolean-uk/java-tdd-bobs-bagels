package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAdd(){
        Basket basket = new Basket();
        boolean response = basket.add("Whole wheat");
        Assertions.assertTrue(response);
        Assertions.assertEquals("Whole wheat", basket.bagels[0]);
        response = basket.add("bagel2");
        Assertions.assertTrue(response);
        Assertions.assertEquals("bagel2", basket.bagels[1]);
        Assertions.assertEquals("Whole wheat", basket.bagels[0]);
    }
    @Test
    public void testRemove(){
        Basket basket = new Basket();
        boolean response = basket.remove("Bagel");
        //this will not pass because remove does not exist
        Assertions.assertTrue(response);
    }
}
