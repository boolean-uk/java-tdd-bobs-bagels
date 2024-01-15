package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    public ArrayList<String> bagels;
    public int capacity;

    public Basket(int capacity) {
        this.capacity = capacity;
        this.bagels = new ArrayList<>();
    }

    public boolean order(String name) {
        if(bagels.size() < this.capacity) {
            bagels.add(name);
            return true;
        }
        return false;
    }
    public String delete(String name) {
        bagels.remove(name);
        return name + " has been deleted";
    }
    public void expand(int newSize) {

    }
}
