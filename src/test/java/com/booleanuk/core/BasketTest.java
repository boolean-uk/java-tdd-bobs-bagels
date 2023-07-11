package com.booleanuk.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    private static String BAGEL1;
    private static String BAGEL2;
    private static String BAGEL3;

    @BeforeAll
    static void setup() {
        BAGEL1 = "Bagel1";
        BAGEL2 = "Bagel2";
        BAGEL3 = "Bagel3";
    }

    @Test
    public void testAddItem(){
        Basket basket = new Basket(6);
        assertEquals("Added item to basket, you can add 4 items more",
                basket.addItem(BAGEL1,2));
        assertEquals("Added item to basket, you can add 3 items more",
                basket.addItem(BAGEL1,1));
        assertEquals("Added item to basket, but basket is full",
                basket.addItem(BAGEL2,3));
        assertEquals("Basket is full",
                basket.addItem(BAGEL3,2));
    }

    @Test
    public void testAddNegativeQuantity(){
        Basket basket = new Basket(6);
        assertEquals("You cannot add item with negative quantity",
                basket.addItem(BAGEL1,-2));
        assertEquals("You cannot add item with quantity equals to zero",
                basket.addItem(BAGEL1,0));
    }

    @Test
    public void removeItemTest(){
        Basket basket = new Basket(10);
        basket.addItem(BAGEL1,2);
        basket.addItem(BAGEL2,3);
        basket.addItem(BAGEL3, 4);

        assertFalse(basket.removeItem(BAGEL1, -3));
        assertFalse(basket.removeItem(BAGEL2, 0));
        assertTrue(basket.removeItem(BAGEL1, 1));
        assertTrue(basket.removeItem(BAGEL1, 1));
        assertTrue(basket.removeItem(BAGEL2, 3));
        assertTrue(basket.removeItem(BAGEL3, 5));
        assertFalse(basket.removeItem("example", 3));
    }
    @Test
    public void  isFullTest(){
        Basket basket = new Basket(6);
        basket.addItem(BAGEL1,3);
        assertFalse(basket.isFull());
        basket.addItem(BAGEL2,3);
        assertTrue(basket.isFull());
    }

    @Test
    public void getCapacityTest() {
        Basket basket1 = new Basket(1);
        Basket basket2 = new Basket(2);
        Basket basket3 = new Basket(3);

        assertEquals(1, basket1.getCapacity());
        assertEquals(2, basket2.getCapacity());
        assertEquals(3, basket3.getCapacity());
    }

    @Test
    public void changeCapacityTest() {
        Basket basket = new Basket(); // size = 5
        basket.addItem(BAGEL1,2);
        basket.addItem(BAGEL2,3);

        basket.changeCapacity(6);
        assertEquals(6, basket.getCapacity());
        assertEquals("Added item to basket, but basket is full",
                basket.addItem(BAGEL3,1));

        basket.changeCapacity(3);
        assertTrue(basket.isFull());
        assertEquals(3, basket.getCapacity());

        basket.changeCapacity(0);
        assertEquals(3, basket.getCapacity());

        basket.changeCapacity(-1);
        assertEquals(3, basket.getCapacity());
    }
}
