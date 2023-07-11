package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Basket {
    int capacity = 5;

    List<Bagel> bagels = new ArrayList<>();

    public Basket() {

    }

    public Basket(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        this.capacity = capacity;
    }

    public boolean addBagel(Bagel bagel) {
        if (isFull()) {
            return false;
        }
        this.bagels.add(bagel);
        return true;
    }

    private boolean isFull() {
        return this.bagels.size() == capacity;
    }

    public boolean removeBagel(UUID id) {
        Bagel bagel = bagels.stream().filter(x -> x.id.equals(id)).findFirst().orElse(null);
        if (bagel == null) {
            return false;
        }
        bagels.remove(bagel);
        return true;
    }

    public boolean changeCapacity(int newCapacity) {
        if (newCapacity <= 0 || newCapacity < bagels.size()) {
            return false;
        }
        capacity = newCapacity;
        return true;
    }

    static class Bagel {
        UUID id;
        BagelType bagelType;


        public Bagel(BagelType bagelType) {
            id = UUID.randomUUID();
            this.bagelType = bagelType;
        }
    }

    enum BagelType {
        CLASSIC, EGG, BANANA, BLUEBERRY
    }

}
