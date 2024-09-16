package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {


    @Test
    public void isItemnew() {
        Basket basket1 = new Basket();

        boolean result = basket1.add("Fried");
        Assertions.assertTrue(result);
    }

    @Test
    public void isItemAlreadyAdded() {
        Basket basket1 = new Basket();

        boolean result = basket1.add("Regular");
        Assertions.assertFalse(result);

    }

    @Test
    public void testItemInListRemove() {
        Basket basket1 = new Basket();

        boolean result = basket1.remove("Regular");
        Assertions.assertTrue(result);
    }

    @Test
    public void testItemNotInListRemove() {
        Basket basket1 = new Basket();

        boolean result = basket1.remove("Fried");
        Assertions.assertFalse(result);

    }

    @Test
    public void testBasketIsFull() {
        Basket basket1 = new Basket();

        basket1.items.add("Oregano");
        basket1.items.add("Oregano Cheese");
        basket1.items.add("Whole Wheat");
        basket1.items.add("Grains");
        basket1.items.add("Rye");
        basket1.items.add("Spicy");
        basket1.items.add("Flat");
        basket1.items.add("Double Rye");
        basket1.items.add("Cheese");
        basket1.items.add("Double Cheese");
        basket1.items.add("Triple Spice");
        boolean result = basket1.isBasketFull();
        Assertions.assertTrue(result);
    }

    @Test
    public void testBasketIsNotFull() {
        Basket basket1 = new Basket();

        boolean result = basket1.isBasketFull();
        Assertions.assertFalse(result);

    }

    @Test
    public void hasListBeenUpdated() {
        Basket basket1 = new Basket();

        int result = basket1.updateBasket(30);
        Assertions.assertEquals(30, result);
    }

    @Test
    public void testItemCanBeRemoved() {
        Basket basket1 = new Basket();

        String result = basket1.canItemBeRemoved("Regular");
        Assertions.assertEquals("The item can be removed.", result);
    }

    @Test
    public void testItemCannotBeRemoved() {
        Basket basket1 = new Basket();

        String result = basket1.canItemBeRemoved("Fried");
        Assertions.assertEquals("The item is not in the list!", result);

    }






}
