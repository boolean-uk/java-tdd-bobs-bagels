package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
  @Test
  public void testAddBagel() {
    Basket basket = new Basket();
    basket.add(Bagel.Plain);
    Assertions.assertEquals(basket.size(), 1);
    basket.add(Bagel.Rainbow);
    Assertions.assertEquals(basket.size(), 2);
  }

  @Test
  public void testAddBagelToFullBasket() {
    Basket basket = new Basket();
    Assertions.assertEquals(basket.capacity, 3);

    Assertions.assertTrue(basket.add(Bagel.Plain));
    Assertions.assertTrue(basket.add(Bagel.Rainbow));
    Assertions.assertTrue(basket.add(Bagel.Egg));

    Assertions.assertFalse(basket.add(Bagel.Egg));
    Assertions.assertEquals(basket.capacity, 3);
  }

  @Test
  public void testRemoveBagel() {
    Basket basket = new Basket();
    basket.add(Bagel.Plain);
    basket.add(Bagel.Plain);
    basket.add(Bagel.Rainbow);

    Assertions.assertTrue(basket.remove(Bagel.Plain));
    Assertions.assertTrue(basket.remove(Bagel.Plain));
  }

  @Test
  public void testRemoveNonExistingBagel() {
    Basket basket = new Basket();
    Assertions.assertFalse(basket.remove(Bagel.Plain));
    Assertions.assertFalse(basket.remove(Bagel.Rainbow));
    Assertions.assertFalse(basket.remove(Bagel.Egg));
  }

  @Test
  public void testSetCapacity() {
    Basket basket = new Basket();
    Assertions.assertEquals(basket.capacity, 3);
    Assertions.assertTrue(basket.add(Bagel.Plain));
    Assertions.assertTrue(basket.add(Bagel.Rainbow));
    Assertions.assertTrue(basket.add(Bagel.Egg));
    Assertions.assertFalse(basket.add(Bagel.Egg));

    basket.setCapacity(5);
    Assertions.assertEquals(basket.capacity, 5);

    Assertions.assertTrue(basket.add(Bagel.Egg));
    Assertions.assertTrue(basket.add(Bagel.Egg));
    Assertions.assertFalse(basket.add(Bagel.Rainbow));
  }
}
