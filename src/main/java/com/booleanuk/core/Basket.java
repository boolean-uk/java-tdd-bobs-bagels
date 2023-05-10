package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> bagels;
    int basketCapacity;

    public Basket() {
        this.bagels = new ArrayList<>();
        this.basketCapacity = 3;
    }

    public boolean addBagel(String bagelType){
        if (this.bagels.size() < this.basketCapacity){
            this.bagels.add(bagelType);
            return true;
        }
        System.out.println("Basket is full, could not add bagel!");
        return false;
    }

    public boolean removeBagel(String bagelType){

        return true;
    }
}
