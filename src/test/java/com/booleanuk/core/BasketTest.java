package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BasketTest {

    @Test
    public void canAddBagelToEmpty() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("Bagel", 1));


    }

    @Test
    public void canAddSeveralBagelToEmpty() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("Bagel", 1));
        Assertions.assertTrue(basket.add("B", 2));
        Assertions.assertTrue(basket.add("Bag", 3));


    }


    @Test
    public void cantAddEmptyBagel() {
        Basket basket = new Basket();
        Assertions.assertFalse(basket.add("", 1));


    }


    @Test
    public void cantAddSameBagel() {
        Basket basket = new Basket();
        basket.add("Bagel", 1);
        Assertions.assertFalse(basket.bagels.containsKey("Bagel"));

    }


    @Test
    public void canRemoveBagel() {
        Basket basket = new Basket();
        basket.add("Bagel", 1);
        boolean result = basket.remove("Bagel", 1);
        Assertions.assertTrue(result);

    }

    @Test
    public void removeNonExistingBagel() {
        Basket basket = new Basket();
        basket.bagels.put("Bagel", 1);
        Assertions.assertFalse(basket.remove("Bag", 1));
    }

    @Test
    public void isRemoved() {
        Basket basket = new Basket();
        basket.bagels.put("Bagel", 1);
        basket.remove("Bagel", 1);
        Assertions.assertTrue(basket.bagels.isEmpty());
    }

    @Test
    public void limitBagel() {
        Basket basket = new Basket();
        basket.setLimit(5);
        Assertions.assertEquals(5, basket.limit);
    }

    @Test
    public void limitBagelOneAddOneBagel() {
        Basket basket = new Basket();
        basket.add("Bagel", 1);
        basket.add("Ba", 2);
        basket.setLimit(3);
        Assertions.assertTrue(basket.add("Bag", 3));


    }

}
