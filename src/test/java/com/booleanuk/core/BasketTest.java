package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testNewBagel() {
        Bagel bagel = new Bagel("Cheese", 10, 1);
        // Assertions.assertEquals(bagel, new Bagel("Cheese", 10));
        Assertions.assertTrue(bagel instanceof Bagel);
    }
    @Test
    public void testGetBagelType() {
        Bagel bagel = new Bagel("Cheese", 10, 1);
        Assertions.assertEquals(bagel.getType(), "Cheese");
        Assertions.assertNotEquals(bagel.getType(), "Ham");
    }
    @Test
    public void testGetBagelCost() {
        Bagel bagel = new Bagel("Cheese", 10, 1);
        Assertions.assertEquals(bagel.getCost(), 10);
        Assertions.assertNotEquals(bagel.getCost(), 15);
    }


}
