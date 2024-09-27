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
    public void addBagelCheck()
    {
        basket = new Basket(1);
        String bagel = "Plain";
        basket.addBagel(bagel);
        Assertions.assertTrue(basket.getBagels().contains(bagel));
    }

    @Test
    public void removeBagelCheck()
    {
        basket = new Basket(3);
        String bagel = "Plain";
        String bagel2 = "Garlic";
        String bagel3 = "Onion";
        basket.addBagel(bagel);
        basket.addBagel(bagel2);
        basket.addBagel(bagel3);
        basket.removeBagel(bagel3);

        Assertions.assertEquals(2,basket.getBagels().size());
    }
    @Test
    public void basketFullCheck()
    {
        basket = new Basket(0);
        String bagel = "Plain";
        String bagel2 = "Garlic";
        basket.addBagel(bagel);
        basket.addBagel(bagel2);

        Assertions.assertFalse(basket.getBagels().contains(bagel2));
    }

    @Test
    public void changeBasketCheck()
    {
        basket = new Basket(0);
        int newCapacity = 3;
        basket.setCapacity(newCapacity);

        Assertions.assertEquals(newCapacity, basket.getCapacity());
    }
    @Test
    public void shouldPrintInfoThatBasketIsFull()
    {
        basket = new Basket(1);
        System.setOut(new PrintStream(outputStreamCaptor));
        String bagel = "Plain";
        String bagel2 = "Garlic";
        basket.addBagel(bagel);
        basket.addBagel(bagel2);

        Assertions.assertEquals("Basket full", outputStreamCaptor.toString().trim());
    }
}

