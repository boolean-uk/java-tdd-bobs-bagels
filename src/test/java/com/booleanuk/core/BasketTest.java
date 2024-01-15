package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagel() {
        Basket basket = new Basket(10);
        Bagel bagel = new Bagel("Cheese", 10, 1);
        Assertions.assertTrue(basket.addBagel(bagel));

        Basket full_basket = new Basket(0);
        Assertions.assertFalse(full_basket.addBagel(bagel));
    }
    @Test
    public void testRemoveBagel() {
        Basket basket = new Basket(10);
        Bagel bagel = new Bagel("Cheese", 10, 1);
        Bagel bagel_not_in_basket = new Bagel("Cheese", 10, 1);
        basket.addBagel(bagel);

        Assertions.assertTrue(basket.removeBagel(bagel));
        Assertions.assertFalse(basket.removeBagel(bagel_not_in_basket));
    }


}
