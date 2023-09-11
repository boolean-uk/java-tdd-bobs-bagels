package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void simpleAddShouldAlwaysSucceed() {
        Basket bagels = new Basket();
        Assertions.assertTrue(bagels.contents.contains("Plain"));
        bagels.add("Blueberry");
        Assertions.assertTrue(bagels.contents.contains("Blueberry"));
    }

    @Test
    public void removeKnownValueShouldAlwaysSucceed() {
        Basket bagels = new Basket();
        Assertions.assertTrue(bagels.contents.contains("Plain"));
        bagels.remove("Plain");
        Assertions.assertFalse(bagels.contents.contains("Plain"));
    }

    @Test
    public void addShouldCheckCapacityFirstAndReturnValueAccordingly() {
        Basket bagels = new Basket();
        //Current size is 3 and capacity is 4, so we can add a bagel.
        Assertions.assertTrue(bagels.add("Blueberry"));
        //Now size is 4 so adding another bagel shouldn't be allowed.
        Assertions.assertFalse(bagels.add("Multigrain"));
    }
}
