package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> basket = new ArrayList<>();
    Integer basketSize = 1;

    public String addBagel(String bagel) {

        // If the size of the basket is equal to or larger
        if (basket.size() == this.basketSize)
            return "Basket is full.";

        basket.add(bagel);
        return "Bagel added successfully.";
    }

    public String removeBagel(String bagel) {

        if (!basket.contains(bagel)) {
            return "This bagel is not in your basket.";
        }

        basket.remove(bagel);
        return "Bagel successfully removed from basket.";
    }

    public void changeBasketSize(Integer newBasketSize) {
        this.basketSize = newBasketSize;
    }
}

