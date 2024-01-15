package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testCanAddBagelToBasket() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.add(("Plain")));
    }

    @Test
    public void testReturnsTrueCanRemoveBagelFromBasket() {
        Basket basket = new Basket();
        basket.add(("Plain"));

        Assertions.assertTrue(basket.remove("Plain"));
    }

    @Test
    public void testRemoveReturnFalseIfBagelNotInBasket() {
        Basket basket = new Basket();

        Assertions.assertFalse(basket.remove("Plain"));
    }

    @Test
    public void testReturnsFalseWhenAddToFullBasket() {
        Basket basket = new Basket();
        basket.capacity = 3;
        basket.add(("Plain"));
        basket.add(("Everything"));
        basket.add(("Blueberry"));

        Assertions.assertFalse(basket.add("Chocolate"));
    }

    @Test
    public void testChangeCapacityReturnsTrueWhenNewCapacityIsPositive() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.changeCapacity(5));
    }

    @Test
    public void testChangeCapacityReturnsFalseWhenNegativeCapacity() {
        Basket basket = new Basket();
        Assertions.assertFalse(basket.changeCapacity(-2));
    }
}
