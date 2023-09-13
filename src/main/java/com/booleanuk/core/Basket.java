package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    public int capacity;
    public List<String> bagels;

    public Basket(int capacity) {
        this.capacity = capacity;
        this.bagels = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity > 0 && capacity > bagels.size()) {
            this.capacity = capacity;
        }
    }

    public List<String> getBagels() {
        return bagels;
    }

    public void removeBagel(String bagel) {
        bagels.remove(bagel);
    }

    public boolean basketFull() {
        return bagels.size() == capacity;
    }

    public void addBagel(String bagel) {
        if (!basketFull()) {
            bagels.add(bagel);
        } else {
            System.out.println("Basket full");
        }
    }
}
