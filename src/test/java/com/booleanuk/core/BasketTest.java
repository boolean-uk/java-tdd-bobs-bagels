package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddOneBagelToBasket(){
        Basket basket = new Basket();
        Assertions.assertEquals("Cream Cheese added", basket.addBagel("Cream Cheese"));

    }

    @Test
    public void testAddTwoOfTheSameBagelsToBasket(){
        Basket basket = new Basket();
        Assertions.assertEquals("Cream Cheese added", basket.addBagel("Cream Cheese"));
        Assertions.assertEquals("Cream Cheese already exists in basket", basket.addBagel("Cream Cheese"));

    }

    @Test
    public void testRemovingBagelThatExists(){
        Basket basket = new Basket();
        basket.addBagel("Cream Cheese");
        Assertions.assertEquals("Cream Cheese removed", basket.removeBagel("Cream Cheese"));
    }

    @Test
    public void testRemovingBagelThatDoNotExist(){
        Basket basket = new Basket();
        basket.addBagel("Cream Cheese");
        Assertions.assertEquals("Cream Cheese removed", basket.removeBagel("Cream Cheese"));
    }

    @Test
    public void testAddToAFullBasket(){
        Basket basket = new Basket();
        basket.addBagel("Cream Cheese");
        basket.addBagel("Cheese");
        basket.addBagel("Bacon");
        Assertions.assertEquals("Basket full", basket.addBagel("Mustard"));
    }

}
