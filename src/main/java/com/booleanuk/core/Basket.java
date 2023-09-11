package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    public int maxCapacity = 4;
    public ArrayList<String> list = new ArrayList<>(maxCapacity);

    public String addBagel(String type) {
        if (list.contains(type)) {
            return "This type already exists in the basket";
        }
        list.add(type);
        return "Added";
    }

    public String removeBagel(String type) {
        if (!list.contains(type)) {
            return "This type does not exist";
        }
        list.remove(type);
        return "Removed";
    }

    public boolean isBasketFull() {
        return list.size() >= maxCapacity;
    }

    public String increaseCapacity(int newCapacity) {
        if (newCapacity <= maxCapacity) {
            return "Enter a bigger number";
        }
        maxCapacity = newCapacity;
        list.ensureCapacity(newCapacity);
        return "Done";
    }
}
