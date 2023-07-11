package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void AddingBagelTest()
    {
        Basket basket = new Basket();
        String bagel = "bagel";
        basket.add(bagel);
        Assertions.assertEquals(basket.bagelsBasket.get(0),bagel);
    }
    @Test
    public void RemovingBagelTest()
    {
        Basket basket = new Basket();
        String bagel = "bagel";
        String bagel1 = "bagel1";
        basket.add(bagel);
        basket.add(bagel1);
        basket.remove(bagel);
        Assertions.assertFalse(basket.bagelsBasket.contains(bagel));
    }
    @Test
    public void OverfillingBasketTest()
    {
        Basket basket = new Basket(2);
        String bagel = "bagel";
        String bagel1 = "bagel1";
        String bagel2 = "bagel2";
        basket.add(bagel);
        basket.add(bagel1);
        Assertions.assertFalse(basket.add(bagel2));
    }
    @Test
    public void ChangingCapacityTest()
    {
        Basket basket = new Basket(2);
        int newCapacity = 5;
        basket.changeCapacity(newCapacity);
        Assertions.assertEquals(newCapacity, basket.capacity);
    }

}
