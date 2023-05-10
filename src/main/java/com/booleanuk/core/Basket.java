package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<String> bagels;
    int capacity;

    public Basket(int capacity){
        this.bagels = new ArrayList<>();
        this.capacity = capacity;
    }

    public boolean add(String bagelType) {
        if(bagels.size() < capacity) {
            bagels.add(bagelType);
            return true;
        }
        System.out.println("Basket is full");
        return false;
    }

    public boolean remove(String bagelType) {
        if (bagels.size() == 0) {
            System.out.println("Did you lose your sanity?");
            return false;
        }
        return bagels.remove(bagelType);
    }

    public void setCapacity(int capacity) {
        if (capacity > this.capacity)
            this.capacity = capacity;
    }
}
