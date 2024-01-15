package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    public int capacity;
    public int noOfItems;
    public HashMap<String, Integer> items;
    public HashMap<String, Integer> prices;
    public int cost;

    public Basket() {
        capacity = 3;
        noOfItems = 0;
        items = new HashMap<>();
        prices = new HashMap<>();
        prices.put("vanilla", 5);
    }
    public boolean add(String bagel) {
        if(noOfItems >= capacity) {
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

    public boolean remove(String bagel) {
        Integer noOfBagels = items.get(bagel);
        if(noOfBagels == null) {
            return false;
        }
        noOfItems--;
        if(noOfBagels == 0) {
            items.remove(bagel);
        } else {
            items.put(bagel, noOfBagels-1);
        }
        return true;
    }

    public boolean updateCapacity(int newCapacity) {
        if(newCapacity >= noOfItems) {
            capacity = newCapacity;
            return true;
        }
        return false;
    }

    public int getCost() {
        int cost = 0;
        for(String bagel: items.keySet()) {
            cost += prices.get(bagel)*items.get(bagel);
        }
        return cost;
    }
}
