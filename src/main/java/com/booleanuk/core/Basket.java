package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Arrays;

public class Basket {
    public ArrayList<String> inventory;
    public ArrayList<String> bagelsBasket;
    public int capacity;

    public Basket(int capacity) {
        this.inventory = new ArrayList<>(Arrays.asList("Sourdough",
                "Blueberry", "Apple", "Cinnamon Raisin",
                "Chocolate Chip", "Onion"));
        this.bagelsBasket = new ArrayList<>();
        this.capacity = capacity;
    }

    public boolean add(String product) {
        if (this.bagelsBasket.contains(product)) {
            return false;
        }
        if (this.inventory.contains(product) && this.bagelsBasket.size() < this.capacity) {
            this.bagelsBasket.add(product);
            return true;
        }
        return false;
    }

    public boolean remove(String product) {
        return this.bagelsBasket.remove(product);
    }

    public boolean isFull() {
       return this.bagelsBasket.size()==capacity;
    }
}
