package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddBagelToBasket(){
        Basket basket = new Basket();

        basket.addToBasket("Plain");
        Assertions.assertEquals("Plain",basket.basketArr[1]);
    }

    @Test
    public void testRemoveBagelFromBasket(){
        Basket basket = new Basket();

        boolean result = basket.removeFromBasket("Strawberry");
        Assertions.assertTrue(result);
    }

    @Test
    public void testAddToBasketDontExtendCapacity(){
        Basket basket = new Basket();

        basket.addToBasket("Plain");
        basket.addToBasket("Vanilla");
        basket.addToBasket("Strawberry");
        boolean result = basket.addToBasket("Liquorice");
        Assertions.assertFalse(result);
    }

    @Test
    public void testChangeArrayCapacity(){
        Basket basket = new Basket();

        basket.changeBasketCapacity(6);
        Assertions.assertEquals(6,basket.basketArr.length);
    }

    @Test
    public void testIfBagelExists(){
        Basket basket = new Basket();

        boolean result = basket.removeFromBasket("Liquorice");
        Assertions.assertFalse(result);
    }
}
