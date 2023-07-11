package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    private final HashMap<String, Integer> items;
    private int capacity;
    private int currentLoad;

    public Basket(){
        this.items = new HashMap<>();
        this.capacity = 5;
        this.currentLoad = 0;
    }

    public Basket(int capacity){
        this.items = new HashMap<>();
        this.capacity = capacity;
        this.currentLoad = 0;

    }

    public String addItem(String item, int quantity){
        if(quantity < 0)
            return "You cannot add item with negative quantity";
        if(quantity == 0)
            return "You cannot add item with quantity equals to zero";

        if (capacity-currentLoad>=quantity){
            currentLoad+=quantity;
            items.put(item,quantity);
            if (capacity-currentLoad == 0)
                return "Added item to basket, but basket is full";
            return "Added item to basket, you can add " + String.valueOf(capacity-currentLoad) + " items more";
        }
        return "Basket is full";
    }

    public boolean removeItem(String item, int quantity) {
        if(!items.containsKey(item) || quantity <= 0)
            return false;

        if(items.get(item) - quantity > 0) {
            items.replace(item, items.get(item) - quantity);
            currentLoad -= quantity;
            return true;
        }
        items.remove(item);
        return true;
    }
    public boolean isFull() {
        return currentLoad>=capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void changeCapacity(int newCapacity) {
        if(newCapacity <= 0) return;
        if(newCapacity > this.capacity) {
            this.capacity = newCapacity;
            return;
        }
        this.capacity = newCapacity;
        int difference = newCapacity - currentLoad;

        for(String key: items.keySet()) {
            if(items.get(key) > difference) {
                items.replace(key, items.get(key)-difference);
                currentLoad -= difference;
                return;
            }

            currentLoad -= items.remove(key);
            items.remove(key);
            if (items.get(key) == difference)
                return;
        }
    }
}
