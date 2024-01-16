package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class Basket {
    private Map<String, Double> items;
    private int capacity;
    private int managerCode = 1234;

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

    public boolean isNotEmpty(String bagel){
        if (items.containsKey(bagel)) {
            return true;
        } else {
            return false;
        }
    }
    public void remove(String bagel) {
        if (items.containsKey(bagel)) {
            items.remove(bagel);
        } System.out.println("Bagel not in basket.");
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public boolean isManager(int password) {
        return password == managerCode;
    }
}

