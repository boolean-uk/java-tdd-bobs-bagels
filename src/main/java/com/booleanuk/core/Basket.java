package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    public ArrayList<String> bagels;

    public Basket() {
        this.bagels = new ArrayList<>();
    }

    public boolean add(String bagel) {
        if (bagels.contains(bagel)) {
            return false;
        } else {
            bagels.add(bagel);
            return true;
        }
    }
}
