package com.booleanuk.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BasketTest {
    Basket basket;
    private static String bagel;
    private static String bagel2 = "bagel2";
    private static String bagel3 = "bagel3";

    private static ArrayList<String> bagels;

    @BeforeAll
    static void testSetup() {
        bagel = "bagel1";
        bagel2 = "bagel2";
        bagel3 = "bagel1";
        bagels.add(bagel);
        bagels.add(bagel2);
        bagels.add(bagel3);
    }

    @AfterEach
    void resetTodoList() {
        bagels.clear();
    }

    @Test
    public void orderBagelTest() {
        Assertions.assertTrue(basket.addBagel("bagel1"));
    }

    @Test
    public void removeBagelTest() {
        bagels.addBagel("bagel2");
        bagels.removeBagel("bagel2");
        Assertions.assertTrue(bagels.getAllBagels().isEmpty());
    }

    @Test
    public void checkIsBasketFullWhenBasketIsFullTest() {
        String bagel = "bagel4";
        String bagel2 = "bagel4";
        bagels.add(bagel);
        bagels.add(bagel2);

        Assertions.assertTrue(basket.isBasketFull(bagels));
    }

    @Test
    public void checkIsBasketFullWhenBasketIsNotFullTest() {
        Assertions.assertFalse(basket.isBasketFull(bagels));
    }
}

