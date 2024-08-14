package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    public Map<String, Integer> items;
    public int max = 5;

    public Basket() {
        this.items = new HashMap<>();
    }

    public void addBagel(String type, int quantity) {
        this.items.put(type, quantity);
    }

    public boolean removeBagel(String key) {
        if (items.get(key) != null) {
            items.remove(key);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean hasCapacity() {
        int totalItemsInBasket = 0;
        for (Map.Entry<String, Integer> item : items.entrySet()) {
            totalItemsInBasket += item.getValue();
        }
        return totalItemsInBasket < max;
    }

    public void changeBasketCapacity(int limit) {
        this.max = limit;
    }

}
