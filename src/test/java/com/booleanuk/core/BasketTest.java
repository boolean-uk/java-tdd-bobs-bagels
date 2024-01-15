package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BasketTest {
    private ArrayList<String> setupTestArray() {
        ArrayList<String> testArray = new ArrayList<>();
        testArray.add("Plain");
        //testArray.add("Pumpernickel");
        //testArray.add("Chocolate chip");
        return testArray;
    }

    @Test
    public void canAddBagelToBasket() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.add("Plain"));
        Assertions.assertEquals(setupTestArray(), basket.getBasket());
    }
}
