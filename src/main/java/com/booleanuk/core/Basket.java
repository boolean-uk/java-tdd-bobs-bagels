package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Bagel> items;
    private int capacity;

    public Basket(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    public boolean addBagel() {
        if (this.items.size() >= capacity) {
           return false;
        } else {
            items.add(new Bagel("Cheese", 10, 1));
            return true;
        }
    }
    public static void main(String[] args) {

    }
}
