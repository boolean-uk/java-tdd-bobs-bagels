package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void bagelAddedToBasketReturnTrue() {
        Basket basket = new Basket();

        boolean bagelAdded = basket.addBagelTypeToBasket();

        Assertions.assertTrue(bagelAdded);
    }

    @Test
    public void bagelNotAddedToBasketReturnFalse() {
        Basket basket = new Basket();

        boolean bagelNotAdded = basket.addBagelTypeToBasket();

        Assertions.assertFalse(bagelNotAdded);
    }

}
