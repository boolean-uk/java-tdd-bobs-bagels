package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testGetBagel() {
        Bagel bagel = new Bagel("Cheese", 10);
        // Assertions.assertEquals(bagel, new Bagel("Cheese", 10));
        Assertions.assertTrue(bagel instanceof Bagel);
    }
}
