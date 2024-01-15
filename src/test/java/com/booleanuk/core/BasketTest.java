package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagelTrue(){
        Basket basket = new Basket();
        Assertions.assertEquals("Bagel added to basket", basket.addBagel("Chocolate"));
    }
    @Test
    public void testAddBagelFalse(){
        Basket basket = new Basket();
        basket.addBagel("Chocolate");
        Assertions.assertEquals("Bagel already in basket", basket.addBagel("Chocolate"));
    }

    @Test
    public void testRemoveBagelTrue(){
        Basket basket = new Basket();
        basket.addBagel("Chocolate");
        Assertions.assertEquals("Bagel removed", basket.removeBagel("Chocolate"));
    }
    @Test
    public void testRemoveBagelFalse(){
        Basket basket = new Basket();
        basket.addBagel("Chocolate");
        Assertions.assertEquals("Bagel not in basket", basket.removeBagel("Strawberry"));
    }

    @Test
    public void testCheckBasketSize(){
        Basket basket = new Basket();
        Assertions.assertEquals("Basket is not full", basket.checkBasketSize());
    }
    @Test
    public void testCheckBasketOverSize(){
        Basket basket = new Basket();
        basket.addBagel("Chocolate");
        basket.addBagel("Strawberry");
        basket.addBagel("Vanilla");
        basket.addBagel("Beige");
        basket.addBagel("Caramel");
        Assertions.assertEquals("Basket is full", basket.addBagel("Snow"));
    }
    @Test
    public void testCheckBasketOverwSize(){
        Basket basket = new Basket();
        basket.addBagel("Chocolate");
        basket.addBagel("Strawberry");
        basket.addBagel("Vanilla");
        basket.addBagel("Beige");
        Assertions.assertEquals("Basket is not full", basket.checkBasketSize());
    }

    @Test
    public void testChangeBasketSize(){
        Basket basket = new Basket();
        Assertions.assertEquals(10, basket.changeBasketSize(10));
        Assertions.assertEquals(5, basket.changeBasketSize(5));
        Assertions.assertNotEquals(5, basket.changeBasketSize(10));
    }
    @Test
    public void testChangeBasketSizeWithElements(){
        Basket basket = new Basket();
        basket.addBagel("Chocolate");
        basket.addBagel("Strawberry");
        basket.addBagel("Vanilla");
        basket.addBagel("Beige");
        Assertions.assertEquals("Basket is not full", basket.checkBasketSize());
        Assertions.assertEquals(2, basket.changeBasketSize(2));
        Assertions.assertEquals("Basket is full", basket.checkBasketSize());
        Assertions.assertEquals(10, basket.changeBasketSize(10));
        Assertions.assertEquals("Basket is not full", basket.checkBasketSize());

    }



}
