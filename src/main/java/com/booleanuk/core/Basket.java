package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    public ArrayList<String> basket = new ArrayList<>();
    public int capacity = 2;

    public boolean add(String bagel) {
        if(this.basket.contains(bagel) || this.capacity == this.basket.size()){
            return false;
        }
        this.basket.add(bagel);
        return true;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean setCapacity(int newCapacity) {
        if(newCapacity<this.basket.size()){
            return false;
        }
        this.capacity=newCapacity;
        return true;
    }

    public boolean remove(String bagel) {
        if(!this.basket.contains(bagel)){
            return false;
        }
        this.basket.remove(bagel);
        return true;

    }
}
