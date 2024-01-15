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



}
