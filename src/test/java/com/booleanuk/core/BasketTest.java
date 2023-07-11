package com.booleanuk.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    private Basket basket;

    @BeforeEach
    public void setup() {
        basket = new Basket(5);
    }

    @Test
    public void testAddBagel() {
        basket.add("Sweet");
        assertEquals(1 ,basket.getBagels().size());
        assertTrue(basket.getBagels().contains("Sweet"));
        basket.add("Sweet1");
        basket.add("Sweet2");
        basket.add("Sweet3");
        basket.add("Sweet4");
        basket.add("Sweet5");
        assertEquals(5,basket.getBagels().size());
        assertFalse(basket.getBagels().contains("Sweet5"));


    }

    @Test
    public void testRemoveBagel() {
        basket.add("Sweet");
        basket.remove("Sweet");
        assertEquals(0 ,basket.getBagels().size());
        assertFalse(basket.getBagels().contains("Sweet"));
    }

    @Test
    public void testIsFullBagel() {
        assertFalse(basket.isFull());
        basket.add("Sweet");
        basket.add("S");
        basket.add("Sw");
        basket.add("Swe");
        basket.add("Swee");

        assertTrue(basket.isFull());

        basket.add("Sweett");

        assertEquals(5 ,basket.getBagels().size());
        assertFalse(basket.getBagels().contains("Sweett"));
    }

    @Test
    public void testChangeCapacityBagel() {
        assertEquals(5, basket.getCapacity());

        basket.changeCapacity(7);

        assertEquals(7, basket.getCapacity());
        basket.add("Sweet");
        basket.add("Sweet1");
        basket.add("Sweet2");
        basket.add("Sweet3");

        basket.changeCapacity(3);

        assertEquals(7, basket.getCapacity());
    }

    @Test
    public void testCheckIfExistBagel() {
        basket.add("Sweet");
        assertEquals(1 ,basket.getBagels().size());
        assertTrue(basket.getBagels().contains("Sweet"));

        basket.remove("Swee");

        assertTrue(basket.checkIfExists("Sweet"));
        assertFalse(basket.checkIfExists("Swee"));

    }

    @Test
    public void testGetBagelCount() {
        basket.add("Sweet");
        assertEquals(1 ,basket.getBagelCount());
        assertTrue(basket.getBagels().contains("Sweet"));

        basket.remove("Swee");

        assertEquals(1 ,basket.getBagelCount());

        basket.add("Sweet2");

        assertEquals(2 ,basket.getBagelCount());

        basket.remove("Sweet");

        assertEquals(1 ,basket.getBagelCount());
    }

    @Test
    public void testHasBagel() {
        basket.add("Sweet");
        assertTrue(basket.checkIfExists("Sweet"));
        assertFalse(basket.checkIfExists("Swe"));
    }

    @Test
    public void testFreeSpaceBagel() {
        basket.add("Sweet");
        assertEquals(4, basket.freeSpace());

        basket.remove("Sweet");

        assertEquals(5, basket.freeSpace());
    }

    @Test
    public void testGetBagels() {
        basket.add("Sweet");

        assertEquals(1, basket.getBagels().size());

        basket.add("Sweet2");

        assertEquals(2, basket.getBagels().size());
        assertTrue(basket.getBagels().contains("Sweet"));
        assertTrue(basket.getBagels().contains("Sweet2"));
        assertFalse(basket.getBagels().contains("Sweet23"));

    }

    @Test
    public void testClearBagels() {
        basket.add("Sweet");
        basket.add("Sweet2");
        basket.add("Sweet3");

        assertEquals(3, basket.getBagels().size());

        basket.clearBasket();

        assertEquals(0, basket.getBagels().size());
    }
}

