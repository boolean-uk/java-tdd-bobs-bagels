package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> basket;
    public Basket(){
        this.basket = new ArrayList<>();
    }

    public boolean addBagel(String bagel) {
        if (this.basket.contains(bagel)){
            return false;
        }
        return this.basket.add(bagel);
    }
}
