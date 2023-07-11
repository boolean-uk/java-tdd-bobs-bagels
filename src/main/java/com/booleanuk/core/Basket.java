package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    private final HashMap<String, Integer> bagels;

    public Basket() {
        this.bagels = new HashMap<>();
    }

    public boolean add(String bagel, int quantity) {
        if(this.bagels.containsKey(bagel)){
            int newQuantity = this.bagels.get(bagel) + quantity;
            this.bagels.put(bagel, newQuantity);
        } else {
            bagels.put(bagel, quantity);
        }

        return true;
    }

    public HashMap<String, Integer> getBagels() {
        return bagels;
    }
}
