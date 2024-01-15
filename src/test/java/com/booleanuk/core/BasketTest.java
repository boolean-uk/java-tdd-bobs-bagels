package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddTypeNotInBasketReturnsTrue()
    {
        Basket basket = new Basket();


        Assertions.assertTrue(basket.addToBasket("Whole wheat"));
    }

    @Test
    public void testAddTypeInBasketReturnsFalse()
    {
        Basket basket = new Basket();

        basket.addToBasket("Whole wheat");
        Assertions.assertFalse(basket.addToBasket("Whole wheat"));
    }

    @Test
    public void testRemoveTypeExistsReturnsTrue()
    {
        Basket basket = new Basket();

        basket.addToBasket("Whole wheat");
        Assertions.assertTrue(basket.removeFromBasket("Whole wheat"));
    }

    @Test
    public void testRemoveTypeNotExistsReturnsFalse()
    {
        Basket basket = new Basket();

        Assertions.assertFalse(basket.removeFromBasket("Whole wheat"));
    }

    @Test
    public void testAddBagelToOverfilledBasketDisplaysMessage()
    {
        Basket basket = new Basket();

        // Max = 10
        basket.addToBasket("Whole wheat");
        basket.addToBasket("Half wheat");
        basket.addToBasket("Whole grain");
        basket.addToBasket("White");
        basket.addToBasket("Standard");
        basket.addToBasket("Sweet");
        basket.addToBasket("Cheese");
        basket.addToBasket("Gluten free");
        basket.addToBasket("Milk free");
        basket.addToBasket("Premium");

        Assertions.assertFalse(basket.addToBasket("Seeds"));
    }

}
