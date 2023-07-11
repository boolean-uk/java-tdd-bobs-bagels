package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    private HashMap<String, Integer> items;
    private int capacity;
    private int currentLoad;
    public Basket(int capacity){
        this.items = new HashMap<>();
        this.capacity = capacity;
        this.currentLoad = 0;

    }

    public String addItem(String item, int quantity){

        if (capacity-currentLoad>=quantity){
            currentLoad+=quantity;
            items.put(item,quantity);
            return "Added item to basket, you can add " + String.valueOf(capacity-currentLoad) + " items more";
        }
        return "Basket is full";
    }

}
