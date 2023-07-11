package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    //1. I'd like to add a specific type of bagel to my basket.
    @Test
    public void addItemToTheBasket () {
        Basket basket = new Basket(5);
        basket.addItem("Bagel 1");
        Assertions.assertEquals(1, basket.getItemCount());
    }

    //2. I'd like to remove a bagel from my basket.
    @Test
    public void removeItemFromBasket() {
        Basket basket = new Basket(5);
        basket.addItem("Bagel 1");
        basket.removeItem("Bagel 1");
        Assertions.assertEquals(0, basket.getItemCount());
    }

    //3. I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
    @Test
    public void basketIsFull() {
        Basket basket = new Basket(2);
        basket.addItem("Bagel 1");
        basket.addItem("Bagel 2");
        Assertions.assertTrue(basket.isFull());
    }

    //4. I’d like to change the capacity of baskets.
    @Test
    public void changeBasketCapacity() {
        Basket basket = new Basket(3);
        basket.addItem("Bagel 1");
        basket.addItem("Bagel 2");
        basket.addItem("Bagel 3");
        basket.changeCapacity(5);
        Assertions.assertFalse(basket.isFull());
    }

    //5. I'd like to know if I try to remove an item that doesn't exist in my basket.
    @Test
    public void removeNonexistentItem() {
        Basket basket = new Basket(5);
        Assertions.assertThrows(RuntimeException.class, () -> {
            basket.removeItem("Bagel 1");
        });
    }
}
