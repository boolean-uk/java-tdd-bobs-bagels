package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Basket {
    public ArrayList<String> inventory;
    public ArrayList<String> basket;
    public int capacity;

    public Basket(int capacity) {
        this.inventory = new ArrayList<>(Arrays.asList("Sourdough",
                "Blueberry", "Apple", "Cinnamon Raisin",
                "Chocolate Chip", "Onion"));
        this.basket = new ArrayList<>();
        this.capacity = capacity;
    }

    public boolean add(String product) {
        if (basket.contains(product)) {
            return false;
        }
        if (this.inventory.contains(product) && this.basket.size() < this.capacity) {
            this.basket.add(product);
            return true;
        }
        return false;
    }
}
