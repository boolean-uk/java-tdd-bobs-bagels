package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    // 1.
    @Test
    public void addChocolateBagelReturnTrue() {
        Basket basket = new Basket();
        boolean result = basket.addBagel("choclate");
        Assertions.assertTrue(result);
    }

    @Test
    public void addChocolateBagelTwiceReturnFalse() {
        Basket basket = new Basket();
        boolean result = basket.addBagel("choclate");
        result = basket.addBagel("choclate");
        Assertions.assertFalse(result);
    }





}
