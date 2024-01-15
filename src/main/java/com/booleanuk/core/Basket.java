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
        if (!itemList.containsKey(bagel)){
            System.out.println("This item is not in the cart.");
        }
        itemList.remove(bagel);
    }

}
