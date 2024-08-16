//Basket.java
package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    public ArrayList<String> baskets;
    private int capacity;

    public Basket() {

        this.baskets = new ArrayList<>();
        this.capacity = 2;

    }

    public boolean add(String bagel) {

        if (this.baskets.size() < this.capacity) {

            return this.baskets.add(bagel);

        }

        return false;
    }

    public boolean remove(String bagel) {

        return this.baskets.remove(bagel);

    }

    public boolean IsFull() {

        return this.baskets.size() >= this.capacity;

    }

    public void setCapacity(int capacity) {

        if (capacity > 0) {

            this.capacity = capacity;

        }
    }

    public int removeBagel(String bagel) {

        if (this.baskets.contains(bagel)) {

            this.baskets.remove(bagel);
            return 1;

        } else {

            return -1;

        }
    }

}
