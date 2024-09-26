package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BasketTest
{
    private Basket basket;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    public void addBagelToFullBasketCheck()
    {
        basket = new Basket(2);
        String bagel1 = "apple";
        String bagel2 = "orange";
        String bagel3 = "tomato";

        basket.addBagel(bagel1);
        basket.addBagel(bagel2);
        basket.addBagel(bagel3);

        Assertions.assertFalse(basket.getBagels().contains(bagel3));
    }


    @Test
    public void removeBagelCheck()
    {
        basket = new Basket(3);
        String bagel1 = "apple";
        String bagel2 = "orange";
        String bagel3 = "tomato";
        basket.addBagel(bagel1);
        basket.addBagel(bagel2);

        basket.removeBagel(bagel3);

        Assertions.assertTrue(basket.getBagels().contains(bagel1));
        Assertions.assertTrue(basket.getBagels().contains(bagel2));
    }

    @Test
    public void changeBasketCapacityCheck()
    {
        basket = new Basket(3);
        int newCapacity = 5;
        basket.setCapacity(newCapacity);

        Assertions.assertEquals(newCapacity, basket.getCapacity());
    }
    @Test
    public void addAndRemoveDifferentBagelsCheck() {
        basket = new Basket(3);
        String bagel1 = "apple";
        String bagel2 = "orange";
        String bagel3 = "tomato";
        basket.addBagel(bagel1);
        basket.addBagel(bagel2);
        basket.removeBagel(bagel1);

        Assertions.assertTrue(basket.getBagels().contains(bagel2));
        Assertions.assertFalse(basket.getBagels().contains(bagel1));
    }

}