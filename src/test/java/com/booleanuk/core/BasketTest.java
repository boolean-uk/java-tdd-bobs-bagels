package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddItems(){
        Basket basket = new Basket(5);

        boolean response = basket.addItem("A");
        Assertions.assertTrue(response);
        response = basket.addItem("B");
        Assertions.assertTrue(response);
        response = basket.addItem("C");
        Assertions.assertTrue(response);

        Assertions.assertEquals(3,basket.bagels.size());



    }
}
