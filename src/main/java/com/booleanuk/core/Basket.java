package com.booleanuk.core;

import lombok.Getter;

@Getter
public class Basket {
    private Bagel[] bagels;

    public Basket(int capacity) {
        bagels = new Bagel[capacity];
    }

    public void addBagel(Bagel bagel) {
        // TODO
    }

    public void removeBagel(Bagel bagel) {
        // TODO
    }

    public void resize(int capacity) {
        // TODO
    }
}
