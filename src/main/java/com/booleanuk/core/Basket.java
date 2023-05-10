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
        return true;
    }

}
