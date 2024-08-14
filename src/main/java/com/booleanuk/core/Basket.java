package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    private final int DEFAULT_CAPACITY = 10; // Assuming basket has capacity of 10 from beginning

    ArrayList<String> bagels;
    private int capacity;

    public Basket() {
        this.bagels = new ArrayList<>();
        this.capacity = this.DEFAULT_CAPACITY;
    }

    public boolean add(String bagel) {
        if (this.bagels.contains(bagel) || this.bagels.size() == this.capacity) {
            return false;
        }
        this.bagels.add(bagel);
        return true;
    }

    public boolean remove(String bagel) {
        return this.bagels.remove(bagel);
    }

    public boolean isFull() {
        return this.bagels.size() == this.capacity;
    }

    public boolean changeCapacity(int newCapcity, int userType) {
        if (newCapcity < 0 || newCapcity < this.bagels.size() || userType != 0) return false;

        this.capacity = newCapcity;
        return true;
    }

}
