package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addShouldBeTrueAndCorrectType() {
        Basket basket = new Basket();
        basket.capacity = 3;
        String name = "Bagel1";


        Assertions.assertTrue(basket.add(name,2));
        Assertions.assertEquals(2, basket.bagelTypes.get(name));

        basket.add(name,1);
        Assertions.assertEquals(3, basket.bagelTypes.get(name));
    }


    @Test
    public void addShouldBeFalse() {
        Basket basket = new Basket();
        basket.capacity = 1;

        Assertions.assertFalse(basket.add("Bagel1",2));
    }

    @Test
    public void removeShouldBeTrue() {
        Basket basket = new Basket();
        basket.capacity = 3;
        String name = "Bagel1";
        basket.add(name,2);

        Assertions.assertTrue(basket.remove(name,1));
        Assertions.assertEquals(1,basket.bagelTypes.get(name));
    }

    @Test
    public void removeShouldBeFalse() {
        Basket basket = new Basket();
        basket.capacity = 3;
        String name = "Bagel1";

        Assertions.assertFalse(basket.remove(name,1));

        basket.add(name,2);
        Assertions.assertFalse(basket.remove(name,3));
    }

    @Test
    public void updateBasketCapacityTest() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.updateBasketCapacity(5));

        Assertions.assertFalse(basket.updateBasketCapacity(0));
        Assertions.assertFalse(basket.updateBasketCapacity(-5));
    }
}
