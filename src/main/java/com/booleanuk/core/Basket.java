package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> basket = new ArrayList<>();
    Integer basketSize = 1;

    public String addBagel(String bagel){

        if (basket.size() >= this.basketSize)
            return "Basket is full.";

        basket.add(bagel);
        return "Bagel added successfully.";
    }
}
