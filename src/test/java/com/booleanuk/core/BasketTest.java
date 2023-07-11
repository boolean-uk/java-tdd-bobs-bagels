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

    @Test
    public void removeFromBasketWhenItemExists() {
        basket.addToBasket("bread");

        basket.removeFromBasket("bread");

        Assertions.assertEquals(0, basket.getAllBagles().size());
    }

    @Test
    public void removeFromBasketWhenItemDoesNotExist() {
        basket.addToBasket("bread");

        basket.removeFromBasket("frenchRoll");

        Assertions.assertEquals(1, basket.getAllBagles().size());
    }

    @Test
    public void changeCapacityOfBasketToPositiveValue() {
         Assertions.assertEquals(3, basket.getCapacity());

         basket.changeCapacityOfBasket(10);

         Assertions.assertEquals(10, basket.getCapacity());
    }

    @Test
    public void changeCapacityOfBasketToNonPositiveValue() {
        basket.changeCapacityOfBasket(0);

        Assertions.assertEquals(3, basket.getCapacity());

        basket.changeCapacityOfBasket(-5);

        Assertions.assertEquals(3, basket.getCapacity());

    }
}
