package com.booleanuk.core;

import java.util.HashMap;

public class Basket {


    public HashMap<String, Integer> bagels;


    int limit;


    public Basket() {
        this.limit = 4;
        this.bagels = new HashMap<>();
    }

    public boolean add(String bagel, int i) {

        if (bagel.isBlank() || (this.bagels.size() + i) > limit) {
            return false;
        } else {
            this.bagels.put(bagel, i);
        }
        return true;
    }

    public boolean remove(String bagel, int i) {
        if (!this.bagels.containsKey(bagel) || this.bagels.get(bagel) < i) {
            return false;
        } else {
            this.bagels.remove(bagel);
        }
        return true;
    }

    public void setLimit(int numberOf) {

        this.limit = numberOf;
    }
}
