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
    @Test
    public void removeItemNotInBasket(){
        Basket basket = new Basket();

        boolean result = basket.remove("bread");
        Assertions.assertFalse(result);
    }

    @Test
    public void checkIfBasketIsFull(){
        Basket basket = new Basket();
        basket.add("bread");
        basket.add("milk");
        basket.add("coffee");
        basket.add("butter");

        Assertions.assertFalse(basket.add("juice"));


    }

}
