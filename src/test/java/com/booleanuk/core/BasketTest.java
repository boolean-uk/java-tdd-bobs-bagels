package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BasketTest {

    @Test
    void addToBasketWorks() {
        Basket basket = new Basket();
        List<String> bagelInventory = new ArrayList<>();
        bagelInventory.add("plain");
        bagelInventory.add("egg");
        bagelInventory.add("blueberry");
        bagelInventory.add("cinnamon");
        bagelInventory.add("sourDough");
        String bagelType = "sourDough";
        List<String> BagelBasket = new ArrayList<>();

//        These tests test if the bagel is found in the inventory

//      This test passes because sourDough is in the bagelInventory
        boolean found = basket.search(bagelInventory, bagelType);
        Assertions.assertTrue(found);
//      Another way to write this: Assertions.assertTrue(basket.search(bagelInventory, "sourDough"));

//        these test pass because the outcome is indeed false, there are no bagels like this in the inventory
        Assertions.assertFalse(basket.search(bagelInventory, "chocolate"));
        Assertions.assertFalse(basket.search(bagelInventory, " "));

//        This test if the bagel was added successfully
        basket.addToBagelBasket(bagelInventory, bagelType);
        Assertions.assertTrue(basket.addToBagelBasket(BagelBasket, bagelType));
    }
}
