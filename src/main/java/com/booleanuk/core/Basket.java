package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public boolean add(String bagel) {
        this.items.add(bagel);
        return true;
    }

}
