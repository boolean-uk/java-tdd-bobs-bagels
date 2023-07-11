package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void addTestIfAddingGoesWellBagelType(){
        Basket basket = new Basket();
        basket.capacity = 2;
        basket.add("Bagel 1");
        Assertions.assertEquals(basket.bagels.get("Bagel 1"), 1);
    }

    @Test
    public void addTestIfAddingGoesWellBagelTypeInt(){
        Basket basket = new Basket();
        basket.capacity = 2;
        String message  = basket.add("Bagel 1");
        Assertions.assertEquals(basket.bagels.get("Bagel 1"), 1);
        Assertions.assertEquals(message, "bagel added");
    }

    @Test
    public void addTestIfAddingGoesWrongOverfilled(){
        Basket basket = new Basket();
        basket.capacity = 1;
        basket.add("Bagel 1");
        String message  = basket.add("Bagel 2");
        Assertions.assertFalse(basket.bagels.containsKey("Bagel 2"));
        Assertions.assertEquals(message,  "overfilled cart");
    }


    @Test
    public void isOverfilledTestIfBasketIsNotOverfilled(){
        Basket basket = new Basket();
        basket.capacity = 3;
        Assertions.assertFalse(basket.isOverfilled(2));
    }

    @Test
    public void isOverfilledTestIfBasketIsOverfilled(){
        Basket basket = new Basket();
        basket.capacity = 1;
        Assertions.assertTrue(basket.isOverfilled(2));
    }

}
