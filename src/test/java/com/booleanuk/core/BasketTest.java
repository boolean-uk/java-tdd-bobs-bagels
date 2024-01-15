package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddOneBagelToBasket(){
        Basket basket = new Basket();
        Assertions.assertEquals("Cream Cheese added", basket.addBagel("Cream Cheese"));

    }

}
