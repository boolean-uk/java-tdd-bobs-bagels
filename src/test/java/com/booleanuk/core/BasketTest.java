package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAdd(){
        Basket basket = new Basket();
        boolean response = basket.add("Whole wheat");
        Assertions.assertTrue(response);
    }
}
