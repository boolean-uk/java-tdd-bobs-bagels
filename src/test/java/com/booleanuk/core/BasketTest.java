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

}
