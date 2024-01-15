package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    public ArrayList<String> bagels;

    public Basket() {
        this.bagels = new ArrayList<>();
    }

    public boolean add(String bagel) {
        return bagels.add(bagel);
    }

    public boolean remove(String bagel) {
        return bagels.remove(bagel);
    }

    public boolean isFull() {
        return (bagels.size() >= 2);
    }
}
