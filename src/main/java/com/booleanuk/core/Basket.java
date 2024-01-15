package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> items;
    int capacity;

    public Basket() {
        this.items = new ArrayList<>();
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

}
