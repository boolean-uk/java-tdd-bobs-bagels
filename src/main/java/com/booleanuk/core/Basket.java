package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> bagels;

    public Basket() {
        this.bagels = new ArrayList<>();
    }

    public boolean addBagel(String type) {
        return bagels.add(type);
    }
}
