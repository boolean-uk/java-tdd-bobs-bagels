package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<Bagel, Integer> itemList;
    int capacity = 10;

    public Basket(){
        itemList = new HashMap<>();
    }

    public void add(Bagel bagel){
        if (itemList.size() < capacity){
            itemList.put(bagel, 1);
        } else {
            System.out.println("Your cart is full.");
        }
    }

    public void remove(Bagel bagel){
        if (!itemList.containsKey(bagel)){
            System.out.println("This item is not in the cart.");
        }
        itemList.remove(bagel);
    }

    public void updateCapacity(int capacity){
        this.capacity = capacity;
    }

}
