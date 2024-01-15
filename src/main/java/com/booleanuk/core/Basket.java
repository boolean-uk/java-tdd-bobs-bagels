package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    public ArrayList<String> bagelsList = new ArrayList<>();
    int basketCapacity = 4;
    boolean basketIsFull = false;

    public Basket() {
        this.bagelsList = new ArrayList<>();
    }

    public boolean add(String bagel) {
        if (bagelsList.size() == basketCapacity) {
            System.out.println("Basket is full");
            return false;
        } else {
            return this.bagelsList.add(bagel);
        }

    }

    public boolean remove(String bagel) {
        return this.bagelsList.remove(bagel);

    }


}

