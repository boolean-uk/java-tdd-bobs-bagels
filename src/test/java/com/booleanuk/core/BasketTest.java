package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    //Test 1
    @Test
    public void shouldReturnTrueIfBagelIsAddedToBasket() {
        Basket basket = new Basket();
        Bagel bagel = new Bagel("Sesame", "1234", 10);
        boolean added = basket.add(bagel);
        Assertions.assertTrue(added);
    }
}
