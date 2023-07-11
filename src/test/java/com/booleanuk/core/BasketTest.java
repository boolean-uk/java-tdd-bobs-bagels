package com.booleanuk.core;

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
        Basket basket = new Basket(5);
        assertEquals("Added item to basket, you can add 3 items more", basket.addItem(BAGEL1,2));
        assertEquals("Added item to basket, you can add 0 items more", basket.addItem(BAGEL2,3));
        assertEquals("Basket is full", basket.addItem(BAGEL3,2));

    }

    @Test
    public void removeItemTest(){
        Basket basket = new Basket(10);
        basket.addItem(BAGEL1,2);
        basket.addItem(BAGEL2,3);
        basket.addItem(BAGEL3, 4);

        assertTrue(basket.removeItem(BAGEL1, 1));
        assertTrue(basket.removeItem(BAGEL1, 1));
        assertTrue(basket.removeItem(BAGEL2, 3));
        assertTrue(basket.removeItem(BAGEL3, 5));
        assertFalse(basket.removeItem("x", 3));
    }

}
