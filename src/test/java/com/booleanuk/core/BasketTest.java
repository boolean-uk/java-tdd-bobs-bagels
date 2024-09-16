package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    void checkBasketMethods() {
        Basket basket = new Basket();


        // Check adding bagels to the list
        Assertions.assertTrue(basket.add("chocolate"));
        Assertions.assertTrue(basket.add("Vanilla"));
        Assertions.assertTrue(basket.add("orange"));

        Assertions.assertFalse(basket.add("Chocolate"));
        Assertions.assertFalse(basket.add("vanilla"));

        // Check removing bagels from the list
        Assertions.assertEquals(basket.bagelList.size(),3);
        Assertions.assertTrue(basket.remove("Chocolate"));
        Assertions.assertEquals(basket.bagelList.size(),2);

        Assertions.assertTrue(basket.remove("vanilla"));
        Assertions.assertEquals(basket.bagelList.size(),1);

        Assertions.assertTrue(basket.add("Vanilla"));
        Assertions.assertTrue(basket.add("chocolate"));

        Assertions.assertFalse(basket.remove("peanut"));

        //Check setting the capacity
        Assertions.assertTrue(basket.setCapacity(5));
        Assertions.assertFalse(basket.setCapacity(-3));
        Assertions.assertFalse(basket.setCapacity(0));

        //Check if basket is full
        Assertions.assertEquals(basket.bagelList.size(),3);
        Assertions.assertTrue(basket.setCapacity(3));
        Assertions.assertFalse(basket.checkIfFull());
        Assertions.assertTrue(basket.add("peanut"));
        Assertions.assertTrue(basket.checkIfFull());

    }

}
