package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<String> basket;
    private int capacity;

    public Basket() {
        this.basket = new ArrayList<>();
        this.capacity = 5;
    }
    public Basket(int capacity) {
        this.basket = new ArrayList<>();
        this.capacity = capacity;
    }

    public boolean add(String bagel) {
        if (this.isFull()) {
            return false;
        }
        return this.basket.add(bagel);
    }

    public boolean remove(String bagel) {
        return this.basket.remove(bagel);
    }

    public boolean isFull() {
        return this.basket.size() >= this.capacity;
    }

    public ArrayList<String> getBasket() {
        return this.basket;
    }

    public void setCapacity(int capacity) {
        // TODO Add checks for "capacity < 0" and "capacity < basket.size()"
        this.capacity = capacity;
    }
}
