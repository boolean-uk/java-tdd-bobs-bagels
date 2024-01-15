package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> basketContents;

    public Basket() {
        this.basketContents = new HashMap<>();
    }

    public boolean add(String name) {
        if (name.isBlank()) {return false;}
        this.basketContents.put(name, 1);
        return true;
    }
}
