package com.booleanuk.core;

import java.util.HashMap;

public class Basket {

    HashMap<String, Double> bagels;

    public Basket() {
        this.bagels = new HashMap<>();
    }

    public boolean add(String type, double price){
        if (bagels.containsKey(type)) {
            return false;
        }
        bagels.put(type, price);
        return true;
    }

    public boolean remove(String type) {
        if (bagels.isEmpty()) {
            return false;
        } else {
            if (!bagels.containsKey(type)) {
                return false;
            }
            bagels.remove(type);
            return true;
        }
    }
}
