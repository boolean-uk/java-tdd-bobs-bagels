package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> items;
    int capacity;

    public Basket() {
        this.items = new ArrayList<>();
        this.capacity = 3;
    }

    public boolean isFull() {
        return this.items.size() >= this.capacity;
    }

    public boolean add(String bagel) {
        if (!this.isFull())
            return this.items.add(bagel);
        return false;
    }

    public boolean remove(String bagel) {
        return this.items.remove(bagel);
    }

    public boolean changeCapacity(int capacity) {
        if (capacity >= 0 && this.items.size() <= capacity) {
            this.capacity = capacity;
            return true;
        }
        return false;
    }

}
