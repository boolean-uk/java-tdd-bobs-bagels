package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<String> bagels = new ArrayList<>();
    int capacity = 3;

    public List<String> getBagels() {
        return bagels;
    }

    public void add(String bagel){
        if(isFull()) {
            System.out.println("Basket is full.");
            return;
        }
        bagels.add(bagel);
    }

    public void remove(String bagel) {
        bagels.remove(bagel);
    }

    public boolean isFull(){
        if (bagels.size() < capacity) return false;
        else return true;
    }

    public void setCapacity(int newCapacity){
        capacity = newCapacity;
    }

    public boolean doesBagelExist(String bagel) {
        return bagels.contains(bagel);
    }
}
