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
    public void testAddBeyondCapacity() {
        // Given
        Basket basket = new Basket(2); // Assuming capacity is set in constructor
        Bagel plainBagel = new Bagel("plain");
        Bagel sesameBagel = new Bagel("sesame");
        Bagel poppyBagel = new Bagel("poppy");

        // When
        basket.addBagel(plainBagel);
        basket.addBagel(sesameBagel);
        basket.addBagel(poppyBagel); // Should throw exception

    }

}
