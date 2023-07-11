package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    Basket basket = new Basket();

    @Test
    public void orderBagelTest() {
        basket.addBagel("bagel1");
        Assertions.assertEquals(1, basket.getSizeOfBasket());
    }

    @Test
    public void removeBagelTest() {
        basket.addBagel("bagel2");
        basket.removeBagel("bagel2");
        Assertions.assertEquals(0, basket.getSizeOfBasket());
    }

    @Test
    public void checkIsBasketFullWhenBasketIsFullTest() {
        basket.addBagel("bagel1");
        basket.addBagel("bagel2");
        basket.addBagel("bagel3");
        basket.addBagel("bagel4");
        basket.addBagel("bagel5");

        Assertions.assertTrue(basket.isBasketFull());
    }

    @Test
    public void checkIsBasketFullWhenBasketIsNotFullTest() {
        Assertions.assertFalse(basket.isBasketFull());
    }

    @Test
    public void changeCapacityOfBasketTest() {
        Assertions.assertEquals(7, basket.changeCapacityOfBasket(7));
    }

    @Test
    public void checkIsItemInTheBasketAndReturnTrue() {
        basket.addBagel("bagel1");
        Assertions.assertTrue(basket.checkIfBagelIsInTheBasket("bagel1"));
    }

    @Test
    public void checkIsItemInTheBasketAndReturnFalse() {
        basket.addBagel("bagel3");
        Assertions.assertFalse(basket.checkIfBagelIsInTheBasket("bagel1"));
    }
}

