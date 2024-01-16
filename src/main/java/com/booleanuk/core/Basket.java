package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    private int maxCapcity = 5;
    private final ArrayList<String> items = new ArrayList<>();

    public boolean add(String bagelName) {
        return true;
    }

    public boolean remove(String bagelName) {
        return true;
    }

    public void changeBasketCapacity(int capacity) {

    }

    public int getCapacity() {
        return maxCapcity;
    }
}
