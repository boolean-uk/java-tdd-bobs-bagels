package com.booleanuk.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

class BasketTest {

    Basket basket;

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        basket = new Basket();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void testAdd() {
        basket.add("First bagel");
        Assertions.assertEquals(1, basket.getBagels().size());
        Assertions.assertTrue(basket.getBagels().contains("First bagel"));
    }

    @Test
    public void testRemove() {
        basket.add("First bagel");
        basket.add("Second bagel");
        basket.add("Third bagel");
        basket.remove("Second bagel");

        Assertions.assertEquals(2, basket.getBagels().size());
        Assertions.assertFalse(basket.getBagels().contains("Second bagel"));
        Assertions.assertEquals(List.of("First bagel", "Third bagel"), basket.getBagels());
    }

    @Test
    public void testIsFull() {
        basket.add("First bagel");
        basket.add("Second bagel");
        Assertions.assertFalse(basket.isFull());
        basket.add("Third bagel");
        Assertions.assertTrue(basket.isFull());
    }

    @Test
    public void testAddingWhenFull() {
        basket.add("First bagel");
        basket.add("Second bagel");
        basket.add("Third bagel");

        Assertions.assertEquals(3, basket.getBagels().size());

        basket.add("Fourth bagel");

        Assertions.assertEquals(3, basket.getBagels().size());
        Assertions.assertFalse(basket.getBagels().contains("Fourth bagel"));

        Assertions.assertEquals("Basket is full.", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testSetCapacity() {
        basket.add("First bagel");
        basket.add("Second bagel");
        basket.add("Third bagel");
        basket.setCapacity(4);
        basket.add("Fourth bagel");
        Assertions.assertEquals(4, basket.getCapacity());
        Assertions.assertEquals(4, basket.getBagels().size());
        Assertions.assertTrue(basket.getBagels().contains("Fourth bagel"));

        basket.setCapacity(1);

        Assertions.assertEquals("You cannot change capacity.", outputStreamCaptor.toString().trim());
        Assertions.assertEquals(4, basket.getCapacity());
    }

    @Test
    public void testIfBagelExist() {
        basket.add("First bagel");
        basket.add("Second bagel");
        basket.add("Third bagel");

        Assertions.assertTrue(basket.doesBagelExist("Second bagel"));
        Assertions.assertFalse(basket.doesBagelExist("Fourth bagel"));
    }

    @Test
    public void testRemovingWhenDoesNotExist() {
        basket.add("First bagel");
        basket.add("Second bagel");
        basket.add("Third bagel");

        Assertions.assertEquals(3, basket.getBagels().size());
        basket.remove("Fourth bagel");

        Assertions.assertEquals("Bagel does not exist.", outputStreamCaptor.toString().trim());

        Assertions.assertEquals(3, basket.getBagels().size());
        basket.remove("Second bagel");
        Assertions.assertEquals(2, basket.getBagels().size());
    }

    @Test
    public void testEmptyBasket() {
        basket.add("First bagel");
        basket.add("Second bagel");
        basket.add("Third bagel");

        Assertions.assertEquals(3, basket.getBagels().size());

        basket.empty();

        Assertions.assertEquals(0, basket.getBagels().size());
    }

    @Test
    public void testGetAvailableCapacity() {
        basket.add("First bagel");
        basket.add("Second bagel");

        Assertions.assertEquals(1, basket.getAvailableCapacity());
    }

    @Test
    public void testCheckPrice() {
        Assertions.assertEquals(8.99, basket.checkPrice());
        Assertions.assertNotEquals(2.99, basket.checkPrice());
    }

    @Test
    public void testSetPrice() {
        basket.setPrice(7.99);
        Assertions.assertEquals(7.99, basket.checkPrice());
        basket.setPrice(0);
        Assertions.assertEquals("Price must be greater than 0.", outputStreamCaptor.toString().trim());
        Assertions.assertEquals(7.99, basket.checkPrice());

        outputStreamCaptor.reset();

        basket.setPrice(-2.78);
        Assertions.assertEquals("Price must be greater than 0.", outputStreamCaptor.toString().trim());
        Assertions.assertEquals(7.99, basket.checkPrice());
    }

    @Test
    public void testGetTotalPrice() {
        Assertions.assertEquals(0, basket.getTotalPrice());

        basket.add("First bagel");
        basket.add("Second bagel");
        basket.add("Third bagel");

        Assertions.assertEquals(26.97, basket.getTotalPrice());
    }

    @Test
    public void testOfferDiscount() {
        basket.add("First bagel");
        basket.add("Second bagel");
        Assertions.assertEquals(16.18, basket.offerDiscount(10));


        Assertions.assertEquals(16.18, basket.offerDiscount(100));
        Assertions.assertEquals("Discount cannot be greater or equal to 100%.", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        Assertions.assertEquals(16.18, basket.offerDiscount(120));
        Assertions.assertEquals("Discount cannot be greater or equal to 100%.", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

        Assertions.assertEquals(16.18, basket.offerDiscount(-20));
        Assertions.assertEquals("Discount must be greater than 0%.", outputStreamCaptor.toString().trim());
    }

}
