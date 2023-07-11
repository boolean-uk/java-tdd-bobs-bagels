package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Basket {

    List<Bagel> bagels = new ArrayList<>();

    public void add(Bagel bagel) {
        this.bagels.add(bagel);
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
