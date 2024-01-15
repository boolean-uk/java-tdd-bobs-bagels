package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<String> basket;

    public Basket() {
        this.basket = new ArrayList<>();
    }

    public boolean add(String bagel) {
        return basket.add(bagel);
    }

    public ArrayList<String> getBasket() {
        return basket;
    }
}
