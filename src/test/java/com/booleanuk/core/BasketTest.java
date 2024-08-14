package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void addBagelTest(){
        Basket b = new Basket();
        b.basketSize = 1;

        String expectedSuccess = "Bagel added successfully.";
        String expectedFail = "Basket is full.";

        String testSuccess = b.addBagel("Cream");
        String testFail = b.addBagel("Chocolate");

        Assertions.assertEquals(expectedSuccess, testSuccess);
        Assertions.assertEquals(expectedFail, testFail);
    }

    @Test
    public void removeBagelTest(){
        Basket b = new Basket();

        b.addBagel("Chocolate");

        String expectedSuccess = "Bagel successfully removed from basket.";
        String expectedFail = "This bagel is not in your basket.";

        String testSuccess = b.removeBagel("Chocolate");
        String testFail = b.removeBagel("Cream");

        Assertions.assertEquals(expectedSuccess, testSuccess);
        Assertions.assertEquals(expectedFail, testFail);
    }

    @Test
    public void changeBasketCapacityTest(){
        Basket b = new Basket();
        b.basketSize = 1;

        String basketIsNotFull = "Bagel added successfully.";
        String basketIsFull = "Basket is full.";

        // Triggers basket is full error
        b.addBagel("Cheese");
        String failString = b.addBagel("Chocolate");

        // Verifies basket is full error
        Assertions.assertEquals(basketIsFull, failString);

        // Changes capacity of basketCapacity and verifies equality
        int newBasketCapacity = 2;
        b.changeBasketCapacity(newBasketCapacity);
        Assertions.assertEquals(newBasketCapacity, b.basketSize);

        // Repeat first test to demonstrate that the basket has increased
        String successString = b.addBagel("Chocolate");
        Assertions.assertEquals(basketIsNotFull, successString);

        // Test to see if function returns true
        Assertions.assertTrue(b.changeBasketCapacity(3));
    }
}
