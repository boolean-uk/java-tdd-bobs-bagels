package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Bagel> bagels;

    public Basket() {
        this.bagels = new ArrayList<>();
    }

    public Basket(int capacity) {
        this.bagels = new ArrayList<>(capacity);
    }

    public void addBagel(Bagel bagel) {
        bagels.add(bagel);
    }

    public int getSize() {
        return bagels.size();
    }

    public boolean containsBagel(Bagel bagel) {
        return bagels.contains(bagel);
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