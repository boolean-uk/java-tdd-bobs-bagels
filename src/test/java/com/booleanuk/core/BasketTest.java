package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    Basket basket;
    private int capacity;

     public BasketTest() {
        this.basket = new Basket(3);
     }

    @Test
    public void addToBasketTest() {
        basket.addToBasket("bread");
        basket.addToBasket("frenchRoll");
        Assertions.assertEquals(2, basket.getAllBagles().size());
    }

    @Test
    public void checkIfBasketIsFull() {
        basket.addToBasket("bread");
        basket.addToBasket("frenchRoll");
        basket.addToBasket("bagle1");
        basket.addToBasket("bagle2");

        Assertions.assertEquals(3, basket.getAllBagles().size());
    }

}
