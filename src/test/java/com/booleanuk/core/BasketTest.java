package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addingBagelToNotFullBasket() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("vanilla"));
    }


    @Test
    public void addingBagelToFullBasket() {
        Basket basket = new Basket();
        basket.add("vanilla");
        basket.add("apple");
        basket.add("chocolate");
        Assertions.assertFalse(basket.add("raspberry"));
    }
}
