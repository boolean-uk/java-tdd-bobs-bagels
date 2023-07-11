package com.booleanuk.core;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private int capacity;
    private List<String> items;

    public Basket(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        if (items.size() >= capacity) {
            throw new RuntimeException("Basket is full");
        }
        items.add(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public void removeItem(String item) {
        if (!items.contains(item)) {
            throw new RuntimeException("Item isn't found in the basket");
        }
        items.remove(item);
    }
}