package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testGetBagel() {
        Bagel bagel = new Bagel();
        Assertions.assertEquals(bagel, new Bagel());
    }
}
