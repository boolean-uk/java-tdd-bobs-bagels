package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagel() {
        // Test for successfully added Bagel
        Basket basket = new Basket();
        Assertions.assertTrue(basket.addBagel("Avocado"));
        Assertions.assertTrue(basket.bagels.contains("Avocado"));

        // Test for failure
        basket.addBagel("Smoked Salmon");
        basket.addBagel("Hummus");
        Assertions.assertFalse(basket.addBagel("Grondboontjeboter"));
        Assertions.assertFalse(basket.bagels.contains("Grondboontjeboter"));
    }
}
