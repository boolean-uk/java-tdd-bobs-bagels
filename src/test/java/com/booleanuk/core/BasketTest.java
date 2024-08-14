package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void addBagelTest(){
        Basket b = new Basket();
        b.basketSize = 1;

        // Expected return strings
        String expectedSuccess = "Bagel added successfully.";
        String expectedFail = "Basket is full.";

        // Resulting strings from addBagel execution
        String testSuccess = b.addBagel("Cream");
        String testFail = b.addBagel("Chocolate");

        Assertions.assertEquals(expectedSuccess, testSuccess);
        Assertions.assertEquals(expectedFail, testFail);
    }

    @Test
    public void removeBagelTest(){
        Basket b = new Basket();
        b.addBagel("Chocolate");

        // Expected return strings
        String expectedSuccess = "Bagel successfully removed from basket.";
        String expectedFail = "This bagel is not in your basket.";

        // Resulting strings from removeBagel execution
        String testSuccess = b.removeBagel("Chocolate");
        String testFail = b.removeBagel("Cream");

        Assertions.assertEquals(expectedSuccess, testSuccess);
        Assertions.assertEquals(expectedFail, testFail);
    }

    @Test
    public void changeBasketSizeTest(){
        Basket b = new Basket();
        b.basketSize = 1;

        String basketIsNotFull = "Bagel added successfully.";
        String basketIsFull = "Basket is full.";

        // Triggers basket is full error
        b.addBagel("Cheese");
        String failString = b.addBagel("Chocolate");

        // Verifies basket is full error
        Assertions.assertEquals(basketIsFull, failString);

        // Changes size of basketSize and verifies equality
        int newBasketSize = 2;
        b.changeBasketSize(newBasketSize);
        Assertions.assertEquals(newBasketSize, b.basketSize);

        // Repeat first test to demonstrate that the basket has increased
        String successString = b.addBagel("Chocolate");
        Assertions.assertEquals(basketIsNotFull, successString);
    }
}
