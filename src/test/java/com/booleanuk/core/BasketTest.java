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

    @Test
    public void testCheckCapacity() {
        Basket basket = new Basket(10);
        Basket basket_full = new Basket(1);
        basket_full.addBagel(new Bagel("Cheese", 10, 1));

        Assertions.assertTrue(basket.checkCapacity() == 10);
        Assertions.assertTrue(basket_full.checkCapacity() == 0);
    }

    @Test
    public void testCheckCapacityDynamicallyAddingAndRemovingBagels() {
        Basket basket = new Basket(1);
        Bagel bagel1 = new Bagel("Cheese", 10, 1);
        Bagel bagel2 = new Bagel("Ham", 20, 1);

        // add first bagle, expect : allowed
        Assertions.assertTrue(basket.addBagel(bagel1));

        // add second bagle, expect : not allowed
        basket.addBagel(bagel1);
        Assertions.assertFalse(basket.addBagel(bagel2));
    }

    @Test
    public void testSetCapacity() {
        Basket basket = new Basket(10);
        Assertions.assertEquals(basket.getCapacity(), 10);

        basket.setCapacity(5);
        Assertions.assertFalse(basket.getCapacity() == 10);
        Assertions.assertTrue(basket.getCapacity() == 5);
    }

    @Test
    public void testCheckExists() {
        Basket basket = new Basket(10);
        Assertions.assertTrue(basket.checkExists());
    }

}
