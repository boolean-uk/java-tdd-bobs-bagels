package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddTypeNotInBasketReturnsTrue()
    {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.addToBasket("Whole wheat"));
        Assertions.assertEquals(1, basket.basketList.size());
        Assertions.assertEquals("Whole wheat", basket.basketList.get(0));
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
        Assertions.assertEquals(0, basket.basketList.size());
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
        Assertions.assertEquals(10, basket.basketList.size());
    }

    @Test
    public void testMaxCapacityChangedToPositiveValue()
    {
        Basket basket = new Basket();

        boolean result = basket.changeCapacity(20);
        Assertions.assertTrue(result);
        Assertions.assertEquals(20, basket.max);
    }

    @Test
    public void testMaxCapacityChangedToZero()
    {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.changeCapacity(0));
        Assertions.assertEquals(0, basket.max);
    }

    @Test
    public void testMaxCapacityNotChangedToNegativeValue()
    {
        Basket basket = new Basket();

        Assertions.assertFalse(basket.changeCapacity(-20));
        Assertions.assertNotEquals(-20, basket.max);
        Assertions.assertEquals(10, basket.max); // 10 - default capacity
    }

    @Test
    public void testCapcityNotChangedWhenBasketSizeGreater()
    {
        Basket basket = new Basket();

        basket.addToBasket("Whole wheat");
        basket.addToBasket("Half wheat");
        basket.addToBasket("Whole grain");
        boolean result = basket.changeCapacity(2);

        Assertions.assertFalse(result);
        Assertions.assertEquals(10, basket.max);
    }

    @Test
    public void testShowThreeBasketItems()
    {
        Basket basket = new Basket();

        basket.addToBasket("Whole wheat");
        basket.addToBasket("White");
        basket.addToBasket("Gluten free");
        String expectedString = """
                Your basket has 3 items:
                Whole wheat
                White
                Gluten free
                """;
        Assertions.assertEquals(expectedString, basket.listBasketItems());
    }

    @Test
    public void testNoItemsBasketEmpty()
    {
        Basket basket = new Basket();

        String expectedString = "No items to show, basket is empty";
        Assertions.assertEquals(expectedString, basket.listBasketItems());
    }

    @Test
    public void testEmptyBasketChangesSizeFromThreeToZero()
    {
        Basket basket = new Basket();

        basket.addToBasket("Whole wheat");
        basket.addToBasket("Half wheat");
        basket.addToBasket("Milk free");

        boolean result = basket.emptyBasket();
        Assertions.assertTrue(result);
        Assertions.assertEquals(0,basket.basketList.size());
    }

    @Test
    public void testEmptyBasketNotEmptiedBecauseItIsEmpty()
    {
        Basket basket = new Basket();

        boolean result = basket.emptyBasket();
        Assertions.assertFalse(result);
        Assertions.assertEquals(0,basket.basketList.size());
    }

    @Test
    public void testShowEmail()
    {
        Basket basket = new Basket();

        String expectedOutput = "bob@bagel.com";

        Assertions.assertEquals(expectedOutput, basket.showContactInfo("e-mail"));
    }
}
