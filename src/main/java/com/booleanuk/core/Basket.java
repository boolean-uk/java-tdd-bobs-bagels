package com.booleanuk.core;

import java.util.HashMap;
public class Basket {
public HashMap<String, Integer> bagelList;
public int capacity;

    public Basket() {
        this.bagelList = new HashMap<>();
        this.capacity = 3;
    }

    public boolean add(String item, int price) {

        if (this.bagelList.containsKey(item)) {
            return false;
        }
        this.bagelList.put(item, price);
        return true;
    }

    public String remove(String item) {
        if (this.bagelList.containsKey(item)) {
            return "Item successfully removed";
        } else {
            return "This item is not in the basket";
        }
    }
    public String capacity() {
        if (bagelList.size() >= capacity) {
            return "You have reached the capacity of the basket.";
        }
        return "you have space";
    }

    public int change(int newCap) {
        this.capacity = newCap;
        return this.capacity;
    }
}
