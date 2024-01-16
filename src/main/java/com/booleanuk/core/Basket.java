package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    private int maxCapcity = 5;
    private final ArrayList<String> items = new ArrayList<>();

    public boolean add(String bagelName) {
        if (items.contains(bagelName)) return false;
        items.add(bagelName);
        return true;
    }

    public boolean remove(String bagelName) {
        if (!items.contains(bagelName)) return false;
        items.remove(bagelName);
        return true;
    }

    public void changeBasketCapacity(int capacity) {
        maxCapcity = capacity;
    }

    public int getCapacity() {
        return maxCapcity;
    }
}
