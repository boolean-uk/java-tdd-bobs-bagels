package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> bagelBasket;

    int bagelSize;

    public Basket(int bagelSize) {
        this.bagelSize = bagelSize;
        this.bagelBasket = new ArrayList<>();
    }

    public boolean addToBasket(String bagelType) {
        if (bagelBasket.size() >= this.bagelSize) {
            System.out.println("Basket is full" + " " + bagelBasket.size());
            return false;
        }
        this.bagelBasket.add(bagelType);  //return this.bagelBasket.add(bagelType); same method
        System.out.println("Basket is not full" + " " + bagelBasket.size());
        return true;
    }

    public boolean removeFromBasket(String bagelType) {
        this.bagelBasket.remove(bagelType);
        System.out.println("removed bagel from basket" + " " + bagelBasket.size());
        return true;
    }
}









