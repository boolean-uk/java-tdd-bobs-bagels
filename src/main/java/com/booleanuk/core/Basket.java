package com.booleanuk.core;

import java.util.HashMap;

public class Basket {

    HashMap<String, Double> bagels;
    int capacity;

    public Basket() {
        this.bagels = new HashMap<>();
        this.capacity = 3;
    }

    public boolean add(String type, double price){
        if (bagels.containsKey(type)) {
            return false;
        }
        bagels.put(type, price);
        return true;
    }

    public boolean remove(String type) {
        if (bagels.isEmpty()) {
            return false;
        } else {
            if (!bagels.containsKey(type)) {
                return false;
            }
            bagels.remove(type);
            return true;
        }
    }

    public boolean isFull() {
        if (bagels.size() == 0) {
            return false;
        }
        return bagels.size() >= capacity;
    }

    public boolean setCapacity(int newCapacity) {
        if (capacity == newCapacity) {
            return false;
        }
        this.capacity = newCapacity;
        return true;
    }

    public int getCapacity() {
        return capacity;
    }
}
