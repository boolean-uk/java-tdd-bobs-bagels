package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> basket;
    Integer capacity = 5;

    public Basket() {
        this.basket = new ArrayList<>(capacity);
    }
    public String addBagel(String bagel) {
        int size = this.basket.size() + 1;
        if (size < this.capacity) {
            if (this.basket.contains(bagel)) {
                return "Bagel already in basket";
            }
            this.basket.add(bagel);
            return "Bagel added to basket";
        } else {
            return "Basket is full";
        }
    }

    public String removeBagel(String bagel) {
        if (this.basket.contains(bagel)) {
            this.basket.remove(bagel);
            return "Bagel removed";
        }
        return "Bagel not in basket";
    }

    public String checkBasketSize() {
        if (this.basket.size() <= this.capacity) {
            return "Basket is not full";
        }
        return "Basket is full";
    }

    public int changeBasketSize(int newCapacity) {
        this.capacity = newCapacity;
        return this.capacity;
    }
}