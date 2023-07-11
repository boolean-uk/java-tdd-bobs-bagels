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
        if (amount <= 0 || amount + currentAmount > capacity || !availableBagels.containsKey(bagelType))
            return false;
        if (bagelsCount.containsKey(bagelType))
            bagelsCount.put(bagelType, bagelsCount.get(bagelType) + amount);
        else
            bagelsCount.put(bagelType, amount);
        currentAmount += amount;
        return true;
    }
    public boolean remove(String bagelType, int amount) {
        if (amount <= 0 || !bagelsCount.containsKey(bagelType) || bagelsCount.get(bagelType) < amount)
            return false;
        bagelsCount.put(bagelType, bagelsCount.get(bagelType) - amount);
        if (bagelsCount.get(bagelType) == 0)
            bagelsCount.remove(bagelType);
        currentAmount -= amount;
        return true;
    }
    public boolean changeCapacity(int newCapacity) {
        if (newCapacity < currentAmount || newCapacity == 0)
            return false;
        capacity = newCapacity;
        return true;
    }
    public int totalCost() {
        int cost = 0;
        for (String bagelType : bagelsCount.keySet()) {
            cost += bagelsCount.get(bagelType) * availableBagels.get(bagelType);
        }
        return cost;
    }
    public boolean addBagelType(String bagelType, int cost) {
        if (availableBagels.containsKey(bagelType) || cost <= 0)
            return false;
        availableBagels.put(bagelType, cost);
        return true;
    }
    public boolean changeBagelPrice(String bagelType, int newCost) {
        if (!availableBagels.containsKey(bagelType) || newCost <= 0)
            return false;
        availableBagels.put(bagelType, newCost);
        return true;
    }
}
