package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private int capacity;
    private List<String> bagels;

    public Basket(int capacity) {
        this.capacity = capacity;
        this.bagels = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<String> getBagels() {
        return bagels;
    }

    public void setBagels(List<String> bagels) {
        this.bagels = bagels;
    }

    public void add(String bagel) {
        if (isFull()) System.out.println("Basket is full!");
        else bagels.add(bagel);
    }

    public void remove(String bagel) {
        bagels.remove(bagel);
    }

    public boolean isFull() {
        return bagels.size() >= capacity;
    }
}
