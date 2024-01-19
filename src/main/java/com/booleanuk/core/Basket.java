package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    private int maxCapcity = 5;
    private ArrayList<String> items = new ArrayList<>();

    public boolean add(String bagelName) {
        if (items.contains(bagelName) || maxCapcity < items.size()) return false;
        items.add(bagelName);
        return true;
    }

    public boolean remove(String bagelName) {
        if (!items.contains(bagelName)) return false;
        items.remove(bagelName);
        return true;
    }

    public void changeBasketCapacity(int capacity) {
        if (capacity <= 0) return;

        maxCapcity = capacity;

        if (maxCapcity < items.size()) {
            ArrayList<String> _newItemListing = new ArrayList<>();

            for (int i = 0; i < maxCapcity; i++)
                _newItemListing.add(items.get(i));

            items = _newItemListing;
        }
    }

    public int getCapacity() {
        return maxCapcity;
    }

    public String getItemsAsString() {
        StringBuilder _sb = new StringBuilder();
        for (String item : items)
            _sb.append(" - ").append(item).append("\n");
        return _sb.toString();
    }
}
