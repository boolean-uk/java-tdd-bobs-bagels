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

}
