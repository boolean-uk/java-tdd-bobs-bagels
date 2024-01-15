package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BasketTest {

    @Test
    public void testAddBagelInEmptyBasket() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.addBagel("Blueberry"));
    }

    @Test
    public void testAddBagelToFullBasket() {
        Basket basket = new Basket();

        basket.addBagel("Blueberry");
        basket.addBagel("Cinnamon");
        basket.addBagel("Egg");
        basket.addBagel("Everything");
        basket.addBagel("Blueberry");

        Assertions.assertFalse(basket.addBagel("Plain"));
    }

    @Test
    public void testRemoveBagelFromEmptyBasket() {
        Basket basket = new Basket();

        Assertions.assertFalse(basket.removeBagel("Cinnamon"));
    }

    @Test
    public void testRemoveBagelFromBasketReturnTrue() {
        Basket basket = new Basket();

        basket.addBagel("Blueberry");
        basket.addBagel("Cinnamon");
        basket.addBagel("Egg");

        Assertions.assertTrue(basket.removeBagel("Blueberry"));
    }

    @Test
    public void testRemoveBagelFromBasketReturnFalse() {
        Basket basket = new Basket();

        basket.addBagel("Blueberry");
        basket.addBagel("Cinnamon");
        basket.addBagel("Egg");

        Assertions.assertFalse(basket.removeBagel("Plain"));
    }

    @Test
    public void testChangeCapacity() {
        Basket basket = new Basket();

        Assertions.assertEquals(10, basket.changeBasketCapacity(10));
    }

    @Test
    public void testLowerCapacity() {
        Basket basket = new Basket();

        Assertions.assertEquals(4, basket.changeBasketCapacity(4));
    }

    @Test
    public void testChangeCapacityAndAddBagels() {
        Basket basket = new Basket();

        basket.addBagel("Blueberry");
        basket.addBagel("Cinnamon");
        basket.addBagel("Egg");
        basket.addBagel("Everything");
        basket.addBagel("Blueberry");

        Assertions.assertFalse(basket.addBagel("Plain"));

        basket.changeBasketCapacity(10);

        Assertions.assertTrue(basket.addBagel("Blueberry"));

        basket.addBagel("Egg");
        basket.addBagel("Chocolate");
        basket.addBagel("Everything");
        basket.addBagel("Sugar");

        Assertions.assertFalse(basket.addBagel("Plain"));
    }

    @Test
    public void testOutputAddToFullBasket() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Basket basket = new Basket();
        basket.addBagel("Blueberry");
        basket.addBagel("Cinnamon");
        basket.addBagel("Egg");
        basket.addBagel("Everything");
        basket.addBagel("Blueberry");

        basket.addBagel("Plain");
        Assertions.assertEquals("Basket is full!\n", outContent.toString());
    }

    @Test
    public void testOutputRemoveBagelNotInBasket() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Basket basket = new Basket();
        basket.addBagel("Blueberry");
        basket.addBagel("Cinnamon");
        basket.addBagel("Egg");

        basket.removeBagel("Plain");
        Assertions.assertEquals("That bagel is not in the basket!\n", outContent.toString());
    }
}
