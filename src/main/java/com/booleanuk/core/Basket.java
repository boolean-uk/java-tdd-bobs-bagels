package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class Basket {

    HashMap<String, Integer> items;
    int maxCapacity;

    public Basket(){
        this.items = new HashMap<>();
        this.maxCapacity = 3;
    }

    public String add(String bagel, int amount){

        this.items.put(bagel, amount);
        return "";
    }
}
