package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addingAnItemToBasketReturnTrue(){
        Basket basket = new Basket();

        Assertions.assertTrue(basket.add("bagel1", 4));
    }

    @Test
    public void removingAnItemFromBasketReturnTrue(){
        Basket basket = new Basket();
        basket.add("bagel1", 4);
        Assertions.assertTrue(basket.remove("bagel1"));
    }

    @Test
    public void checkingTheCapacityReturnsTrue() {
        Basket basket = new Basket();
        basket.add("bagel1", 4);
        basket.add("bagel2", 7);
        basket.add("bagel3", 6);
        basket.add("bagel4", 5);
        Assertions.assertEquals("You have reached the capacity of the basket.", basket.capacity());
    }

    @Test
    public void checkingChangedCapacity() {
        Basket basket = new Basket();
        basket.change(5);
        Assertions.assertEquals(5, basket.change(5));
    }
    public void checkingMessage() {

    }
}
