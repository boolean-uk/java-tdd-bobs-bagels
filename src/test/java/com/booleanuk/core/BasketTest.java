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
        Assertions.assertFalse(response);
        response = basket.add("Simple bagel");
        Assertions.assertTrue(response);
        response = basket.remove("Simple bagel");
        Assertions.assertTrue(response);
    }

    @Test
    public void testAddAgain (){
        Basket basket = new Basket(1);
        boolean response = basket.add("Whole wheat");
        response = basket.add("bagel2");
        Assertions.assertFalse(response);
    }
    @Test
    public void testChangeCapacity(){
        Basket basket = new Basket(10);
        Assertions.assertEquals(10,basket.bagels.length); //constructor is working
        boolean response = basket.changeCapacity(-1); //should be false
        Assertions.assertFalse(response);
        basket.add("Bagel 1");
        basket.add("Bagel 2");
        response = basket.changeCapacity(1);
        Assertions.assertEquals(10,basket.bagels.length);
        Assertions.assertFalse(response);
        response = basket.changeCapacity(3);
        Assertions.assertEquals(3,basket.bagels.length);
        Assertions.assertTrue(response);
        response = basket.changeCapacity(12);
        Assertions.assertEquals(12,basket.bagels.length); //the actual memory allocated for that
        Assertions.assertTrue(response);
    }
}
