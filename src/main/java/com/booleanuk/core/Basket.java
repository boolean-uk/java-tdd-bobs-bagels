package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Bagel> items;
    private int capacity;

    public Basket(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    public boolean addBagel(Bagel bagel) {
        if (this.items.size() >= capacity) {
           return false;
        } else {
            items.add(bagel);
            return true;
        }
    }

    public boolean removeBagel(Bagel bagel) {
        if (!this.items.contains(bagel)) {
            return false;
        } else {
            this.items.remove(bagel);
            return true;
        }
    }
    public static void main(String[] args) {

    }
}
