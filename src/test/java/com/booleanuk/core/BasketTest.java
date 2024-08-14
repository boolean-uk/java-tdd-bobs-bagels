package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BasketTest {

    @Test
    public void addBagelTest(){
        Basket basket = new Basket();
        Assertions.assertTrue(basket.addBagel("Gluten Bagel"));
        Assertions.assertTrue(basket.addBagel("Bagel"));
        Assertions.assertTrue(basket.addBagel("non Bagel"));
    }

    @Test
    public void removeBagelTest(){
        Basket basket = new Basket();
        basket.addBagel("Gluten Bagel");
        Assertions.assertTrue(basket.removeBagel("Gluten Bagel"));
    }

    @Test
    public void changeCapacity(){
        Basket basket = new Basket();
        basket.changeCapacity(50);
        Assertions.assertEquals(50, basket.getBasketSize());
    }

}
