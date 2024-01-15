package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addItemToBasket(){
        Basket basket = new Basket();

        boolean result = basket.add("bread");
        Assertions.assertTrue(result);


    }

}
