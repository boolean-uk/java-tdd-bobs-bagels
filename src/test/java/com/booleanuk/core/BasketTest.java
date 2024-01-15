package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testBasketIsEmpty(){
        Basket basket = new Basket();
        boolean isEmpty = basket.isEmpty();
        Assertions.assertTrue(isEmpty);
    }

    @Test
    public void testAddBagel(){
        Basket basket = new Basket();
        String bagel = "Plain bagel";
        Assertions.assertEquals("Plain bagel added to basket",basket.addBagel(bagel));
    }

    @Test
    public void testRemoveBagel(){
        Basket basket = new Basket();
        String bagel = "Plain bagel";
        basket.addBagel(bagel);
        Assertions.assertEquals("Plain bagel removed from basket", basket.removeBagel(bagel));
    }

    @Test
    public void testBasketIsFull(){
        Basket basket = new Basket();
        String bagel = "Plain bagel";
        basket.bagelBasket.add("Everything bagel");
        basket.bagelBasket.add("Egg bagel");
        basket.bagelBasket.add("Rainbow bagel");
        basket.bagelBasket.add("Pumpernickel bagel");
        basket.bagelBasket.add("Breakfast bagel");
        basket.bagelBasket.add("Poppyseed bagel");

        Assertions.assertEquals("The Basket is full",basket.addBagel(bagel));
    }

}
