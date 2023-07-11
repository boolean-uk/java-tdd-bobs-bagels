package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final int capacity;
    private final List<String> bagels;

    public void addBagel(String bagel) {
        if (bagels.size() < capacity) {
            bagels.add(bagel);
        }
    }

    public Basket(int capacity) {
        this.capacity = capacity;
        this.bagels = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<String> getBagels() {
        return bagels;
    }
}
