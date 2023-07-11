package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    private final HashMap<String, Integer> bagels;

    public Basket() {
        this.bagels = new HashMap<>();
    }

    public boolean add(String bagel, int i) {
        bagels.put(bagel, i);

        return true;
    }
}
