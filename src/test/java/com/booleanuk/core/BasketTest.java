package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addTest() {
        Basket basket = new Basket(5);
        Assertions.assertTrue(basket.add("Plain", 1));
        Assertions.assertFalse(basket.add("Everything", 8));
        Assertions.assertFalse(basket.add("Plastic", 3));
    }

    @Test
    public void removeTest() {
        Basket basket = new Basket(10);
        basket.add("Plain", 6);
        basket.add("Everything", 2);
        basket.add("Cinnamon", 2);
        Assertions.assertTrue(basket.remove("Plain", 4));
        Assertions.assertFalse(basket.remove("Everything", 4));
        Assertions.assertFalse(basket.remove("Plastic", 2));
    }

    @Test
    public void changeCapacityTest() {
        Basket basket = new Basket(10);
        basket.add("Plain", 6);
        basket.add("Everything", 2);
        basket.add("Cinnamon", 2);
        Assertions.assertTrue(basket.changeCapacity(15));
        Assertions.assertFalse(basket.changeCapacity(8));
    }

    @Test
    public void totalCostTest() {
        Basket basket = new Basket(10);
        basket.add("Plain", 6);
        basket.add("Everything", 2);
        basket.add("Cinnamon", 2);
        Assertions.assertEquals(40, basket.totalCost());
    }

    @Test
    public void addBagelTypeTest() {
        Basket basket = new Basket(10);
        basket.add("Plain", 6);
        basket.add("Everything", 2);
        basket.add("Cinnamon", 2);
        Assertions.assertTrue(basket.addBagelType("Blueberry", 4));
        Assertions.assertFalse(basket.addBagelType("Strawberry", 0));
        Assertions.assertFalse(basket.addBagelType("Plain", 4));
    }
    @Test
    public void changeBagelPriceTest() {
        Basket basket = new Basket(10);
        basket.add("Plain", 6);
        basket.add("Everything", 2);
        basket.add("Cinnamon", 2);
        Assertions.assertTrue(basket.changeBagelPrice("Plain", 7));
        Assertions.assertFalse(basket.changeBagelPrice("Everything", 0));
        Assertions.assertFalse(basket.changeBagelPrice("Blueberry", 6));
    }
}
