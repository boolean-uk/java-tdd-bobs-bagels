package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void checkIfBagelIsAdded(){
        Basket basket =new Basket();
        String bagelToAdd="Bagel";
        basket.addBagel(bagelToAdd);
        Assertions.assertTrue(basket.bagelBasket.contains(bagelToAdd));
        Assertions.assertFalse(basket.bagelBasket.contains("Bagel2"));
    }
    @Test
    public void addTwoOfTheSameBagel(){
        Basket basket = new Basket();
        Assertions.assertEquals("Bagel added", basket.addBagel("Bagel"));
        Assertions.assertEquals("Bagel already exists in basket", basket.addBagel("Bagel"));

    }
    @Test
    public void RemovingBagel(){
        Basket basket = new Basket();
        basket.addBagel("Bagel");
        Assertions.assertEquals("Bagel removed", basket.removeBagel("Bagel"));
    }
    @Test
    public void removingBagelNotInBasket(){
        Basket basket = new Basket();
        Assertions.assertEquals("Bagel not in basket", basket.removeBagel("Bagel"));
    }
    @Test
    public void addToAFullBasket(){
        Basket basket = new Basket();
        basket.addBagel("Bagel1");
        basket.addBagel("Bagel2");
        Assertions.assertEquals("Basket full", basket.addBagel("Bagel3"));
    }
    @Test
    public void addBagelWhenNotFull(){
        Basket basket = new Basket();
        Assertions.assertEquals("Bagel added", basket.addBagel("Bagel"));
    }



}
