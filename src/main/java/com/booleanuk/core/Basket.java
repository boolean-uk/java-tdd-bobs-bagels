package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> basketContents;
    int basketLimit;

    public Basket() {
        this.basketContents = new HashMap<>();
        this.basketLimit = 3;
    }

    public boolean add(String name, int num) {
        if (name.isBlank() || (this.basketContents.size()+ num) > basketLimit) {return false;}
        this.basketContents.put(name, num);
        return true;
    }

    public boolean remove(String name, int num) {
        if (name.isBlank() || !this.basketContents.containsKey(name) || this.basketContents.get(name) < num) {return false;}
        if (this.basketContents.get(name) > num) {
            this.basketContents.put(name,this.basketContents.get(name)-num);
        }
        this.basketContents.remove(name);
        return true;
    }

    public void setBasketLimit(int capacity) {
        this.basketLimit = capacity;
    }

    public String display() {
        return this.basketContents.toString().replaceAll("[{}.]", "").replace(", ", "\n").replace("=", ": ");
    }
}
