package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    public int capacity;
    public int noOfItems;
    public HashMap<String, Integer> items;

    public Basket() {
        capacity = 3;
        noOfItems = 0;
        items = new HashMap<>();
    }
    public boolean add(String bagel) {
        if(noOfItems == capacity) {
            return false;
        }
        if(items.containsKey(bagel)) {
            items.put(bagel, items.get(bagel)+1);
        } else {
            items.put(bagel, 1);
        }
        noOfItems++;
        return true;
    }
}
