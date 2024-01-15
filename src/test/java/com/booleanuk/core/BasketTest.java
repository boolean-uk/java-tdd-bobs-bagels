package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    // 1.
    @Test
    public void addChocolateBagelReturnTrue() {
        Basket basket = new Basket(3);
        boolean result = basket.addBagel("choclate");
        Assertions.assertTrue(result);
    }

    @Test
    public void addChocolateBagelTwiceReturnTrue() {
        Basket basket = new Basket(3);
        boolean result = basket.addBagel("choclate");
        result = basket.addBagel("choclate");
        Assertions.assertTrue(result);
    }

    // 2.

    @Test
    public void removeChocolateAfteraddingReturnTrue() {
        Basket basket = new Basket();
        boolean result = basket.addBagel("choclate");
        result = basket.removeBagel("choclate");
        Assertions.assertTrue(result);
    }

    @Test
    public void removeChocolateFromEmptyBasketReturnFalse() {
        Basket basket = new Basket();
        boolean result = basket.removeBagel("choclate");
        Assertions.assertFalse(result);
    }




}
