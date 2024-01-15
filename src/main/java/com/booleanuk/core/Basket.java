package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<Bagel, Integer> itemList;

    public Basket(){
        itemList = new HashMap<>();
    }

    public void add(Bagel bagel){
        itemList.put(bagel, 1);
    }

    public void remove(Bagel bagel){
        itemList.remove(bagel);
    }

}
