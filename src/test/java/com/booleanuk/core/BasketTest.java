package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {


    @Test
    public void isItemnew() {
        Basket basket1 = new Basket();

        boolean result = basket1.add("Regular");
        Assertions.assertTrue(result);
    }

    @Test
    public void isItemAlreadyAdded() {
        Basket basket1 = new Basket();

        boolean result = basket1.add("Regular");
        Assertions.assertFalse(result);

    }



}
