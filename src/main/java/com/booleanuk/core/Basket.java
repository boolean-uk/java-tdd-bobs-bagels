package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    private ArrayList<String> items;
    private int capacity;


    public Basket(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }


    public boolean isFull() {
        return items.size() >=capacity;

    }


    public boolean addBagel(String bagel){
        if (isFull()) {
            return false;
        }

        if (items.contains(bagel)){
            return false;
        }

        items.add(bagel);
        return true;
    }

    public boolean removeBagel(String bagel){
        if (items.contains(bagel)) {
            items.remove(bagel);
            return true;
        }

        return false;
    }


    public boolean checkDuplicates(String bagel) {
        return items.contains(bagel);
    }


}


