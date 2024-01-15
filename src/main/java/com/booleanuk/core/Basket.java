package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Bagel> items;
    private int capacity;

    public Basket(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;

        if (capacity < 0) {
            this.capacity = 0;
        }
    }

    public boolean addBagel(Bagel bagel) {
        if (checkCapacity() <= 0) {
           return false;
        } else {
            items.add(bagel);
            return true;
        }
    }

    public boolean removeBagel(Bagel bagel) {
        if (!this.items.contains(bagel)) {
            return false;
        } else {
            this.items.remove(bagel);
            return true;
        }
    }


    public int checkCapacity() {
        System.out.println(getCapacity() - getItems().size());
        return getCapacity() - getItems().size();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Bagel> getItems() {
        return items;
    }

    public void setCapacity(int newCapacity) {

    }

    public static void main(String[] args) {

    }
}
