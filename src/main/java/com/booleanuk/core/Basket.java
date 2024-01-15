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

    public boolean remove(String item) {
        if (this.bagelList.containsKey(item)) {
            bagelList.remove(item);
            return true;
        } else {
            System.out.println("This item is not in the basket");
            return false;
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
