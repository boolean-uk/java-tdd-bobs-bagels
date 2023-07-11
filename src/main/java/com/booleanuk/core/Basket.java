package com.booleanuk.core;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Getter
public class Basket {
    private List<Bagel> bagels;
    private int capacity;
    private int idx = 0;

    public Basket(int capacity) {
        bagels = new ArrayList<>(capacity);
        this.capacity = capacity;
    }

    public void addBagel(Bagel bagel) {
        if (bagels.size() >= capacity) {
            throw new IllegalStateException("Cannot add any more bagels - basket is full");
        }

        bagels.add(bagel);
    }

    public void removeBagel(Bagel bagel) {
        if (!bagels.contains(bagel)) {
            throw new NoSuchElementException(String.format("Cannot remove bagel: %s - it's not in the basket", bagel));
        }

        bagels.remove(bagel);
    }

    public void resize(int capacity) {
        if (bagels.size() > capacity) {
            throw new IllegalArgumentException(String.format("Basket cannot be smaller than amount of items it contains [%d]", bagels.size()));
        }

        this.capacity = capacity;
    }
}
