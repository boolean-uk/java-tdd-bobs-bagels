package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testIfAddAddsBagelsProperly(){
        Basket basket = new Basket();

        Assertions.assertEquals(("1 Plain bagel added to basket"), basket.add("Plain", 1));
        Assertions.assertEquals(("3 Sesame bagel added to basket"),basket.add("Sesame", 3));
        Assertions.assertTrue(basket.items.containsKey("Plain"));
        Assertions.assertEquals(basket.items.get("Plain"), 1);
        Assertions.assertTrue(basket.items.containsKey("Sesame"));
        Assertions.assertEquals(basket.items.get("Sesame"), 3);


    }


}
