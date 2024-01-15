package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addChocolateBagelReturnTrue() {
        Basket basket = new Basket();
        boolean result = basket.addBagel("choclate");
        Assertions.assertTrue(result);
    }





}
