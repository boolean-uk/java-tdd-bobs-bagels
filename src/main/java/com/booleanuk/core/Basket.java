package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
ArrayList<String> bagelBasket;

int bagelSize;

    public Basket(int bagelSize) {
        this.bagelSize = bagelSize;
        this.bagelBasket = new ArrayList<>();
    }

    public boolean addToBasket(String bagelType) {
        if (bagelBasket.size() >= this.bagelSize) {
            System.out.println("Basket is full");
            return false;
        }
        this.bagelBasket.add(bagelType);  //return this.bagelBasket.add(bagelType); same method
        System.out.println("Basket is not full");
        return true;
    }
}









