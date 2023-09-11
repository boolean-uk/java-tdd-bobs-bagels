package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BasketTest {

    @Test
    void searchForBagelType() {
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
        assertTrue(found);
//      Another way to write this: Assertions.assertTrue(basket.search(bagelInventory, "sourDough"));

//        these test pass because the outcome is indeed false, there are no bagels like this in the inventory
        Assertions.assertFalse(basket.search(bagelInventory, "chocolate"));
        Assertions.assertFalse(basket.search(bagelInventory, " "));
    }
        @Test
        void addBagelTypeWorks() {
            Basket basket = new Basket();
            List<String> bagelInventory = new ArrayList<>();
            bagelInventory.add("plain");
            bagelInventory.add("egg");
            bagelInventory.add("blueberry");
            bagelInventory.add("cinnamon");
            bagelInventory.add("sourDough");
            String bagelType = "sourDough";
            List<String> BagelBasket = new ArrayList<>();

            Assertions.assertTrue(basket.add(BagelBasket, bagelType));
        }
    }

