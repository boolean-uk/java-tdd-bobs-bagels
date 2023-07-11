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
    public void RemovingBagelFromEmptyBasketTest()
    {
        Basket basket = new Basket();
        String bagel = "bagel";
        Assertions.assertFalse(basket.remove(bagel));
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
    public void ChangingCapacityManagerTest()
    {
        Basket basket = new Basket(2);
        int newCapacity = 5;
        basket.isManager = true;
        basket.changeCapacity(newCapacity);
        Assertions.assertEquals(newCapacity, basket.capacity);
    }

    @Test
    public void ChangingCapacityNotManagerTest()
    {
        int oldCapacity = 2;
        Basket basket = new Basket(oldCapacity);
        int newCapacity = 5;
        basket.isManager = false;
        basket.changeCapacity(newCapacity);
        Assertions.assertEquals(oldCapacity, basket.capacity);
    }

    @Test
    public void RemovingNonExistingBagelTest()
    {
        Basket basket = new Basket();
        String bagel = "bagel";
        String bagel1 = "bagel1";
        String bagel2 = "bagel2";
        basket.add(bagel);
        basket.add(bagel1);
        Assertions.assertFalse(basket.remove(bagel2));
    }

    @Test
    public void AddingToBasketBagelNotInMenuTest()
    {
        Basket basket = new Basket();
        String bagel = "bagel";
        String bagel1 = "bagel1";
        String bagel3 = "bagel3";
        basket.add(bagel);
        basket.add(bagel1);
        Assertions.assertFalse(basket.add(bagel3));
    }

    @Test
    public void AddingToMenuManagerTest()
    {
        Basket basket = new Basket();
        basket.isManager = true;
        String bagel = "bagelbagel";
        basket.addToMenu(bagel);
        Assertions.assertTrue(basket.menu.contains(bagel));
    }

    @Test
    public void AddingToMenuNotManagerTest()
    {
        Basket basket = new Basket();
        basket.isManager = false;
        String bagel = "bagelbagel";
        basket.addToMenu(bagel);
        Assertions.assertFalse(basket.menu.contains(bagel));
    }

    @Test
    public void RemovingFromMenuManagerTest()
    {
        Basket basket = new Basket();
        basket.isManager = true;
        String bagel = "bagel";
        basket.removeFromMenu(bagel);
        Assertions.assertFalse(basket.menu.contains(bagel));
    }

    @Test
    public void RemovingFromMenuNotManagerTest()
    {
        Basket basket = new Basket();
        basket.isManager = false;
        String bagel = "bagel";
        basket.removeFromMenu(bagel);
        Assertions.assertTrue(basket.menu.contains(bagel));
    }

}
