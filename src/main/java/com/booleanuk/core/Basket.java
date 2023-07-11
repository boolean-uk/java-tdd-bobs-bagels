package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    public HashMap<String, Integer> availableBagels;
    public HashMap<String, Integer> bagelsCount;
    public int capacity;
    public int currentAmount;
    Basket(int capacity) {
        availableBagels = new HashMap<String, Integer>();
        bagelsCount = new HashMap<String, Integer>();
        this.capacity = capacity;
        currentAmount = 0;
        addDefaultBagelTypes();
    }
    private void addDefaultBagelTypes() {
        availableBagels.put("Plain", 3);
        availableBagels.put("Sourdough", 4);
        availableBagels.put("Cinnamon", 5);
        availableBagels.put("Everything", 6);
    }
    public boolean add(String bagelType, int amount) {
        return true;
    }
    public boolean remove(String bagelType, int amount) {
        return true;
    }
    public boolean changeCapacity(int newCapacity) {
        capacity = newCapacity;
        return true;
    }
    public int totalCost() {
        return 0;
    }
    public boolean addBagelType(String bagelType, int cost) {
        return true;
    }
    public boolean changeBagelPrice(String bagelType, int newCost) {
        return true;
    }
}
