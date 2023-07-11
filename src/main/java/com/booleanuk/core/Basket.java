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

    }

    public List<String> getAllBagles() {
        return bagles;
    }

}
