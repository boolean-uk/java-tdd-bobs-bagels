package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BagelTest {
    @Test
    public void testAddBagel() {
        Basket basket = new Basket();
        Bagel plainBagel = new Bagel("plain");

        basket.addBagel(plainBagel);

        Assertions.assertEquals(1, basket.getSize());
        Assertions.assertTrue(basket.containsBagel(plainBagel));
    }

    @Test
    public void testGetSize() {
        Basket basket = new Basket(5);
        Bagel plainBagel = new Bagel("plain");
        Bagel sesameBagel = new Bagel("sesame");

        basket.addBagel(plainBagel);
        basket.addBagel(sesameBagel);
        int size = basket.getSize();

        Assertions.assertEquals(2, size);
    }

    @Test
    public void testRemoveBagel() {
        Basket basket = new Basket();
        Bagel plainBagel = new Bagel("plain");
        basket.addBagel(plainBagel);

        basket.removeBagel(plainBagel);

        Assertions.assertEquals(0, basket.getSize());
        Assertions.assertFalse(basket.containsBagel(plainBagel));
    }








}
