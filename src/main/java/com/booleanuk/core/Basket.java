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
        this.capacity = capacity;
    }

    public boolean add(Bagel bagel) {
        if (this.bagels.size() == capacity) {
            return false;
        }
        this.bagels.add(bagel);
        return true;
    }

    public boolean remove(UUID id) {
        Bagel bagel = bagels.stream().filter(x -> x.id.equals(id)).findFirst().orElse(null);
        if (bagel == null) {
            return false;
        }
        this.bagels.remove(bagels.indexOf(bagel));
        return true;
    }

    static class Bagel {
        UUID id;
        BagelType bagelType;


        public Bagel(BagelType bagelType) {
            this.id = UUID.randomUUID();
            this.bagelType = bagelType;
        }
    }

    enum BagelType {
        CLASSIC, EGG, BANANA, BLUEBERRY
    }

}
