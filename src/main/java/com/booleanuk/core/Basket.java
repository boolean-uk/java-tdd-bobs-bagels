package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> bagels;
    int capacity;
    int total;

    public Basket() {
        this.total = 0;
        this.capacity = 5;
        this.bagels = new HashMap<>();
    }

    public String add(String bagelType, int count){
        if (!isOverfilled(count)) {
            this.bagels.put(bagelType,  count);
            this.total += count;
            return "bagel added";
        }
        return "overfilled cart";
    }

    public String add(String bagelType){
        if (!isOverfilled(1)) {
            this.bagels.put(bagelType,  1);
            this.total += 1;
            return "bagel added";
        }
        return "overfilled cart";
    }

    public boolean isOverfilled(int count){
        return count + this.total > this.capacity;
    }


}
