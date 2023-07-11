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

}
