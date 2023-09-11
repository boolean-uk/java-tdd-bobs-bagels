package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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

        boolean found = basket.search(bagelInventory, bagelType);
        Assertions.assertTrue(found);
    }

}
