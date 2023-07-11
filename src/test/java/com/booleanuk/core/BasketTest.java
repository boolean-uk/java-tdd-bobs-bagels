package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BasketTest {

    @Test
    public void testAddItem(){
        Basket basket = new Basket(5);
        assertEquals("Added item to basket, you can add 3 items more", basket.addItem("Bagel1",2));
        assertEquals("Added item to basket, you can add 0 items more", basket.addItem("Bagel2",3));
        assertEquals("Basket is full", basket.addItem("Bagel1",2));

    }

}
