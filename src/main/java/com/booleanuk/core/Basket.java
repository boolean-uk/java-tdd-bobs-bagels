package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<String, Double> items;
    private int capacity;

    public Basket() {
        this.items = new HashMap<>();
        this.capacity = 6;
    }

    public void add(String bagel, double price) {
        items.put(bagel, price);
    }
    public boolean isFull() {
        return items.size() >= capacity;
    }

    public Map<String, Double> getItems() {
        return items;
    }
}

