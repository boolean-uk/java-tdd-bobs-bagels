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

}
