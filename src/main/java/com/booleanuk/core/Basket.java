package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    public int capacity;
    public int bagelsInBasket;

    public ArrayList<String> basketList;

    public Basket() {
        this.capacity = 5;
        this.bagelsInBasket = 0;
        this.basketList = new ArrayList<>(this.capacity);
    }

    public boolean addBagel(String bagel) {
        if (this.bagelsInBasket < this.capacity) {
            this.basketList.add(bagel);
            this.bagelsInBasket++;
            return true;
        }
        return false;
    }

    public boolean removeBagel(String bagel) {
        return false;
    }
}
