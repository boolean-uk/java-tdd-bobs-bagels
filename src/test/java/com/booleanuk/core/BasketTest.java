package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BasketTest {


    @Test
    public void testAddBagelToBasketIfNotFull(){
        Basket basket = new Basket(10);
        Assertions.assertTrue(basket.addBagel("Crispy Bagel"));
    }



    @Test
    public void testAddBagelToBasketIfFull(){
        Basket basket = new Basket(1);
        basket.addBagel("Plain Bagel");
        boolean result = basket.addBagel("Crispy Bagel");
        Assertions.assertFalse(result);
    }

    @Test
    public void testRemoveExistingBagelFromBasket() {
        Basket basket = new Basket(5);
        basket.addBagel("Plain Bagel");
        basket.addBagel("Crispy Bagel");
        boolean result = basket.removeBagel("Plain Bagel");
        Assertions.assertTrue(result);

    }

    @Test
    public void testRemoveNonExistingBagelFromBasket() {
        Basket basket = new Basket(5);
        basket.addBagel("Plain Bagel");
        basket.addBagel("Crispy Bagel");
        boolean result = basket.removeBagel("Cheese Bagel");
        Assertions.assertFalse(result);

    }

    @Test
    public void testShouldNotAddDuplicateBagel() {
        Basket basket = new Basket(10);
        basket.addBagel("Plain Bagel");
        boolean result = basket.checkDuplicates("Plain Bagel");
        Assertions.assertTrue(result);
    }


}
