package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<Bagel, Integer> itemList;
    int capacity = 10;
    int items;

    public Basket(){
        itemList = new HashMap<>();
        items = 0;
    }

    public void add(Bagel bagel){

        if (items < capacity){

            for (Bagel item: itemList.keySet()){
                if (bagel.getClass().equals(item.getClass())){
                    int number = itemList.get(item) + 1;
                    itemList.put(item, number);
                    items++;
                    return;
                }
            }
            itemList.put(bagel, 1);
            items++;
        } else {
            System.out.println("Your cart is full.");
        }
    }

    public void remove(Bagel bagel){
        for (Bagel item: itemList.keySet()){
            if (bagel.getClass().equals(item.getClass())){
                int number = itemList.get(item) - 1;
                if (number == 0){
                    itemList.remove(item);
                } else {
                    itemList.put(item, number);
                }
                items--;
                return;
            }
        }

        System.out.println("This item is not in the cart.");

    }

    public void updateCapacity(int capacity){
        this.capacity = capacity;

        if (capacity < items){
            itemList = new HashMap<>();
            items = 0;
            System.out.println("The capacity has been updated. Cart can only hold " + capacity + " items. Your cart has been reset.");
        }
    }

}
