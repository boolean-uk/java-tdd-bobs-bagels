package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> basketContents;
    int basketLimit;

    public Basket() {
        this.basketContents = new HashMap<>();
        this.basketLimit = 3;
    }

    public boolean add(String name) {
        if (name.isBlank() || this.basketContents.size() >= basketLimit) {return false;}
        this.basketContents.put(name, 1);
        return true;
    }

    public boolean remove(String name) {
        if (name.isBlank()) {return false;}
        this.basketContents.remove(name);
        return true;
    }

    public void setBasketLimit(int capacity) {
        this.basketLimit = capacity;
    }
}
