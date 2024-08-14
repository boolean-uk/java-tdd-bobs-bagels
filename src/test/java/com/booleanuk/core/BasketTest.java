package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    Basket basket = new Basket();

    @Test
    public void testOrderExists(){
        Assertions.assertFalse(basket.order(""));
    }

    @Test
    public void testBagelsExist(){
        Assertions.assertFalse(basket.bagels.isEmpty());
    }

    @Test
    public void testOrderFunction(){
        Assertions.assertFalse(basket.order(("bagelFour")));
    }

    @Test
    public void testOrderedBagelsExist(){
        Assertions.assertTrue(basket.orderedBagels.isEmpty());
    }

    @Test
    public void testOrderAddsToOrderedBagels(){
        basket.order("bagelOne");
        Assertions.assertTrue(basket.orderedBagels.contains("bagelOne"));
    }

    @Test
    public void testRemoveExists(){
        basket.order("bagelOne");
        Assertions.assertTrue(basket.remove("bagelOne"));
    }

    @Test
    public void testRemoveFunction(){
        basket.order("bagelOne");
        Assertions.assertTrue(basket.orderedBagels.contains("bagelOne"));
        Assertions.assertFalse(basket.remove("bagelTwo"));
        Assertions.assertTrue(basket.remove("bagelOne"));
        Assertions.assertFalse(basket.remove("bagelOne"));
        Assertions.assertFalse(basket.orderedBagels.contains("bagelOne"));
    }

    @Test
    public void testFullFunction(){
        Assertions.assertFalse(basket.full());
    }

    @Test
    public void testSetCapacityFunction(){
        Assertions.assertTrue(basket.setCapacity(15));
        Assertions.assertEquals(15, basket.capacity);
    }
}
