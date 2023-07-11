package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<String> bagles;
    private int capacity;
    public Basket(int capacity) {
        bagles = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addToBasket(String bagle) {
        if(capacity > bagles.size()) {
            bagles.add(bagle);
            System.out.println("Spaces left in basket: " + (capacity - bagles.size()));
        }

    }

    public List<String> getAllBagles() {
        return bagles;
    }

}
