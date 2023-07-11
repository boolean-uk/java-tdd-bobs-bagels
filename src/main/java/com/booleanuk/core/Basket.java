package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    private static final int DEFAULT_CAPACITY = 10;

    private ArrayList<Bagel> bagels;
    private int capacity;

    public Basket() {
        this.capacity = DEFAULT_CAPACITY;
        this.bagels = new ArrayList<>();
    }

    public Basket(int capacity) {
        this.capacity = capacity;
        this.bagels = new ArrayList<>(capacity);
    }

    public void addBagel(Bagel bagel) {
        bagels.add(bagel);
        capacity--;

        if (getSize() > capacity) {
            bagels.remove(bagel);
        }

    }

    public int getSize() {
        return bagels.size();
    }

    public boolean containsBagel(Bagel bagel) {
        return bagels.contains(bagel);
    }

    public boolean removeBagel(Bagel bagel) {
        capacity++;
        return bagels.remove(bagel);
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

class Bagel {
    private String type;

    public Bagel(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}