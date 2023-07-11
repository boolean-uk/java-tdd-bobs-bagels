package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BasketTest {

    private Basket basket;

    @BeforeEach
    public void setup() {
        basket = new Basket(5);
    }

    @Test
    public void testAddBagel() {
        basket.add("Sweet");
        Assertions.assertEquals(1 ,basket.getBagels().size());
        Assertions.assertTrue(basket.getBagels().contains("Sweet"));
    }

    @Test
    public void testRemoveBagel() {
        basket.add("Sweet");
        basket.remove("Sweet");
        Assertions.assertEquals(0 ,basket.getBagels().size());
        Assertions.assertFalse(basket.getBagels().contains("Sweet"));
    }

    @Test
    public void testIsFullBagel() {
        Assertions.assertFalse(basket.isFull());
        basket.add("Sweet");
        basket.add("S");
        basket.add("Sw");
        basket.add("Swe");
        basket.add("Swee");

        Assertions.assertTrue(basket.isFull());

        basket.add("Sweett");

        Assertions.assertEquals(5 ,basket.getBagels().size());
        Assertions.assertFalse(basket.getBagels().contains("Sweett"));
    }

    @Test
    public void testChangeCapacityBagel() {
        Assertions.assertEquals(5, basket.getCapacity());

        basket.changeCapacity(7);

        Assertions.assertEquals(7, basket.getCapacity());

        basket.changeCapacity(3);

        Assertions.assertEquals(3, basket.getCapacity());
    }

    @Test
    public void testCheckIfExistBagel() {
        basket.add("Sweet");
        Assertions.assertEquals(1 ,basket.getBagels().size());
        Assertions.assertTrue(basket.getBagels().contains("Sweet"));

        basket.remove("Swee");

        Assertions.assertTrue(basket.checkIfExists("Sweet"));
        Assertions.assertFalse(basket.checkIfExists("Swee"));

    }

    @Test
    public void testGetBagelCountExistBagel() {
        basket.add("Sweet");
        Assertions.assertEquals(1 ,basket.getBagelCount());
        Assertions.assertTrue(basket.getBagels().contains("Sweet"));

        basket.remove("Swee");

        Assertions.assertEquals(1 ,basket.getBagelCount());

        basket.add("Sweet2");

        Assertions.assertEquals(2 ,basket.getBagelCount());

        basket.remove("Sweet");

        Assertions.assertEquals(1 ,basket.getBagelCount());
    }

    @Test
    public void testHasBagel() {
        basket.add("Sweet");
        Assertions.assertTrue(basket.checkIfExists("Sweet"));
        Assertions.assertFalse(basket.checkIfExists("Swe"));
    }

    @Test
    public void testFreeSpaceBagel() {
        basket.add("Sweet");
        Assertions.assertEquals(4, basket.freeSpace());

        basket.remove("Sweet");

        Assertions.assertEquals(5, basket.freeSpace());
    }

    @Test
    public void testgetBagels() {
        basket.add("Sweet");

        Assertions.assertEquals(1, basket.getBagels().size());

        basket.add("Sweet2");

        Assertions.assertEquals(2, basket.getBagels().size());
        Assertions.assertTrue(basket.getBagels().contains("Sweet"));
        Assertions.assertTrue(basket.getBagels().contains("Sweet2"));
        Assertions.assertFalse(basket.getBagels().contains("Sweet23"));

    }

    @Test
    public void testClearBagels() {
        basket.add("Sweet");
        basket.add("Sweet2");
        basket.add("Sweet3");

        Assertions.assertEquals(3, basket.getBagels().size());

        basket.clearBasket();

        Assertions.assertEquals(0, basket.getBagels().size());
    }
}

