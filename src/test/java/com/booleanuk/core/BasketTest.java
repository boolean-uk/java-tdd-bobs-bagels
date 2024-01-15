package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addItemToBasketReturnTrue(){
        Basket basket = new Basket();

        boolean result = basket.add("bread");
        Assertions.assertTrue(result);
    }


    @Test
    public void removeItemFromBasket(){
        Basket basket = new Basket();

        basket.add("bread");
        boolean result = basket.remove("bread");
        Assertions.assertTrue(result);
    }

}
