package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
        Assertions.assertEquals("Plain bagel added to your basket",basket.addBagel(bagel));
    }

    @Test
    public void testRemoveBagel(){
        Basket basket = new Basket();
        String bagel = "Plain bagel";
        basket.addBagel(bagel);
        Assertions.assertEquals("Plain bagel removed from your basket", basket.removeBagel(bagel));
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

    @Test
    public void testBasketCapacity(){
        Basket basket = new Basket();
        basket.changeCapacity(10);
        basket.addBagel("Plain bagel");
        basket.addBagel("Plain bagel");
        basket.addBagel("Plain bagel");
        basket.addBagel("Plain bagel");
        basket.addBagel("Plain bagel");
        basket.addBagel("Plain bagel");
        basket.addBagel("Plain bagel");
        basket.addBagel("Plain bagel");
        basket.addBagel("Plain bagel");
        basket.addBagel("Plain bagel");
        Assertions.assertEquals(10, basket.bagelBasket.size());
    }

    @Test
    public void testRemoveNonExistingItem(){
        Basket basket = new Basket();
        basket.addBagel("Plain bagel");
        basket.addBagel("Everything bagel");
        String bagel = "Egg bagel";

        Assertions.assertEquals("Can not remove non-existing item.",basket.removeBagel(bagel));
    }

}
