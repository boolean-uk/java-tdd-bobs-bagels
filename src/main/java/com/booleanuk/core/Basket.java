package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final int capacity;
    private final List<String> bagels;

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

    public void removeBagel(String bagel2) {
        int index = bagels.lastIndexOf(bagel2);
        if (index != -1) {
            bagels.remove(index);
        }
    }

    public boolean isBasketFull() {
        return bagels.size() == capacity;
    }
    public void addBagel(String bagel) {
        if (!isBasketFull()) {
            bagels.add(bagel);
        } else {
            System.out.println("Basket is full");
        }
    }
}
