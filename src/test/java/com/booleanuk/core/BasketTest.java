package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void AddingBagelTest()
    {
        Basket basket = new Basket();
        String bagel = "bagel";
        basket.add(bagel);
        Assertions.assertEquals(basket.bagelsBasket.get(0),bagel);
    }
    @Test
    public void RemovingBagelTest()
    {
        Basket basket = new Basket();
        String bagel = "bagel";
        String bagel1 = "bagel1";
        basket.add(bagel);
        basket.add(bagel1);
        basket.remove(bagel);
        Assertions.assertFalse(basket.bagelsBasket.contains(bagel));
    }

}
