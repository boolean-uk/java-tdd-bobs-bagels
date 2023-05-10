package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddItems(){
        Basket basket = new Basket(5);
        // 1. user story
        boolean response = basket.addItem("A");
        Assertions.assertTrue(response);
        response = basket.addItem("B");
        Assertions.assertTrue(response);
        response = basket.addItem("C");
        Assertions.assertTrue(response);
        Assertions.assertEquals(3,basket.bagels.size());

        // 3. user story
        Assertions.assertTrue(response);
        basket.addItem("D");
        basket.addItem("E");
        response = basket.addItem("F");
        Assertions.assertFalse(response);
        Assertions.assertEquals(basket.capacity,basket.bagels.size());
    }

    @Test
    public void testRemoveItem(){
        Basket basket = new Basket(3);
        basket.addItem("A");
        basket.addItem("B");
        basket.addItem("C");

        // 2. user story
        boolean response = basket.removeItem("A");
        Assertions.assertTrue(response);
        Assertions.assertEquals(2,basket.bagels.size());
        // 5. user story
        response = basket.removeItem("A");
        Assertions.assertFalse(response);
        Assertions.assertEquals(2,basket.bagels.size());



    }
}
