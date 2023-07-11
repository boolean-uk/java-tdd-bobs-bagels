package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addTest(){
        Basket basket = new Basket(3);
        boolean result1 = basket.add("Plain bagle");
        Assertions.assertTrue(result1);

        basket.add("Blueberry bagle");
        basket.add("Everything bagle");
        Assertions.assertTrue(basket.bagles.contains("Everything bagle"));

        boolean result2 = basket.add("Egg bagle");
        Assertions.assertFalse(result2);
        Assertions.assertFalse(basket.bagles.contains("Egg bagle"));

    }

    @Test
    public void removeTest(){
        Basket basket = new Basket(3);
        Assertions.assertFalse(basket.remove("Something"));

        basket.add("Plain Bagle");
        Assertions.assertTrue(basket.remove("Plain Bagle"));
        Assertions.assertFalse(basket.bagles.contains("Plain Bagle"));
    }

    @Test
    public void capacityChangeTest(){
        Basket basket = new Basket(3);
        boolean result1 = basket.changeCapacity(5);
        Assertions.assertTrue(result1);
        Assertions.assertEquals(5, basket.capacity);

        boolean result2 = basket.changeCapacity(-5);
        Assertions.assertFalse(result2);

        basket.add("Bagle1");
        basket.add("Bagle2");
        basket.add("Bagle3");
        basket.add("Bagle4");
        basket.add("Bagle5");

        boolean result3 = basket.changeCapacity(4);
        Assertions.assertFalse(result3);
        Assertions.assertEquals(5, basket.capacity);

        basket.remove("Bagle1");
        boolean result4 = basket.changeCapacity(4);
        Assertions.assertTrue(result4);
        Assertions.assertEquals(4, basket.capacity);
    }

}
