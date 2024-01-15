package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<String> basket;
    private int capacity;

    public Basket() {
        this.basket = new ArrayList<>();
        this.capacity = 5;
    }

    public boolean add(String bagel) {
        if (this.isFull()) {
            return false;
        }
        return basket.add(bagel);
    }

    public boolean remove(String bagel) {
        return basket.remove(bagel);
    }

    public boolean isFull() {
        return basket.size() >= capacity;
    }

    public ArrayList<String> getBasket() {
        return basket;
    }
}
